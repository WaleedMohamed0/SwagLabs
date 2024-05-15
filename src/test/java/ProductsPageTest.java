import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest{
    @Test
    public void testAddToCart()
    {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCart();
        productsPage.clickOnCart();
        productsPage.clickOnCheckout();
    }
}
