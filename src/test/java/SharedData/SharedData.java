package SharedData;

import LoggerUtillity.LoggerUtillity;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData extends LoggerUtillity {
    private WebDriver webDriver;

    private String testName;

    @BeforeMethod
    public void prepareDriver(){
        testName = this.getClass().getSimpleName();
        LoggerUtillity.startTestCase(testName);
        LoggerUtillity.infoTest("The driver opened successfully");
        webDriver = new ChromeDriver();
        webDriver.get("https://letcode.in/test");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
//    @AfterMethod
//    public void clearEnvironment(ITestResult result){
//        if(!result.isSuccess()){
//            LoggerUtillity.errorTest(result.getThrowable().getMessage());
//        }
//        webDriver.quit();
//        LoggerUtillity.infoTest("The driver closed successfully");
//        LoggerUtillity.finishTestCase(testName);
//
//    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
