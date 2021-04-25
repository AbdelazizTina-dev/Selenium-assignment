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
import java.util.*;  


public class SeleniumTest {
    public WebDriver driver;
    public MainPage mainPage;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        mainPage = new MainPage(this.driver);
    }

    @Test
    public void testTitle(){
        Assert.assertEquals("Eurogamer.net",driver.getTitle());
    }

    @Test
    public void testLogin(){
        mainPage.acceptCookies();
        mainPage.login(); 
        Assert.assertTrue(mainPage.getBodyText().contains("Signed in as SeleBot1244"));
    }

    @Test
    public void testLogout(){
        mainPage.acceptCookies();
        mainPage.login(); 
        mainPage.logout();
        Assert.assertTrue(mainPage.getBodyText().contains("Sign in / Create an account"));
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
