package model.applicationModule;

import java.util.Hashtable;

import model.DynamicEnvInfoProvider;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ApplicationModuleHandle;
import oracle.jbo.client.Configuration;
import oracle.jbo.common.ampool.EnvInfoProvider;

public class AppModuleAMFixture {
    private static AppModuleAMFixture fixture1 = new AppModuleAMFixture();
    private ApplicationModule _am;

    private AppModuleAMFixture() {
        
        EnvInfoProvider provider = new DynamicEnvInfoProvider("labor","labor");
                       
        
        _am = Configuration.createRootApplicationModule("model.AppModule", "AppModuleLocal",provider);
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public static AppModuleAMFixture getInstance() {
        return fixture1;
    }

    public void release() throws Exception {
        Configuration.releaseRootApplicationModule(_am, true);
    }

    public ApplicationModule getApplicationModule() {
        return _am;
    }
}