package base;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import java.util.List;

public class baseTest {
    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureAreaPage secureAreaPage;
    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.quit();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        secureAreaPage = new SecureAreaPage(driver);

    }

    public static void main(String[] args) {
        baseTest test = new baseTest();
        test.setUp();
    }
}
