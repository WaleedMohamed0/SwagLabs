import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends Base {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack"),
            cartBtn = By.className("shopping_cart_link"),
            checkoutBtn = By.id("checkout");

    public void addToCart() {
        clickOnBtn(addToCartBtn);
    }

    public void clickOnCart() {
        clickOnBtn(cartBtn);
    }
    public void clickOnCheckout() {
        clickOnBtn(checkoutBtn);
    }
}
