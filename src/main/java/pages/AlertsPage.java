package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()= 'Click for JS Alert']");

    public By getResults() {
        return results;
    }

    private By results = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void clickAlertButton(){
        driver.switchTo().alert().accept();
    }
}
