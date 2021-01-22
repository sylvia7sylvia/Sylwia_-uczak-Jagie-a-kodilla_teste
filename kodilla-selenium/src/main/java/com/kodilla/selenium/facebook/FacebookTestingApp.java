package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        iAgree(driver);

        WebElement yearCombo = driver.findElement(By.xpath("//select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }

    public static void iAgree(ChromeDriver driver){
        WebElement iAgreeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        iAgreeButton.click();
    }

}
