import org.testng.annotations.Test;

public class SignInPageTest extends BaseTest {
    @Test
    public void signIn() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.enterUserName("standard_user");
        signInPage.enterPassword("secret_sauce");
        signInPage.clickOnSignInBtn();
    }
}
