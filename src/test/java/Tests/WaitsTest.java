package Tests;

import Pages.HomePage;
import Pages.WaitsPage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class WaitsTest extends SharedData {
    @Test
    public void metodaTest(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToWaitsPage();

        WaitsPage waitsPage = new WaitsPage(getWebDriver());
        waitsPage.dealWithWaitsPage();
    }

}
