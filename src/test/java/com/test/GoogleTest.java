package com.test;

import com.base.BaseTest;
import com.pages.google.GoogleHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test(groups = "general") // This is your actual test case
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        // Assertions check if the test passed or failed
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
    }

    @Test(groups = "general") // Example using Page Object Model
    public void verifyGoogleSearchWithPageObject() {
        driver.get("https://www.google.com");

        // Initialize page object
        GoogleHomePage googlePage = new GoogleHomePage(driver);

        // Use page object methods
        String actualTitle = googlePage.getPageTitle();
        Assert.assertEquals(actualTitle, "Google", "Title does not match!");

        // Example: You can use searchFor method like this:
        // googlePage.searchFor("Selenium");
    }
}