package DataProvider;

import org.testng.annotations.DataProvider;

public class DP_goa {
    @DataProvider(name = "citychange")
    public static Object[][] dataprovidercity() {
        return new Object[][]{
                {"Goa"}
        };
    }
}
