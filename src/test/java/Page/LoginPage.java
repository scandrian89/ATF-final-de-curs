package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends AbstractPage {

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[text()='Time at Work']")
    private WebElement timeAtWorkText;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement invalidCredentials;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
