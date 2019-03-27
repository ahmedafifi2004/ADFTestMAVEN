package model;

import java.util.Hashtable;
import oracle.jbo.common.ampool.EnvInfoProvider;
import oracle.jbo.client.Configuration;

public class DynamicEnvInfoProvider  implements EnvInfoProvider  {
  
    private final String un;
      private final String upw;

      public DynamicEnvInfoProvider(String uname, String upassword)               
      {
         un = uname;
         upw = upassword;
      }

      public Object getInfo(String info, Object connEnvironment)
      {
        if(un != null)                                                               
        {
          ((Hashtable)connEnvironment).put(Configuration.DB_USERNAME_PROPERTY, un); 
        }
        if(upw != null)                                                             
        {
          ((Hashtable)connEnvironment).put(Configuration.DB_PASSWORD_PROPERTY, upw); 
        }
        return null;                                                                           
      }

      public void modifyInitialContext(Object p0)
      {
      }

      public int getNumOfRetries()
      {
        return 0;
      }
}