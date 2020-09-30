package TestScript;


import PageObjectModel.LangaugeChecking;
import commons.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LangaugeTS extends Driver {
    //Select Language
  @Test
    public void SelectLanguage() {
        LangaugeChecking langaugeChecking = new LangaugeChecking(driver);
        langaugeChecking.langButtonClick();
        int count= driver.findElements(By.xpath("//div[@class='lang-select']//li")).size();
        Assert.assertEquals(7,count);
  }
}
