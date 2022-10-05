package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilePage {

    private WebDriver driver;
    private  By inputField = By.id("file-upload");
    private  By uploadButton = By.id("file-submit");

    public FilePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides the full path file for the form
     * @param absolutePathFile
     */
    public void uploadFile(String absolutePathFile){
        driver.findElement(inputField).sendKeys(absolutePathFile);
        clickUploadButton();
    }
}
