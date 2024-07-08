package Tests;

import Pages.AlertPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.testng.annotations.Test;

public class AlertTest extends SharedData {

  @Test
  public void metodaTest(){
      HomePage homePage = new HomePage(getWebDriver());
      homePage.navigateToAlertPage();

      AlertPage alertPage = new AlertPage(getWebDriver());
      alertPage.dealWithAlertPage();
  }

}
