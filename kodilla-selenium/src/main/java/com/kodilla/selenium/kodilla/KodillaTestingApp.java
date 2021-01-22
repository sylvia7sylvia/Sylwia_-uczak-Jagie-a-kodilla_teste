package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");
//        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        iAgree(driver);
        login(driver);
//        closeAdvertisement(driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TEST PASSED");
        driver.close();
    }

    public static void login(ChromeDriver driver){
        WebElement email = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        email.click();
        email.sendKeys("testuser@gmail.com");
        WebElement password = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        password.click();
        password.sendKeys("Haslo");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"sign-in\"]/form/div[2]/button"));
        loginButton.click();

    }

    public static void iAgree(ChromeDriver driver){
        WebElement iAgreeButton = driver.findElement(By.xpath("/html/body/form/input[2]"));
        iAgreeButton.click();
    }

    public static void closeAdvertisement(ChromeDriver driver){
        WebElement closeAdverButton = driver.findElement(By.xpath("//*[@id=\"closeXButton\"]/span/p/span"));
        closeAdverButton.click();
    }
}
