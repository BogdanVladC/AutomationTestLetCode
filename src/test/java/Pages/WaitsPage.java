package Pages;

import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaitsPage extends BasePage{
    public WaitsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "accept")
    public WebElement waitAlert;

    public void dealWithWaitsPage(){
        elementMethods.clickElement(waitAlert);
        LoggerUtillity.infoTest("The user clicks on the Simple Alert button");
        alertMethods.acceptAlert();
        LoggerUtillity.infoTest("The user waits for alert and accepts the alert");
    }

}
