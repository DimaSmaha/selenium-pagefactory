package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;

public class commonPageObjects {

     public String getRandomString() {
         String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
         StringBuilder salt = new StringBuilder();
         Random rnd = new Random();
         while (salt.length() < 10) { // length of the random string.
             int index = (int) (rnd.nextFloat() * SALTCHARS.length());
             salt.append(SALTCHARS.charAt(index));
         }
         String saltStr = salt.toString();
         return saltStr;
     }

     public WebDriver driver;
     public Assertions assertions;

     public void start() throws MalformedURLException {
         WebDriverManager.chromedriver().clearDriverCache().setup();
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         Dimension dimension = new Dimension(1248, 968);
         driver.manage().window().setSize(dimension);
     }
     public void finish(){
         driver.quit();
     }

     String BaseUrl = "https://www.redmine.org/";
     public void openWebsite(){
         driver.get(BaseUrl);
     }

    //     public void clickElement(By element){
//         driver.findElement(element).click();
//     }
//
//     public void fillElement(By element, String keys){
//         driver.findElement(element).sendKeys(keys);
//     }
//
//     public void checkUrl(String url){
//         assertions.assertEquals(url,driver.getCurrentUrl());
//     }
//
//     public void isElementVisible(By element){
//       new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(element));
//     }
//    public void checkElementText(By element,String text){
//     String elementText = driver.findElement(element).getText();
//     assertions.assertEquals(text,elementText);
//    }
//
//    public void selectDropdownValue(By element,String value){
//      WebElement dropdownElement = driver.findElement(element);
//      dropdownElement.click();
//      Select select = new Select(dropdownElement);
//      select.selectByValue(value);
//    }
//
    public void goBrowserBack(){
         driver.navigate().back();
    }
//
//    /// implicit wait, just stops the driver for x amount of seconds
//    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    /// explicit wait (clever wait), which waits until some element will be clickable/visible or any other stuff
//    /// does not affect the whole driver instance
//    //WebDriverWait wait = new WebDriverWait(driver, 10);
//    // element = wait.until(ExpectedConditions.elementToBeClickable(By.id("element-id")));
}
