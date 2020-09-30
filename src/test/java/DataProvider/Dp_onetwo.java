package DataProvider;

import org.testng.annotations.DataProvider;

public class Dp_onetwo {

    @DataProvider(name = "moviesearch")
    public static Object[][] dataprovidermovie() {
        return new Object[][]{
                {"Fantasy Island","pass"},
                {"qq","fail"}
        };
    }

    }
