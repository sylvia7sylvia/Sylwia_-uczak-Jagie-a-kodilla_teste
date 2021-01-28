package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        iAgree(driver);
        searchFor(driver);
        //driver.close();
    }

    public static void iAgree(ChromeDriver driver) {
        WebElement iAgreeButton = driver.findElement(By.xpath("//button[@type='button' and text()='Ok, zgadzam się']"));
        iAgreeButton.click();
    }

    public static void searchFor(ChromeDriver driver) throws InterruptedException {
        WebElement searchForTextBox = driver.findElement(By.name("string"));
        searchForTextBox.click();
        searchForTextBox.sendKeys("Mavic mini");
        TimeUnit.SECONDS.sleep(3);
        WebElement categoryBox = driver.findElement(By.xpath("//select[@aria-label='Kategoria i opcje wyszukiwania']"));
        Select categoryBoxSelect = new Select(categoryBox);
        categoryBoxSelect.selectByIndex(3);
        TimeUnit.SECONDS.sleep(3);
        WebElement szukajButton = driver.findElement(By.xpath("//button[@type='submit']"));
        szukajButton.click();

    }
}