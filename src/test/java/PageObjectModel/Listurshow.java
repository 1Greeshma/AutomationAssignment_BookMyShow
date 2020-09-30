package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Listurshow extends Driver {
    @FindBy(xpath="//li[@class='secondary-menu']/a")
    private WebElement listshow;

    public Listurshow(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public  void enterlistyourshowclick(){
        listshow.click();
    }


}
