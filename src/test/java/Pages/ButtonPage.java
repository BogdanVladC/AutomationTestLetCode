package Pages;

import HelperMethods.ElementMethods;
import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage {
    public ButtonPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "home")
    private WebElement goToHomeButton;
    @FindBy(id="testing")
    private WebElement workSpaceButton;
    @FindBy (xpath = "//a[text()='Click']")
    private WebElement buttonPage;
    @FindBy (id = "position")
    private WebElement findMyLocation;
    @FindBy (id="color")
    private WebElement findMyColour;
    @FindBy (id ="property")
    private WebElement findMySize;
    @FindBy(xpath ="//button[text()='Disabled']" )
    private WebElement isDisabled;
    @FindBy(xpath ="//h2[text()='Button Hold!']" )
    private WebElement holdButton;
    @FindBy(xpath = "//h2[text()='Button has been long pressed']")
    private WebElement  holdedButton;

    public void clickGotoHomeButton(){
        elementMethods.clickElement(goToHomeButton);
        LoggerUtillity.infoTest("The users clicks the Goto Home button");
    }
    public void clickWorkSpaceButton(){
        elementMethods.clickElement(workSpaceButton);
        LoggerUtillity.infoTest("The users clicks the Work-Space button");
    }
    public void clickButtonPage(){
        elementMethods.clickElement(buttonPage);
        LoggerUtillity.infoTest("The users clicks the Button Page button");
    }

    public void findElementLocation(){
        elementMethods.findElementLocation(findMyLocation);
        LoggerUtillity.infoTest("The users finds the location of button 'Find Location' ");
    }
    public void findElementColour() {
        elementMethods.findElementColour(findMyColour);
        LoggerUtillity.infoTest("The users finds the colour of button 'What is my color?' ");
    }
    public void fineElementSize(){
        elementMethods.findElementSize(findMySize);
        LoggerUtillity.infoTest("The users finds the size of button 'How tall & fat I am' ");
    }
    public void isEnabled(){
        elementMethods.isEnabled(isDisabled);
        LoggerUtillity.infoTest("The users checks is the button 'Disabled' is enabled ");
    }
    public void clickAndHold(){
        elementMethods.holdClickElement(holdButton);
        LoggerUtillity.infoTest("The users holds a click on button 'Button Hold'");
    }

    public void validateHoldedButton(String buttonExpectedValue){
        elementMethods.validateElementText(holdedButton,buttonExpectedValue);
        LoggerUtillity.infoTest("The users validates that the button was clicked and holded");
    }

    public void resolveButtonPage(){
        clickGotoHomeButton();
        clickWorkSpaceButton();
        clickButtonPage();
        findElementLocation();
        findElementColour();
        fineElementSize();
        isEnabled();
        clickAndHold();
    }
    public void validateButtonPage(){
        validateHoldedButton("Button has been long pressed");
    }


}
