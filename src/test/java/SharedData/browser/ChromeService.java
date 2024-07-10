package SharedData.browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Map;

public class ChromeService implements BrowserService{

    private WebDriver webDriver;
    @Override
    public void openBrowser(Map<String,String>testData) {
        //aceasta metoda are ca scop sa deschida un chrome cu configurarile noastre

        ChromeOptions options = (ChromeOptions) getBrowserOptions(testData);
        webDriver= new ChromeDriver(options);
        webDriver.get(testData.get("url"));
        webDriver.manage().window().maximize();
        //wait inplicit
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {
        //configuram optiunile pentru browserul nostru
        System.out.println("-----pregateste proprietatile-----");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(testData.get("gpu"));
        chromeOptions.addArguments(testData.get("infobars"));
        chromeOptions.addArguments(testData.get("extensions"));
        chromeOptions.addArguments(testData.get("sandbox"));
        System.out.println("-----a adaugat proprietatile de pana acuma-----");
        System.out.println(testData.get("headless"));
        if (!testData.get("headless").isEmpty()){
            System.out.println("-----vede ca headless exista si trebuie sa il seteze-----");
            chromeOptions.addArguments(testData.get("headless"));
        }
        System.out.println("-----nu a intrat in if si nu are nevoie sa il seteze-----");

        return chromeOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
