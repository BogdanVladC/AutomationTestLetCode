package Pages;

import HelperMethods.ElementMethods;
import LoggerUtillity.LoggerUtillity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class HomePage extends BasePage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[text()='Click']")
    private WebElement buttonPage;
    @FindBy(xpath = "//a[text()='All in One']")
    private WebElement formsPage;

    @FindBy(xpath ="//a[text()='Dialog']")
    private WebElement alertPage;

    @FindBy(xpath ="//a[text()='Timeout']")
    private WebElement waitsPage;

    @FindBy(xpath ="//a[text()='Find Elements']")
    private WebElement elementsPage;

    public void navigateToButtonPage(){
        elementMethods.forceClickElement(buttonPage);
        LoggerUtillity.infoTest("The user clicks on the Button Page button");
    }

    public void navigateToFormsPage(){
        elementMethods.scrollByPixel(0,450);
        elementMethods.forceClickElement(formsPage);
        LoggerUtillity.infoTest("The user clicks on the Forms Page button");
    }

    public void navigateToAlertPage(){
        elementMethods.forceClickElement(alertPage);
        LoggerUtillity.infoTest("The user clicks on the Alert Page button");
    }

    public void navigateToWaitsPage(){
        elementMethods.forceClickElement(waitsPage);
        LoggerUtillity.infoTest("The user clicks on the Waits Page button");
    }

    public void navigateToElementsPage(){
        elementMethods.forceClickElement(elementsPage);
        LoggerUtillity.infoTest("The user clicks on the Elements button");

    }


}
