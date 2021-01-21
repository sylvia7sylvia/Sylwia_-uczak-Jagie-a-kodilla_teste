package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticePO {
    private ChromeDriver driver;

    public SeleniumPracticePO(ChromeDriver driver) {
        this.driver=driver;
    }

    public void navigate() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public void clickCheckbox1() {
        WebElement checkbox1 = driver.findElementByXPath("//form/input[1]");
        checkbox1.click();
    }

}
