package DataProvider;

import org.testng.annotations.DataProvider;

public class ICICdiscountofferdataprovider {

    @DataProvider(name = "reduction")
    public static Object[][] dataproviderIcIcOffer() {
        return new Object[][]{
                {"ICICI Bank 25%"},

        };
    }
    @DataProvider(name = "Kotak Mahindra Offer")
    public static Object[][] dataproviderKotakMahindraOffer() {
        return new Object[][]{

                {"Kotak Mahindra Offer"}
        };
    }
}
