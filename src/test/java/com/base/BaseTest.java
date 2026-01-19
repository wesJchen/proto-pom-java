package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod // Runs before every @Test method
    public void setup() {
        driver = new ChromeDriver(); // Starts the browser
        driver.manage().window().maximize();
    }

    @AfterMethod // Runs after every @Test method
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Closes the browser
        }
    }
}
