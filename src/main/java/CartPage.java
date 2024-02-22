import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By cartEntries = By.xpath("//table[@class='CartContents']//tr[@class='LineItem']");
    private By checkoutButton = By.xpath("//input[@value='Proceed to Checkout']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfItems() {
        return driver.findElements(cartEntries).size();
    }

    public void proceedToCheckout() {
        click(checkoutButton);
    }
}
