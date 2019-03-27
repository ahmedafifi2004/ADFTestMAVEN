package model.view.BusinessUnitInfoView1VO;

import model.applicationModule.AppModuleAMFixture;

import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class BusinessUnitInfoView1VOTest {
    private AppModuleAMFixture fixture1 = AppModuleAMFixture.getInstance();

    public BusinessUnitInfoView1VOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("BusinessUnitInfoView1");
        assertNotNull(view);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
