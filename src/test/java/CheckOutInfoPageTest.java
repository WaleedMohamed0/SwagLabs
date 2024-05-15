import org.testng.annotations.Test;

public class CheckOutInfoPageTest extends BaseTest {
    @Test
    public void testCheckOutInfo() {
        CheckOutInfoPage checkOutInfoPage = new CheckOutInfoPage(driver);
        checkOutInfoPage.enterFirstName("standard_user");
        checkOutInfoPage.enterLastName("secret_sauce");
        checkOutInfoPage.enterPostalCode("12345");
        checkOutInfoPage.clickOnContinueBtn();
        checkOutInfoPage.clickOnFinishBtn();
    }
}
