package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.issuesPageObjects;

import java.net.MalformedURLException;

public class dropdownTest extends pageObjects.issuesPageObjects{
    String username = "babalen";
    String password = "qwerty";

    @BeforeEach
    public void openBrowser() throws MalformedURLException {
        start();
    }

    @AfterEach
    public void closeBrowser(){
        finish();
    }

    @Test
    public void dropdownTest(){
        issuesPageObjects issuesPage = PageFactory.initElements(driver, issuesPageObjects.class);
        openWebsite();
        issuesPage.clickIssuesBtn();
        issuesPage.selectDropdownValue();
        issuesPage.isElementVisible();
    }
}
