package SharedData.browser;

import PropertyUtility.PropertyUtility;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    public WebDriver getBrowserInstance(){
        PropertyUtility propertyUtility = new PropertyUtility("atfData");
        Map<String,String> browserData = propertyUtility.getAllData();
        String cIcD = System.getProperty("cIcD");
        String browser = System.getProperty("broswer");
        if (Boolean.parseBoolean(cIcD)){
            browserData.put("headless","--headless=new");
        }else{
            browser = browserData.get("browser");
        }
        System.out.println("=================================");
        System.out.println(browser);

        switch (browser){
            case "chrome":
                ChromeService chromeService = new ChromeService();
                chromeService.openBrowser(browserData);
                return chromeService.getWebDriver();
            case "edge":
                EdgeService edgeService = new EdgeService();
                edgeService.openBrowser(browserData);
                return edgeService.getWebDriver();
        }
        return null;
    }
}