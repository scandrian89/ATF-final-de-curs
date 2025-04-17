package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import Util.PropretyLoader;
import org.openqa.selenium.WebDriver;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
    public HomePage homePage =new HomePage(driver);
    protected static String chromeDriver= PropretyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl=PropretyLoader.loadProperty("loginPageUrl");
    public static String excelFilePath=PropretyLoader.loadProperty("excelFilePath");
    public static String excelSheet=PropretyLoader.loadProperty("excelSheet");
    public static String autoItUploadFileSite=PropretyLoader.loadProperty("autoItUploadFileSite");
    public static String restAssuredBaseURL=PropretyLoader.loadProperty("restAssuredBaseURL");
}




