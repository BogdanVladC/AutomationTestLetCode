package Tests;

import Pages.ElementsPage;
import Pages.HomePage;
import SharedData.SharedData;
import SharedData.browser.Hooks;
import org.testng.annotations.Test;

public class ElementsTests extends Hooks {
    @Test
    public void metodaTest(){
        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToElementsPage();

        ElementsPage elementsPage = new ElementsPage(getWebDriver());
        elementsPage.dealWithElementsPage();
    }
}
