package com.kodilla.selenium.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.switchTo().frame(0);
        clickIagree(driver);
        searchFor(driver, "Ala ma kota");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        driver.close();
    }

    private static void searchFor(ChromeDriver driver, String text) {
        WebElement searchTextBox = driver.findElementByName("q");
        searchTextBox.click();
        searchTextBox.sendKeys(text);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    private static void clickIagree(ChromeDriver driver) {
        String iAgreeText = "I agree";
        try {
            WebElement iAgreeBtn = driver.findElementByXPath("//span[contains (text(), '"+ iAgreeText + "')]");
            System.out.println("Button text " + iAgreeBtn.getText());
            iAgreeBtn.click();
        } catch (Exception e) {
            System.err.println("BUTTON NOT FOUND " + e.getLocalizedMessage());
            driver.close();
        }
    }
}
