package ParaBank_Task;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tests extends BaseSelenium {
    Registration_Page registrationPage;
       Home_Page home_page;
       Login_Page login_page;

    @BeforeClass
    public void initializePages() {

        registrationPage = new Registration_Page(driver);
        home_page =new Home_Page(driver);
        login_page=new Login_Page(driver);
    }
        @Test
        public void verifySuccessfulLogin() throws InterruptedException {
            registrationPage.register();
                registrationPage.fname="cvbf";
                registrationPage.lname="hgjkg";
                registrationPage.sname="dfgbn";
                registrationPage.cname="kika";
                registrationPage.stname="up";
                registrationPage.zcode="4563";
                registrationPage.ssnnum="563215";
                registrationPage.uname="existing_user8";
                registrationPage.pswd="45612";
                registrationPage.repswd="45612";
                login_page.lusername="existing_user8";
                login_page.lpassword="45612";

            registrationPage.firstName();
            registrationPage.lastName();
            registrationPage.streetName();
            registrationPage.cityName();
            registrationPage.stateName();
            registrationPage.zpcode();
            registrationPage.ssnnumber();
            registrationPage.enterUserName();
            registrationPage.enterPassword();
            registrationPage.enterRepeatPassword();
                registrationPage.submit();
                home_page.logoutButton();
login_page.enterUserName();
login_page.enterpassword();
login_page.clickOnLogin();
home_page.openNewAccount();
Thread.sleep(5000);
home_page.selectDropDown("1");
home_page.newAccount();
Thread.sleep(2000);
String v1= home_page.successMessage();
System.out.println(v1);
Assert.assertEquals(home_page.successMessage(),"Congratulations, your account is now open.");
        }
    }

