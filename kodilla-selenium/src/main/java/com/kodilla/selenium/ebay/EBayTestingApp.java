package com.kodilla.selenium.ebay;

import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        EBayPage eBayPage = new EBayPage(driver);
        eBayPage.navigate();
        eBayPage.clickIagree();
        eBayPage.searchFor("Notebook");
        close(driver);
    }

    private static void close(ChromeDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("TEST PASSED");
        driver.close();
    }
}
