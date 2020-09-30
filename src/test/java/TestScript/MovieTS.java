package TestScript;
import DataProvider.Dp_onetwo;

import PageObjectModel.MovieSearch;
import PageObjectModel.OnwardMoviesPage;
import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class MovieTS extends Driver {

   @Test(dataProvider = "moviesearch", dataProviderClass = Dp_onetwo.class)
    public void SearchMovieScenario(String movie,String expected) throws InterruptedException {

        MovieSearch movieSearch = new MovieSearch(driver);
        OnwardMoviesPage onwardMoviesPage=new OnwardMoviesPage(driver);
        movieSearch.entermoviename(movie);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean presentmovie = movieSearch.ismoviepresent();
        if(expected=="pass")
            Assert.assertEquals(true,presentmovie);
        else {
            Assert.assertEquals(false,presentmovie);
        }

    }

}










