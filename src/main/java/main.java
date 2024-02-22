import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Create instances of the page classes
        HomePage homePage = new HomePage(driver);
        DogPage dogPage = new DogPage(driver);
        CartPage cartPage = new CartPage(driver);

        // Navigate to the JPetStore home page
        homePage.navigateToHomePage();

        // Navigate to the Dog page
        dogPage.navigateToDogPage();

        // Select two dogs (Poodle and Dalmation) and add them to the cart
        dogPage.selectDog("Poodle");
        dogPage.selectDog("Dalmation");

        // Navigate to the Cart page
        dogPage.navigateToCartPage();

        // Validate that two entries are present on the Cart page
        assert cartPage.getNumberOfItems() == 2;

        // Close the browser
        driver.quit();
    }
}
