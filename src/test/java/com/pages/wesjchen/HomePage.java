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
    private WebElement HomeButtonLink;

    @FindBy(xpath = "//div[@title='Show sidebar']")
    private WebElement SideBarHamburger;

    @FindBy(xpath = "//a[contains(.,'Portfolio')]")
    private WebElement PortfolioLink;

    @FindBy(xpath = "//a[contains(.,'About')]")
    private WebElement AboutLink;

    @FindBy(xpath = "//a[contains(.,'Test Automation')]")
    private WebElement TestAutomationLink;

    @FindBy(xpath = "//a[contains(.,'Data')]")
    private WebElement DataLink;

    @FindBy(xpath = "//a[contains(.,'Development')]")
    private WebElement DevelopmentLink;

    @FindBy(xpath = "//a[contains(.,'Curriculum Vitae')]")
    private WebElement CurriculumVitaeLink;

    @FindBy(xpath = "//a[contains(.,'Contact')]")
    private WebElement ContactLink;


    // Constructor for web page
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Generic helper method for waiting
    private void waitForVisibility(WebElement element, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Generic helper method to check if element is displayed
    private boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Page Actions
    public void clickHomeButtonLink() {
        HomeButtonLink.click();
    }

    public void clickPortfolioLink() {
        PortfolioLink.click();
        waitForVisibility(TestAutomationLink, 10);
    }

    public void clickAboutLink() {
        AboutLink.click();
        waitForVisibility(CurriculumVitaeLink, 15);
    }

    public void clickAutomationLink() {
        TestAutomationLink.click();
    }


    // Convenience methods to check if links are displayed (using generic helper)
    public boolean isTestAutomationLinkDisplayed() {
        return isElementDisplayed(TestAutomationLink);
    }

    public boolean isDataLinkDisplayed() {
        return isElementDisplayed(DataLink);
    }

    public boolean isDevelopmentLinkDisplayed() {
        return isElementDisplayed(DevelopmentLink);
    }

    public boolean isCurriculumVitaeLinkDisplayed() {
        return isElementDisplayed(CurriculumVitaeLink);
    }

    public boolean isContactLinkDisplayed() {
        return isElementDisplayed(ContactLink);
    }

}
