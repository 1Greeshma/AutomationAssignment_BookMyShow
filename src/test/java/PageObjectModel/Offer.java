package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Offer extends Driver {
    @FindBy(xpath = "//a[contains (text(),'Offers')]")
    private WebElement offer;

    @FindBy(xpath = "//li[@data-id='rewards']")
    private WebElement reward;
    @FindBy(xpath = "//h4[contains (text(),'Reward Points Redemption')]")
    private WebElement rewardpointredemption;
    @FindBy(xpath = "//h4[contains (text(),'PAYBACK POINTS')]")
    private WebElement paybackpoints;
    @FindBy(xpath = "//h4[contains (text(),'SimplyCLICK SBI Card Rewards Offer')]")
    private WebElement simplyclickSBIcardrewardsoffers;


    @FindBy(xpath = "//button[@class='No thanks']")
    private WebElement notnow;
    @FindBy(xpath = "//span[@class='__dismiss icon-cancel']")
    private WebElement cross;


    public Offer(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void ClickOffer() {
        offer.click();
    }

   public void ClickRewards() {
      reward.click();
    }

    public WebElement Elementfount(){
        return reward;

    }
    public boolean rewardsarepresent() {

        if (rewardpointredemption.isDisplayed() &&paybackpoints.isDisplayed() && simplyclickSBIcardrewardsoffers.isDisplayed()) {

            return rewardpointredemption.isDisplayed();
        }
        else{
            return false;
        }
    }
}