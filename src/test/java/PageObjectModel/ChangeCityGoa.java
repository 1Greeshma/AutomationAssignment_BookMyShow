package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeCityGoa extends Driver {

    @FindBy(xpath = "//li[@class='secondary-menu location-container']")
    private WebElement city;
    @FindBy(xpath = "//input[@id='inp_RegionSearch_top']")
    private WebElement cityserachoption;



    public ChangeCityGoa(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickCity(){
        city.click();
    }
    public void inputingcityname(String city){
        cityserachoption.sendKeys(city);
        cityserachoption.sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='secondary-menu location-container']")));

    }
}
