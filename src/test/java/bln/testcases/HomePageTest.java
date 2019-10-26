package bln.testcases;

import bln.base.TestBase;
import bln.pages.HomePage;
import bln.pages.SmartPhonePage;
import bln.pages.SmartPhonePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    HomePage homePage;
    SmartPhonePage smartPhonePage;
    String testPhone1 = "Samsung Galaxy A30s 32Gb Green + Пауэрбанк Samsung 10000mAh";
    String testPhone2 = "Samsung Galaxy A30s 32Gb Black + Пауэрбанк Samsung 10000mAh\n" +
            "Цена\n" +
            "99 890 тг";
    String testPhone3 = "Apple iPhone 11 Pro 256Gb Gold";
    String testPhone4 = "Apple iPhone 11 Pro 512Gb Silver\n" +
            "Цена\n" +
            "759 450 тг";
    String countXiaomi = "(30)";
    String count500 = "(32)";


    public HomePageTest(){ super();
    }
    @BeforeTest
    public void setUp(){
        initialization();   //инициализация драйвера
        homePage = new HomePage();
        smartPhonePage = new SmartPhonePage();

    }
    @Test(priority = 1)
    public void testCase1(){
        homePage.checkHomePageUrl(); //проверка ссылки домашней страницы
        homePage.clickMenuCat();    //нажатие на Смартфоны
        smartPhonePage.checkSmartPhonePageUrl();    //проверка ссылки станицы Смартфоны
        smartPhonePage.clickFinterModelSamsung();   //нажатие на фильтр
        try {                                       //ждем пока загрузится
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        smartPhonePage.clickFilterBtn();            //нажатие на фильтр
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        smartPhonePage.getphone1(testPhone1);       //проверка наличии
        smartPhonePage.getphone2(testPhone2);       //проверка наличии и цены

    }

    @Test(priority = 2)
    public void testCase2(){
        homePage.checkHomePageUrl();
        homePage.clickMenuCat();
        smartPhonePage.checkSmartPhonePageUrl();
        smartPhonePage.clickFinterModelXiaomi();    //нажатие на фильтр
        smartPhonePage.getCountXiaomi(countXiaomi); //проверка количества товаров
    }

    @Test(priority = 3)
    public void testCase3(){
        homePage.checkHomePageUrl();
        homePage.clickMenuCat();
        smartPhonePage.checkSmartPhonePageUrl();
        smartPhonePage.clickFilterBtn2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        smartPhonePage.getCount500(count500);       //проверка количества товаров
        smartPhonePage.getphone3(testPhone3);       //проверка наличии
        smartPhonePage.getphone4(testPhone4);       //проверка наличии и цены
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();                              //закрываем браузер
    }
}
