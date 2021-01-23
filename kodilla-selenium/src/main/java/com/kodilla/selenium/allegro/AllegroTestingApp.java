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
        WebElement iAgreeButton = driver.findElement(By.xpath("//html/body/div[3]/div[7]/div/div[2]/div[2]/button[1]"));
        iAgreeButton.click();
    }

    public static void searchFor(ChromeDriver driver) throws InterruptedException {
        WebElement searchForTextBox = driver.findElement(By.xpath("/html/body/div[3]/div[3]/header/div/div/div[1]/div/form/input"));
        searchForTextBox.click();
        searchForTextBox.sendKeys("Mavic mini");
        TimeUnit.SECONDS.sleep(3);
        WebElement categoryBox = driver.findElement(By.xpath("/html/body/div[3]/div[3]/header/div/div/div[1]/div/form/div[3]/div/select"));
        Select categoryBoxSelect = new Select(categoryBox);
        categoryBoxSelect.selectByIndex(3);
        TimeUnit.SECONDS.sleep(3);
        WebElement szukajButton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/header/div/div/div[1]/div/form/button"));
        szukajButton.click();

    }
}