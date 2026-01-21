package com.test;

import com.base.BaseTest;
import com.pages.wesjchen.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PortfolioTest extends BaseTest {

    @Test //(groups="general")
    public void VerifyPortfolioSideBar() {
        driver.get("https://www.wesjchen.com");

        // Arrange
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home";

        // Verify HomePage of portfolio is accessible
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match page");

        HomePage HomePage = new HomePage(driver);
        waitForPageLoad(2);

        //Act
        HomePage.clickPortfolioLink();

        //Assert
        Assert.assertTrue(HomePage.isTestAutomationLinkDisplayed(), "Test Automation Link not displayed after clicking Portfolio");
        Assert.assertTrue(HomePage.isDataLinkDisplayed(), "Data link is not displayed");
        Assert.assertTrue(HomePage.isDevelopmentLinkDisplayed(), "Development link is not displayed");
    }

    @Test(groups="general")
    public void VerifyAboutLoad() {
        driver.get("https://www.wesjchen.com");

        // Arrange
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home";

        // Verify HomePage of portfolio is accessible
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match page");

        HomePage HomePage = new HomePage(driver);
        waitForPageLoad(3);

        //Act
        HomePage.clickAboutLink();

        //Assert
        Assert.assertTrue(HomePage.isCurriculumVitaeLinkDisplayed(), "CV Link not displayed after clicking Portfolio");
        Assert.assertTrue(HomePage.isContactLinkDisplayed(), "Contact link is not displayed");


    }

    

}
