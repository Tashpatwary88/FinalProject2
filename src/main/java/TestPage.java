import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test {
    private WebDriver driver;
    private HomePage homePage;
    private DogPage dogPage;
    private CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        dogPage = new DogPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testAddDogsToCart() {
        homePage.navigateToDogPage();
        dogPage.selectDog("Poodle");
        dogPage.selectDog("Dalmation");
        dogPage.navigateToCartPage();
        assert cartPage.getNumberOfItems() == 2;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
