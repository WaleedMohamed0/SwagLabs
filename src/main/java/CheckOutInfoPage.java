import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutInfoPage extends Base {
    public CheckOutInfoPage(WebDriver driver) {
        super(driver);
    }

    By firstName = By.id("first-name"),
            lastName = By.id("last-name"),
            postalCode = By.id("postal-code"),
            continueBtn = By.id("continue"),
            finishBtn = By.id("finish");

    public void enterFirstName(String firstName) {
        sendKeys(this.firstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeys(this.lastName, lastName);
    }

    public void enterPostalCode(String postalCode) {
        sendKeys(this.postalCode, postalCode);
    }

    public void clickOnContinueBtn() {
        clickOnBtn(continueBtn);
    }
    public void clickOnFinishBtn() {
        clickOnBtn(finishBtn);
    }
}
