package TestScript;

import DataProvider.ICICdiscountofferdataprovider;
import PageObjectModel.ICICbankdiscount;


import PageObjectModel.Offer;
import commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IcIcbankTS extends Driver {
    //Search Offers-Positive scenario(ICICI offer)
    @Test(dataProvider = "reduction", dataProviderClass = ICICdiscountofferdataprovider.class)
    public void SearchOffersPositiveScenario(String s1) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Offer offer = new Offer(driver);
        offer.ClickOffer();
        ICICbankdiscount iciCbankdiscount=new ICICbankdiscount(driver);
        iciCbankdiscount.inputingserchboxandenter(s1);
        boolean flag=iciCbankdiscount.isIcIcOfferpresent();
        Assert.assertEquals(true,flag);
         WebElement element=iciCbankdiscount.Element();
        js.executeScript("arguments[0].scrollIntoView();", element);

    }
    //Search Offers-Negative scenario(Kotak Mahindra Offer)
    @Test(dataProvider = "Kotak Mahindra Offer", dataProviderClass = ICICdiscountofferdataprovider.class)
    public void SearchOffersNegativeScenario(String s1) {
        Offer offer = new Offer(driver);
        offer.ClickOffer();
        ICICbankdiscount iciCbankdiscount=new ICICbankdiscount(driver);
        iciCbankdiscount.inputingserchbox(s1);
        boolean flag=iciCbankdiscount.isMahadraOfferNotPresent();
        Assert.assertEquals(true,flag);
    }
}
