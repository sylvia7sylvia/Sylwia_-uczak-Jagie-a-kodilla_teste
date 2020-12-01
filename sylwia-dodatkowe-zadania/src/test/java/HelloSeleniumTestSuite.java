import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTestSuite {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.wp.pl/");
        webDriver.findElement(By.linkText("https://poczta.wp.pl/")).click();

    }
    static {
        System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
    }
}
