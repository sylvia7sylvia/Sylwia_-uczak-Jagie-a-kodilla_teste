package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        ChromeDriver driver = new ChromeDriver();
        SeleniumPracticePO page = new SeleniumPracticePO(driver);
        page.navigate();
        page.clickCheckbox1();
    }
}
