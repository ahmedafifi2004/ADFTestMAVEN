package model;

import model.applicationModule.AppModuleAMFixture;

import model.view.BusinessUnitInfoView1VO.BusinessUnitInfoView1VOTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BusinessUnitInfoView1VOTest.class })
public class AllAppModuleTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        AppModuleAMFixture.getInstance().release();
    }
}
