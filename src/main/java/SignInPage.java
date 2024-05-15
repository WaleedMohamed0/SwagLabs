import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    By userName = By.id("user-name"),
            password = By.id("password"),
            signInBtn = By.id("login-button");
    public void enterUserName(String userName) {
        sendKeys(this.userName, userName);
    }
    public void enterPassword(String password) {
        sendKeys(this.password, password);
    }
    public void clickOnSignInBtn() {
        clickOnBtn(signInBtn);
    }
}
