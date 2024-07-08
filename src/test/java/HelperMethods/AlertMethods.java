package HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {

    private WebDriver webDriver;

    public AlertMethods(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void acceptAlert(){
        waitForAlert();
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }

    public void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void fillAlert(String value){
        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys(value);
        alert.accept();
    }
    public void cancelAlert(){
        waitForAlert();
        Alert alert = webDriver.switchTo().alert();
        alert.dismiss();
    }

    public void printAlertText(String string){
        waitForAlert();
        Alert alert=webDriver.switchTo().alert();
        System.out.println(alert.getText());
        switch (string){
            case "accept":
                alert.accept();
            case "dismiss":
                alert.dismiss();
        }

    }

    public  void printTextAlert(){
        waitForAlert();
        Alert alert = webDriver.switchTo().alert();
        System.out.println(alert.getText());
    }


}
