package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class ElementMethods {
    private WebDriver webDriver;
    public ElementMethods(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void scrollByPixel(Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy("+x+","+y+")","");
    }

    public void waitElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(WebElement element){
        waitElement(element);
        element.click();
    }

    public void forceClickElement(WebElement element){
        waitElement(element);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click()",element);
    }

    public void holdClickElement(WebElement element){
        waitElement(element);
        new Actions(webDriver).clickAndHold(element).perform();
    }

    public void validateElementText(WebElement element, String expectedText){
        waitElement(element);
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public void printElementText(WebElement element){
        waitElement(element);
        System.out.println("Textul din element este: "+element.getText());
    }

    public void findElementLocation(WebElement element){
        waitElement(element);
        System.out.println(element.getLocation());
    }

    public void findElementSize(WebElement element){
        waitElement(element);
        System.out.println(element.getSize());
    }

    public void findElementColour(WebElement element){
        waitElement(element);
        System.out.println(element.getCssValue("background-color"));
    }

    public void isEnabled(WebElement element){
        waitElement(element);
        System.out.println(element.isEnabled());
    }

    public void fillElement(WebElement element, String value){
        waitElement(element);
        element.clear();
        element.sendKeys(value);
    }
    public void fillPressElement(WebElement element, String value, Keys key){
        waitElement(element);
        element.click();
        element.sendKeys(value);
        element.sendKeys(key);
    }
    public void selectTextElement(WebElement element,String value) {
        waitElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }





}
