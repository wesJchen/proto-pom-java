package com.pages.wesjchen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    
    WebDriver driver;

    //page elements
    @FindBy(xpath = "//img[@aria-label='SiteHome']")
    WebElement HomeButtonLink;

    @FindBy(xpath = "//div[@title='Show sidebar']")
    WebElement SideBarHamburger;

    @FindBy(xpath = "//a[contains(.,'Portfolio')]")
    WebElement PortfolioLink;

    @FindBy(xpath = "//a[contains(.,'Test Automation')]")
    public WebElement TestAutomationLink;


    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //methods

    // Page Actions
    public void clickHomeButtonLink() {
        HomeButtonLink.click();
    }

    public void clickPortfolioLink() {
        PortfolioLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(TestAutomationLink));

    }

        

}
