package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class issuesPageObjects extends homePageObjects{

    public String issuesPageUrl = "https://www.redmine.org/projects/redmine/issues";

    @FindBy(id = "add_filter_select")
    public WebElement addFilterDropdown;

    @FindBy(id = "cb_author_id")
    public WebElement chbAuthor;


    @FindBy(xpath = "//h2")
    public WebElement issuesHeader;

    public void checkUrl(String url){
        assertions.assertEquals(url,driver.getCurrentUrl());
    }

    public void selectDropdownValue(){
      addFilterDropdown.click();
      Select select = new Select(addFilterDropdown);
      select.selectByValue("author_id");
    }
     public void isElementVisible(){
       new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated((By) chbAuthor));
     }

    public void checkIssuesHeaderElementText(String text){
     String elementText = driver.findElement((By) issuesHeader).getText();
     assertions.assertEquals(text,elementText);
    }
}
