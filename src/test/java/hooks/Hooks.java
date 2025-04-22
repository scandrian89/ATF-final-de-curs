package hooks;

import Page.AbstractPage;
import Util.Singleton;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import stepDefinition.AbstractStepDef;

import static Actions.Action.takeScreenshot;

public class Hooks extends AbstractStepDef {
    private static final Logger log = LogManager.getLogger(Hooks.class);

    @Before("@UI")
    public void beforeUITest() {
        driver = Singleton.getDriver();
        driver.manage().window().maximize();
    }

    @After("@UI")
    public void afterUITest() {
        Singleton.closeDriver();
    }

    @AfterStep("@UI")
    public void takeScreenShot(Scenario scenario) {
        log.info("take a screenshot before stept");
        takeScreenshot(scenario, driver);
    }
//
//    @Before("@Excel")
//    public void startExcel() {
//        log.info("start connection to Excel file");
//        new ExcelUtil().connectioToExcelFile();
//        testData FromExcelFile();
//    }
}
