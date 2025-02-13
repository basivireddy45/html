package ParaBank_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
    Login_Page login_page;
    String lusername, lpassword;
    SeleniumActions seleniumActions;

    public Login_Page(WebDriver driver) {

        seleniumActions = new SeleniumActions(driver);
    }

    By username = By.xpath("//div/input[@name='username']");
    By password = By.xpath("//div/input[@name='password']");
    By login = By.xpath("//div/input[@type='submit']");

    public void enterUserName() {
        seleniumActions.enterValues(username, lusername);
    }

    public void enterpassword() {
        seleniumActions.enterValues(password, lpassword);
    }

    public void clickOnLogin() {
        seleniumActions.elementNot1(login);
    }
}