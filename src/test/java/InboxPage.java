import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class InboxPage extends PageBase {

    private By selectAllBy = By.xpath("//p[@class='actions-bar']//input[@name='alert[]']");
    private By markReadBy = By.xpath("//p[@class='actions-bar']//a[@class='button outline read']");
    
    public InboxPage(WebDriver driver) {
        super(driver);
    }
    
    public void markAllRead(){
        this.waitAndReturnElement(selectAllBy).click();
        this.waitAndReturnElement(markReadBy).click();
    }
  
}
