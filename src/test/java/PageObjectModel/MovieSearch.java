package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieSearch extends Driver {

    @FindBy(name = "inputSearchBox")
    private WebElement movie;
    @FindBy(id = "eventTitle")
    private WebElement ismoviepresrnt;
    @FindBy(xpath = "//button[@class='No thanks']")
    private WebElement notnow;

    public MovieSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void entermoviename(String m1) throws InterruptedException {
        movie.sendKeys(m1);
        Thread.sleep(4000);
        movie.sendKeys(Keys.ENTER);
    }
    public boolean ismoviepresent() {
        {
            try {
                return ismoviepresrnt.isDisplayed();
            } catch (Exception e) {
                return false;
            }
        }

    }

}