package TestScript;


import DataProvider.Dp_Onward;
import PageObjectModel.MovieSearch;
import PageObjectModel.OnwardMoviesPage;
import commons.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OnwardMovieTS extends Driver {
    @Test(dataProvider = "onward", dataProviderClass = Dp_Onward.class)
    public void SearchforCastandCrewPostiveScenario(String movie,String actor,String musician) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        OnwardMoviesPage onwardMoviesPage=new OnwardMoviesPage(driver);
        MovieSearch movieSearch = new MovieSearch(driver);
        movieSearch.entermoviename(movie);
        boolean flag2 =onwardMoviesPage.ispersonpresrnt(actor);
        Assert.assertEquals(true,flag2);
        boolean flag3 =onwardMoviesPage.ispersonpresrnt(musician);
        Assert.assertEquals(true,flag3);
        WebElement element=onwardMoviesPage.Elementfount();
        js.executeScript("arguments[0].scrollIntoView();", element);

}
   @Test(dataProvider = "Onward", dataProviderClass = Dp_Onward.class)
    public void SearchforCastandCrewNegativeScenario(String movie,String actor,String musician) throws InterruptedException {
        MovieSearch movieSearch = new MovieSearch(driver);
        OnwardMoviesPage onwardMoviesPage=new OnwardMoviesPage(driver);
        movieSearch.entermoviename(movie);
        boolean flag2 =onwardMoviesPage.ispersonpresrnt(actor);
        Assert.assertEquals(false,flag2);
        boolean flag3 =onwardMoviesPage.ispersonpresrnt(musician);
        Assert.assertEquals(false,flag3);

    }
}
