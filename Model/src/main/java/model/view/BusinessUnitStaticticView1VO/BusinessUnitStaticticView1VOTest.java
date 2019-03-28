package model.view.BusinessUnitStaticticView1VO;

import model.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class BusinessUnitStaticticView1VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public BusinessUnitStaticticView1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("BusinessUnitStaticticView1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
