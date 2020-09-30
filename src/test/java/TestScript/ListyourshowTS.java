package TestScript;


import PageObjectModel.Listurshow;
import PageObjectModel.Listurshowpagehost;
import PageObjectModel.Listurshowpageservices;

import commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ListyourshowTS extends Driver {
 @Test(priority = 0)
 //List Your Show-What can you Host
    public void ListYourShowWhatcanyouHost() {
       JavascriptExecutor js = (JavascriptExecutor) driver;
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Listurshow listurshow = new Listurshow(driver);
        listurshow.enterlistyourshowclick();
        Listurshowpagehost listurshowpagehost = new Listurshowpagehost(driver);
        boolean flag1 = listurshowpagehost.contentUnderWhatcanyouhost();
        Assert.assertEquals(true, flag1);
       WebElement element=listurshowpagehost.Elementfount();
       js.executeScript("arguments[0].scrollIntoView();", element);
    }
   @Test(priority = 1)
 //   List Your Show-What are the services we offer?
    public void ListYourShowWhataretheServicesWeOffer() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Listurshow listurshow = new Listurshow(driver);
        listurshow.enterlistyourshowclick();
        Listurshowpageservices listurshowpageservices= new Listurshowpageservices(driver);
        boolean flag2 = listurshowpageservices.theServicesWeOffer();
        Assert.assertEquals(true, flag2);
        WebElement element=listurshowpageservices.Elementfount();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
 @Test(priority = 2)
 //List Your Show-Reports & Business insights details
    public void ListYourShowReports_BusinessInsightsDetails() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Listurshow listurshow = new Listurshow(driver);
        listurshow.enterlistyourshowclick();
        Listurshowpageservices listurshowpageservices= new Listurshowpageservices(driver);
        listurshowpageservices.ReportBusinessInsightsClick();
        WebElement element=listurshowpageservices.ElementFountInClickingReportInsite();
        js.executeScript("arguments[0].scrollIntoView();", element);


    }




    }








