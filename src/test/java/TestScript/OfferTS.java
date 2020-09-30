package TestScript;


import PageObjectModel.Offer;
import commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class OfferTS extends Driver {
    @Test
  //  Check Offers(Reward Points Redemption/Payback Points/Simple Click SBI Card Redemption)
    public void CheckOffers() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Offer offer = new Offer(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        offer.ClickOffer();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        offer.ClickRewards();
        boolean flag=offer.rewardsarepresent();
        Assert.assertEquals(true,flag);
        WebElement element=offer.Elementfount();
        js.executeScript("arguments[0].scrollIntoView();", element);


    }
}
