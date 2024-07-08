package Tests;

import Pages.ElementsPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class ElementsTests extends SharedData {
    @Test
    public void metodaTest(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.dealWithElementsPage();
    }
}
