package Pound_Land_Task;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    LoginPage loginpage;
    HomePage homepage;
    BasketPage basketPage;
    @BeforeClass
    public  void initializePages(){
        loginpage = new LoginPage(driver);
        homepage = new HomePage(driver);
        basketPage = new BasketPage(driver);
    }


    @Test
    public void verifySuccessfulLogin() throws InterruptedException {
        loginpage.acceptcookie();
        loginpage.siginbox();
        loginpage.siginbox1();
        loginpage.login("basivireddykalakoti@gmail.com","4512Kbr@");
        Thread.sleep(2000);

        homepage.goToSearchBar();
        homepage.clickOnFirstSuggesion();

        Thread.sleep(3000);

        String searchProductName=homepage.getProductName();
        Thread.sleep(3000);
        String searchProductPrice=homepage.getProductPrice();
        System.out.println(searchProductName);
        System.out.println(searchProductPrice);
        homepage.clickOnAddButton();
        basketPage.clickOnCartButton();
        basketPage.getbasketProductName();
        basketPage.getbasketProductPrice();

        String basketProductName= basketPage.getbasketProductName();
        String basketProductPrice=basketPage.getbasketProductPrice();
        System.out.println(basketProductName);
        System.out.println(basketProductPrice);
        Assert.assertEquals(searchProductName,basketProductName);
        Assert.assertEquals(searchProductPrice,basketProductPrice);
        basketPage.clickonremoveproduct();

    }
}

