package com.pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    WebDriver driver;

    // Page elements
    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(id="placeholder")
    WebElement placeholder;

    // Constructor
    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page actions
    public void navigateToGoogle() {
        driver.get("https://www.google.com");
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void enterSearchText(String searchText) {
        searchBox.sendKeys(searchText);
    }

    public void searchFor(String searchText) {
        enterSearchText(searchText);
        clickSearchButton();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}