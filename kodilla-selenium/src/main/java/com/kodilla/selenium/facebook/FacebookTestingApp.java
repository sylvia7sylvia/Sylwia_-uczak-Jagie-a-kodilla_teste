package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        iAgree(driver);
        createNewUser(driver);
        driver.close();
    }

    public static void iAgree(ChromeDriver driver) {
        WebElement iAgreeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        iAgreeButton.click();
    }

    public static void createNewUser(ChromeDriver driver) throws InterruptedException {
        WebElement createNewUserButton = driver.findElement(By.xpath("//*[@id=\"u_0_2\"]"));
        createNewUserButton.click();
        TimeUnit.SECONDS.sleep(3);
        WebElement nameTextBox = driver.findElement(By.xpath("//*[@id=\"u_3_b\"]"));
        nameTextBox.sendKeys("Sylwia");
        TimeUnit.SECONDS.sleep(3);
        WebElement lastNameTextBox = driver.findElement(By.xpath("//*[@id=\"u_3_d\"]"));
        lastNameTextBox.sendKeys("Kowalska");
        TimeUnit.SECONDS.sleep(3);
        WebElement mailAndPhoneTextBox = driver.findElement(By.xpath("//*[@id=\"u_3_g\"]"));
        mailAndPhoneTextBox.sendKeys("123456789");
        TimeUnit.SECONDS.sleep(3);
        WebElement passwordTextBox = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
        passwordTextBox.sendKeys("Haslo");
        TimeUnit.SECONDS.sleep(3);
        WebElement dayCombo = driver.findElementByCssSelector("#day");
        Select daySelect = new Select(dayCombo);
        daySelect.selectByIndex(5);
        TimeUnit.SECONDS.sleep(3);
        WebElement monthCombo = driver.findElementByCssSelector("#month");
        Select monthSelect = new Select(monthCombo);
        monthSelect.selectByIndex(5);
        TimeUnit.SECONDS.sleep(3);
        WebElement yearCombo = driver.findElementByCssSelector("#year");
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(15);
        TimeUnit.SECONDS.sleep(3);
        WebElement sexCheckBox = driver.findElement(By.xpath("//*[@id=\"u_3_o\"]/span[1]/label"));
        sexCheckBox.click();
    }
}
