package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputTest {

    public WebDriver webDriver;

    @Test

    public void metodaTest(){
        //deschidem chrome browser
        webDriver = new ChromeDriver();

        //accesam un url
        webDriver.get("https://letcode.in/test");
        webDriver.manage().window().maximize();

        WebElement inputPage = webDriver.findElement(By.xpath("//a[text()='Edit']"));
        inputPage.click();

        WebElement enterFullName = webDriver.findElement(By.id("fullName"));
        String enterFullNameValue = "Bogdan Vlad";
        enterFullName.sendKeys(enterFullNameValue);

        WebElement appendAndPress = webDriver.findElement(By.id("join"));
        String appendAndPressValue = " and I appended this Text";
        appendAndPress.sendKeys(appendAndPressValue, Keys.TAB);

        WebElement insideTheBox = webDriver.findElement(By.id("getMe"));
        System.out.println(insideTheBox.getAttribute("value"));

        WebElement clearText = webDriver.findElement(By.id("clearMe"));
        clearText.clear();

        WebElement confirmDisabled = webDriver.findElement(By.id("noEdit"));
        System.out.println(confirmDisabled.isEnabled());

        WebElement confirmReadOnly = webDriver.findElement(By.id("dontwrite"));
        System.out.println(confirmReadOnly.getAttribute("readonly"));

        webDriver.quit();




    }


}
