package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ElementsPage extends BasePage{
    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "input[placeholder='Enter your git user name eg., ortonikc']")
    private WebElement searchBar;
    @FindBy(id ="search")
    private WebElement searchButton;
    @FindBy(xpath = "/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-usercard/div/div/div[2]/div/div[1]/div/span[2]")
    private WebElement repositoryValue;
    @FindBy(xpath = "//div[@class='content']//a[@target='_blank']")
    private List<WebElement> repositories;

    public void sendUserName(String text){
        elementMethods.fillElement(searchBar,text);
        elementMethods.clickElement(searchButton);
    }

    public void printReposNumber(){
        elementMethods.printElementText(repositoryValue);
    }

    public void checkReposNo(){
        Assert.assertEquals(repositoryValue.getText(),String.valueOf(repositories.size()));
    }

    public void dealWithElementsPage(){
        sendUserName("BogdanVladC");
        printReposNumber();
        checkReposNo();
    }

}
