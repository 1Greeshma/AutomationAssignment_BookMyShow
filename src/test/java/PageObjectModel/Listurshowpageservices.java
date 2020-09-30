package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Listurshowpageservices {
    @FindBy(xpath = "//div[contains (text(),'Online Sales & Marketing')]")
    private WebElement OnlineSalesandMarketing;
    @FindBy(xpath = "//div[contains (text(),'Pricing')]")
    private WebElement Pricing;
    @FindBy(xpath = "//div[contains (text(),'Food & beverages, stalls and the works!')]")
    private WebElement foodandbeverage;
    @FindBy(xpath = "//div[contains (text(),'On ground support  & gate entry management')]")
    private WebElement groundsupportandentrymanagement;
    @FindBy(xpath = "//div[contains (text(),'Reports & business insights')]")
    private WebElement reporyandinsite;
    @FindBy(xpath = "//div[contains (text(),'POS, RFID, Turnstiles & more...')]")
    private WebElement posreidmore;
    @FindBy(xpath = "//div[contains (text(),'In depth reports')]")
    private WebElement Indepthreports;
    @FindBy(xpath = "//div[contains (text(),'Access registration data')]")
    private WebElement Accessregistrationdata;
    @FindBy(xpath = "//div[contains (text(),'behavioural insights')]")
    private WebElement behaviouralinsights;


    public Listurshowpageservices(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean theServicesWeOffer() {
        if (OnlineSalesandMarketing.isDisplayed() && Pricing.isDisplayed() && foodandbeverage.isDisplayed() && groundsupportandentrymanagement.isDisplayed() && reporyandinsite.isDisplayed() && posreidmore.isDisplayed()) {

            return true;
        } else {
            return false;
        }
    }
    public WebElement Elementfount() {
        return Pricing;

    }
    public WebElement ElementFountInClickingReportInsite() {
        return Indepthreports;

    }
    public void ReportBusinessInsightsClick() {
        reporyandinsite.click();
        // WebDriverWait wait = new WebDriverWait(driver,10);
    }
    public boolean contentPresentinReportBusinessInsightsClick() {
        if (Indepthreports.isDisplayed() && Accessregistrationdata.isDisplayed() && behaviouralinsights.isDisplayed()) {

            return Indepthreports.isDisplayed();
        }
        else{
            return false;
        }
    }



}
