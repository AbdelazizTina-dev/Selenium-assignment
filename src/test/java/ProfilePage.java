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
import org.openqa.selenium.Keys;

class ProfilePage extends PageBase {

    private By editProfileBy = By.xpath("//div//a[@href='profiles/SeleBot1244/edit']");
    private By nameFieldBy = By.xpath("//form//input[@name='realname']");
    private By saveEditBy = By.xpath("/html/body/div[1]/div/main/div[1]/div[1]/div/div[2]/form[1]/button");
    
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    
    public void editName(){
        this.waitAndReturnElement(editProfileBy).click();
        this.waitAndReturnElement(nameFieldBy).sendKeys(Keys.CONTROL + "a");
        this.waitAndReturnElement(nameFieldBy).sendKeys(Keys.DELETE);
        this.waitAndReturnElement(nameFieldBy).sendKeys("Sele Bot Master");
        this.waitAndReturnElement(saveEditBy).click();
    }
  
}
