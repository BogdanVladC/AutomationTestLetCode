package Tests;

import ObjectData.FormsObject;
import Pages.FormsPage;
import Pages.HomePage;
import PropertyUtility.PropertyUtility;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class FormsTest extends SharedData {

    @Test
    public void metodaTest(){
        PropertyUtility propertyUtility = new PropertyUtility("FormsData");
        FormsObject formsObject = new FormsObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToFormsPage();

        FormsPage formsPage = new FormsPage(getWebDriver());
        formsPage.validateForm(formsObject);
        formsPage.fillForm(formsObject);

    }
}
