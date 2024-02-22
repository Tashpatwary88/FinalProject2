import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DogPage extends BasePage {
    private By poodleCheckbox = By.xpath("//input[@value='Poodle']");
    private By dalmationCheckbox = By.xpath("//input[@value='Dalmation']");
    private By addToCartButton = By.xpath("//input[@value='Add to Cart']");
    private By cartLink = By.linkText("Cart");

    public DogPage(WebDriver driver) {
        super(driver);
    }

    public void selectDog(String dog) {
        if (dog.equalsIgnoreCase("Poodle")) {
            click(poodleCheckbox);
        } else if (dog.equalsIgnoreCase("Dalmation")) {
            click(dalmationCheckbox);
        } else {
            throw new IllegalArgumentException("Invalid dog: " + dog);
        }
        click(addToCartButton);
    }

    public CartPage navigateToCartPage() {
        click(cartLink);
        return new CartPage(driver);
    }
}
