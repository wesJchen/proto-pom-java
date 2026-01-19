package com.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    
    WebDriver driver;

    // Page Elements
    @FindBy(id = "nav-cart")
    WebElement cartButton;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'results for')]")
    public WebElement searchResults;


    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Actions
    public String getTitle() {
        return driver.getTitle();
    }

    public void clickCart() {
        cartButton.click();
    }

}