package Pages;

import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "accept")
    private WebElement simpleAlert;
    @FindBy(id = "confirm")
    private WebElement confirmAlert;
    @FindBy(id = "prompt")
    private WebElement promptAlert;
    @FindBy(id ="modern")
    private WebElement modernAlert;
    @FindBy(xpath = "/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button")
    private WebElement closeModernAlert;
    @FindBy(id ="myName")
    private WebElement myName;

    public void acceptAlert(){
        elementMethods.clickElement(simpleAlert);
        LoggerUtillity.infoTest("The user clicks the simple alert button");
        alertMethods.acceptAlert();
        LoggerUtillity.infoTest("The user clicks accept");
    }

    public void printAndDissmiss(){
        elementMethods.clickElement(confirmAlert);
        LoggerUtillity.infoTest("The user clicks the confirm alert button");
        alertMethods.printTextAlert();
        LoggerUtillity.infoTest("The user prints text from alert");
        alertMethods.cancelAlert();
        LoggerUtillity.infoTest("The user dissmises the alert");
    }
    public void promptAlert(String text){
        elementMethods.clickElement(promptAlert);
        LoggerUtillity.infoTest("The user clicks the prompt alert button");
        alertMethods.fillAlert(text);
        LoggerUtillity.infoTest("The user fill in alert with : "+text);
        LoggerUtillity.infoTest("The user accepts the alert");
        elementMethods.validateElementText(myName,"Your name is: "+text);
    }

    public void modernAlert(){
        elementMethods.clickElement(modernAlert);
        LoggerUtillity.infoTest("The user clicks the modern alert button");
        elementMethods.clickElement(closeModernAlert);
        LoggerUtillity.infoTest("The user clicks 'x' to close the modern alert");
    }

    public void dealWithAlertPage(){
        acceptAlert();
        printAndDissmiss();
        promptAlert("Bogdan");
        modernAlert();
    }

}
