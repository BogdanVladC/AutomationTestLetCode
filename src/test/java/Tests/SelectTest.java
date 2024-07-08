package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTest {
    public WebDriver webDriver;

    @Test

    public void metodaTest() {
        //deschidem chrome browser
        webDriver = new ChromeDriver();

        //accesam un url
        webDriver.get("https://letcode.in/test");
        webDriver.manage().window().maximize();

        WebElement selectPage = webDriver.findElement(By.xpath("//a[text()='Drop-Down']"));
        selectPage.click();

        WebElement selectFruit = webDriver.findElement(By.id("fruits"));
        Select myFruit = new Select(selectFruit);
        myFruit.selectByVisibleText("Apple");

        WebElement selectCountry = webDriver.findElement(By.id("country"));
        Select myCountry = new Select(selectCountry);
        myCountry.selectByValue("India");

        WebElement selectedCountry = myCountry.getFirstSelectedOption();
        System.out.println(selectedCountry);




    }
}
