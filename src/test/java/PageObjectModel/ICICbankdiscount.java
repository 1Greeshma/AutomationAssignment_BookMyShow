package PageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICbankdiscount {
    @FindBy(xpath = "//input[@type='text' and @placeholder='Search for Offers by Name or Bank']")
    private WebElement searchbox;
    @FindBy(xpath = "//aside[@id='ICICICC520']")
    private WebElement discount;
    @FindBy(xpath = "//div[@class='wrapper']//div")
    private WebElement discountnotprent;

    public ICICbankdiscount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputingserchboxandenter(String s1) {
       searchbox.sendKeys(s1);
        searchbox.sendKeys(Keys.ENTER);
    }
    public void inputingserchbox(String s1) {
        searchbox.sendKeys(s1);
    }
    public boolean isIcIcOfferpresent(){
        try {
            return discount.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isMahadraOfferNotPresent(){
        try {
            return discountnotprent.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public WebElement Element(){
        return discount;
    }
}
