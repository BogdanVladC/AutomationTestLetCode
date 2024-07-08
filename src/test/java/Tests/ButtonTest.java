package Tests;

import HelperMethods.ElementMethods;
import Pages.ButtonPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ButtonTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToButtonPage();

        ButtonPage buttonPage = new ButtonPage(getWebDriver());
        buttonPage.resolveButtonPage();
        buttonPage.validateButtonPage();










    }
}
