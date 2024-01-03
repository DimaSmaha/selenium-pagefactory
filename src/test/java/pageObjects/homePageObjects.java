package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePageObjects extends commonPageObjects {

    public String redmineHomeLink = "https://www.redmine.org/";
    public String redmineBookLink = "https://www.packtpub.com/product/mastering-redmine-second-edition/9781785881305";

    @FindBy(className = "register")
    public WebElement registerBtn;

    @FindBy(className = "login")
    public WebElement loginBtn;

    @FindBy(className = "issues")
    public WebElement issuesBtn;

    @FindBy(css = "h3~p>a[href=\"/projects/redmine/wiki/Guide\"]")
    public WebElement usersGuideBtn;

    @FindBy(xpath = "//td[1]/a/img")
    public WebElement redmineBook;

    public void clickIssuesBtn(){
        issuesBtn.click();
    }

    public void clickRedmineBookBtn(){
        redmineBook.click();
    }

}
