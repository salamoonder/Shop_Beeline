package bln.pages;

import bln.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SmartPhonePage extends TestBase {
    @FindBy(xpath = "//*[@for='facet_price_от 50 000 до 100 000 тг']")
    private WebElement filterPhone1;

    @FindBy(xpath = "//*[@for='facet_vendor_Samsung']")
    private WebElement filterModelSamsung;

    @FindBy(xpath = "//*[@for='facet_vendor_Xiaomi']")
    private WebElement filterModelXiaomi;

    @FindBy(xpath = "//span[text()='Следующая']")
    private WebElement nextPage;

    @FindBy(xpath = "//div[@class='col-md-9 col-sm-12 category']")
    private WebElement resultList;

    @FindBy(xpath = "//*[@for='facet_vendor_Xiaomi']/span[@class='grey_color' and 1]")
    private WebElement getCountXiaomi;

    @FindBy(xpath = "//*[@for='facet_price_более 500 000 тг']")
    private WebElement filterPhone2;

    @FindBy(xpath = "//*[@for='facet_price_более 500 000 тг']/span[@class='grey_color' and 1]")
    private WebElement getCount500;

    public SmartPhonePage() {
        PageFactory.initElements(driver, this);
    }

    public void checkSmartPhonePageUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://shop.beeline.kz/ru/almaty/c/smartphones" );
    }
    public void clickFilterBtn(){
        filterPhone1.click();
    }
    public void clickFilterBtn2(){
        filterPhone2.click();
    }
    public void clickFinterModelSamsung(){
        filterModelSamsung.click();
    }
    public void clickFinterModelXiaomi(){
        filterModelXiaomi.click();
    }
    public void getphone1(String m){
        System.out.println(resultList.getText().contains(m));
    }
    public void  getphone2(String n){
        System.out.println(resultList.getText().contains(n));
    }
    public void getCountXiaomi(String countXiaomi){
        System.out.println(getCountXiaomi.getText().equals(countXiaomi));
    }
    public void getCount500(String a){
        System.out.println(getCount500.getText().equals(a));
    }
    public void getphone3(String b){
        System.out.println(resultList.getText().contains(b));
    }
    public void getphone4(String e){
        System.out.println(resultList.getText().contains(e));
    }

}
