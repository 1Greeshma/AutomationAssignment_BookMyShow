package TestScript;


import DataProvider.DP_goa;
import PageObjectModel.ChangeCityGoa;
import commons.Driver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoaTS extends Driver {
   @Test(dataProvider = "citychange", dataProviderClass = DP_goa.class)
    public void ChooseCity(String city) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ChangeCityGoa changeCityGoa=new ChangeCityGoa(driver);
        changeCityGoa.clickCity();
        changeCityGoa.inputingcityname(city);
}
}
