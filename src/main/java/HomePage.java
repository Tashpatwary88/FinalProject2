import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By dogLink = By.linkText("Dogs");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DogPage navigateToDogPage() {
        click(dogLink);
        return new DogPage(driver);
    }
}
