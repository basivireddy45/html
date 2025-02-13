package Pound_Land_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    SeleniumActions seleniumactions;


    By acceptcookie = By.xpath("(//button[normalize-space()='Accept All Cookies'])[1]");
    By signInBox = By.xpath("//li[contains(@class,'customer-account')]/a[contains(normalize-space(),'sign in')]");
    By signInBox1 = By.xpath("//div[@class='primary']/a[text()='Sign In']");
    By userNameInputBox = By.xpath("//input[@name='Email Address']");
    By passwordInputBox = By.xpath("//input[@name='Password']");
    By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        seleniumactions = new SeleniumActions(driver);

    }
    public  void login (String username, String password){

        seleniumactions.enterValue(userNameInputBox, username);
        seleniumactions.enterValue(passwordInputBox, password);
        seleniumactions.clickOnElement(loginButton);
    }
    public void acceptcookie (){
        seleniumactions.elementNot1(acceptcookie);
    }
    public void siginbox(){
        seleniumactions.elementNot1(signInBox);
    }
    public void siginbox1(){
        seleniumactions.elementNot1(signInBox1);
    }
}
