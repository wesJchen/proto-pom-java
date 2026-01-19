package com.test;

import com.base.BaseTest;
import com.pages.wesjchen.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PortfolioTest extends BaseTest {

    @Test(groups="general")
    public void VerifySideBar() {
        driver.get("https://www.wesjchen.com");

        // Arrange
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home";

        HomePage HomePage = new HomePage(driver);
        waitForPageLoad(3);

        //Act
        HomePage.clickPortfolioLink();

        //Assert
        Assert.assertTrue(HomePage.TestAutomationLink.isDisplayed(), "Test Automation link is not displayed after clicking Portfolio!");
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");




    }

    

}
