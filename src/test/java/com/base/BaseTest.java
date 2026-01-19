package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true) // Runs before every @Test method
    public void setup() {
        driver = new ChromeDriver(); // Starts the browser
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true) // Runs after every @Test method
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Closes the browser
        }
    }

    //Helper method for waiting on element visibility
    public void waitForElement(WebElement element, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Helper method for waiting on page loads
    public void waitForPageLoad(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
