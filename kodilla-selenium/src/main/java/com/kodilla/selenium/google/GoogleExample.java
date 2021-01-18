package com.kodilla.selenium.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        ((ChromeDriver) driver).findElementByXPath("//span[contains (text(),'Zgadzam')]").click();
        System.out.println();
    }
}
