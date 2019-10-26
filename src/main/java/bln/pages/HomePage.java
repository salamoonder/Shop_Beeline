package bln.pages;

import bln.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends TestBase {
    @FindBy(xpath = "//div[text()='Смартфоны']")
    private WebElement menuCatSmartphone;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void checkHomePageUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://shop.beeline.kz/ru/almaty" );
    }
    public void clickMenuCat(){
        menuCatSmartphone.click();
    }

}
