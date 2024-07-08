package SharedData.browser;
import LoggerUtillity.LoggerUtillity;
import SharedData.SharedData;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData {

    private String testName;

    @BeforeMethod
    public void prepareEnviroment() {
        testName = this.getClass().getSimpleName();
        LoggerUtillity.startTestCase(testName);
        prepareDriver();
        LoggerUtillity.infoTest("The driver is opened with succes");
    }

    @AfterMethod
    public void clearEnviroment(ITestResult result) {
        if(!result.isSuccess()){
            LoggerUtillity.errorTest(result.getThrowable().getMessage());
        }
        testName = this.getClass().getSimpleName();
        clearEnvironment();
        LoggerUtillity.infoTest("The driver is closed with succes");
        LoggerUtillity.finishTestCase(testName);
    }

}
