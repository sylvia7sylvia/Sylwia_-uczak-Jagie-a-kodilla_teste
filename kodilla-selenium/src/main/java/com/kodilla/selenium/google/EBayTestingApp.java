package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.switchTo().frame(0);
        clickIagree(driver);
        searchFor(driver, "Notebook");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("TEST PASSED");
        driver.close();
    }

    private static void searchFor(ChromeDriver driver, String text) {   //DLACZEGO to nie działa???
//        WebElement searchTextBox = driver.findElementByXPath("//*[@id=\"gh-ac\"]");
        WebElement searchTextBox = driver.findElement(By.name("_nkw"));
        searchTextBox.click();
        searchTextBox.sendKeys(text);
        searchTextBox.sendKeys(Keys.ENTER);
    }

    private static void clickIagree(ChromeDriver driver) { //DLACZEGO to nie działa???
        String iAgreeText = "Accept";
        try {
            WebElement iAgreeBtn = driver.findElementByName("gdpr-banner-accept" + iAgreeText + "')]");
            //WebElement iAgreeBtn = driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]" + iAgreeText));
            System.out.println("Button text " + iAgreeBtn.getText());
            iAgreeBtn.click();
        } catch (Exception e) {
            System.err.println("BUTTON NOT FOUND " + e.getLocalizedMessage());
            driver.close();
        }
    }
}
