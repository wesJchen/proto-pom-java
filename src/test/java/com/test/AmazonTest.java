package com.test;

import com.base.BaseTest;
import com.pages.amazon.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    @Test
    public void verifySearchProductResults() {
        // ARRANGE
        driver.get("https://www.amazon.com");

        //implement wait time
        try {
            Thread.sleep(2000); // Wait for 2 seconds to allow page to load
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        AmazonHomePage amazonPage = new AmazonHomePage(driver);

        // ACT
        amazonPage.searchBox.sendKeys("Laptop");
        amazonPage.searchButton.click();

        // implement wait time
        try {
            Thread.sleep(2000); // Wait for 2 seconds after clicking search
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // ASSERT
        Assert.assertTrue(amazonPage.searchResults.isDisplayed(), "Search results are not displayed!");

    }
        
    
}
