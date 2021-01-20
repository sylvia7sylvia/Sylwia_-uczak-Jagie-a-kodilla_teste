package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingAppBis {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Notebook");
        inputField.submit();

        WebElement acceptButton = driver.findElement(By.name("gdpr-banner-accept"));
        acceptButton.click();
    }
}
