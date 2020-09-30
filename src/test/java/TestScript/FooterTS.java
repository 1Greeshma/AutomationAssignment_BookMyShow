package TestScript;

import PageObjectModel.FooterShow;
import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FooterTS extends Driver {
    @Test
    public void FooterTextValidation(){
        FooterShow footerValidation=new FooterShow(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//h4[contains (text(), 'BOOKMYSHOW APP ')]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean status=footerValidation.Footer();
        Assert.assertEquals(true,status);
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
