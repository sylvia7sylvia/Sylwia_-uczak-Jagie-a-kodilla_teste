package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayPage {
    private ChromeDriver driver;

    public EBayPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public void navigate() {
        driver.get("https://www.ebay.com/");
    }

    public void clickIagree() {
        try {
            WebElement iAgreeBtn = driver.findElementById("gdpr-banner-accept");
            System.out.println("Button text " + iAgreeBtn.getText());
            iAgreeBtn.click();
        } catch (Exception e) {
            System.err.println("BUTTON NOT FOUND " + e.getLocalizedMessage());
        }
    }

    public void searchFor(String text) {
        WebElement searchTextBox = driver.findElement(By.name("_nkw"));
        searchTextBox.click();
        searchTextBox.sendKeys(text);
        searchTextBox.sendKeys(Keys.ENTER);
    }
}
