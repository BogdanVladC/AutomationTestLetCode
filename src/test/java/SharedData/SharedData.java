package SharedData;

import LoggerUtillity.LoggerUtillity;
import SharedData.browser.BrowserFactory;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    private WebDriver webDriver;

    private String testName;

    @BeforeMethod
    public void prepareDriver(){
        System.out.println("-----A intrat in before method----");
       webDriver = new BrowserFactory().getBrowserInstance();
    }
    @AfterMethod
    public void clearEnvironment(){
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}