package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");

    private By loadingIndicator = By.id("loading");
    private By FinishedLoading = By.id("finish");
    private String linkXpath_Format = ".//a[contains(text(), '$s')";
    private final By linkExample1 = By.xpath(String.format(linkXpath_Format,"Example 1"));
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingPage clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingPage(driver);
    }


    public void clickStartButton(){
        this.driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(FinishedLoading).getText();
    }
}