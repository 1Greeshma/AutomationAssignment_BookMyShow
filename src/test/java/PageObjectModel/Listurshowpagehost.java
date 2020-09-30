package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listurshowpagehost extends Driver {

    @FindBy(xpath = "//div[contains (text(),'Online Streaming')]")
    private WebElement onlinestreming;
    @FindBy(xpath = "//div[contains (text(),'Performances')]")
    private WebElement Performances;
    @FindBy(xpath = "//div[contains (text(),'Experiences')]")
    private WebElement Experiences;
    @FindBy(xpath = "//div[contains (text(),'Expositions')]")
    private WebElement Expositions;
    @FindBy(xpath = "//div[contains (text(),'Parties')]")
    private WebElement Parties;
    @FindBy(xpath = "//div[contains (text(),'Sports')]")
    private WebElement Sports;
    @FindBy(xpath = "//div[contains (text(),'Conferences')]")
    private WebElement Conferences;
    @FindBy(xpath = "//div[@class='__head']/h3")
    private WebElement title;

    public Listurshowpagehost(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public boolean contentUnderWhatcanyouhost() {
       if (title.isDisplayed() &&onlinestreming.isDisplayed() && Performances.isDisplayed() && Experiences.isDisplayed() && Expositions.isDisplayed() && Parties.isDisplayed() && Sports.isDisplayed() && Conferences.isDisplayed()) {

            return true;
        }
        else{
            return false;
        }

    }
    public WebElement Elementfount(){
        return Performances;

    }
}










