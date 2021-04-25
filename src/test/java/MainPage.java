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


class MainPage extends PageBase {


    private By loginButtonBy = By.xpath("//div[@class='container-1260 with-inside-padding']//button[@class='button']");
    private By cookiesButtonBy = By.xpath("//div//button[@id='onetrust-accept-btn-handler']");
    private By loginSendBy = By.xpath("//form//button[@class='button wide']");
    private By usernameFieldBy = By.xpath("//form//input[@id='login-username']");
    private By passFieldBy = By.xpath("//form/input[@name='password']");
    private By logoutBy = By.xpath("//body[@id='theTop']/header/div/div/form/button");

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.eurogamer.net/");
    }    

    public void acceptCookies(){
        this.waitAndReturnElement(cookiesButtonBy).click();
    }
    
    public void login(){
        this.waitAndReturnElement(loginButtonBy).click();
        this.waitAndReturnElement(usernameFieldBy).sendKeys("SeleBot1244");
        this.waitAndReturnElement(passFieldBy).sendKeys("Assignment00");
        this.waitAndReturnElement(loginSendBy).click();
    }

    public void logout(){
        this.waitAndReturnElement(logoutBy).click();
    }   
}