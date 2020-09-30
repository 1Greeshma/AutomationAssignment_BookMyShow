package DataProvider;

import org.testng.annotations.DataProvider;

public class Dp_Onward {


    @DataProvider(name = "onward")
    public static Object[][] dataprovideronwaerdmovie() {
        return new Object[][]{
                {"onward","Tom Holland", "Mychael Danna"}


        };
    }
    @DataProvider(name = "Onward")
    public static Object[][] dataprovideronwaerdmovie1() {
        return new Object[][]{

                {"onward","Tom Cruise","Michael Jackson"}

        };
    }
}



