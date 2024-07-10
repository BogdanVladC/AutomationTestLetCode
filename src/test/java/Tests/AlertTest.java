package Tests;

import Pages.AlertPage;
import Pages.HomePage;
import SharedData.SharedData;
import SharedData.browser.Hooks;
import org.testng.annotations.Test;

public class AlertTest extends Hooks {

  @Test
  public void metodaTest(){
      HomePage homePage = new HomePage(getWebDriver());
      homePage.navigateToAlertPage();

      AlertPage alertPage = new AlertPage(getWebDriver());
      alertPage.dealWithAlertPage();
  }

}
