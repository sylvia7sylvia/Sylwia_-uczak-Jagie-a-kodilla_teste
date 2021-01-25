package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResults(WebDriver driver) { //kontruktor
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println("Number of results: " + results.size());
    }

    public WebElement oneRandomResult(){
        Random random = new Random();
        int randomPageId = random.nextInt(results.size());
        WebElement webElement = results.get(randomPageId);
        System.out.println(webElement.getTagName());
        System.out.println(webElement);
        return results.get(randomPageId);
    }
}