import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
    WebDriver driver;
    public Base(WebDriver driver) {
        this.driver = driver;
    }
    public void sendKeys(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }
    public void clickOnBtn(By element) {
        driver.findElement(element).click();
    }
}
