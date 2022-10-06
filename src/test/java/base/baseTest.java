package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import utils.WindowManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class baseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goToHomePage();

    }

    @BeforeEach
    public void goToHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void closeDriver(){
        driver.quit();
    }
    public static void main(String[] args) {
        baseTest test = new baseTest();
        test.setUp();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
