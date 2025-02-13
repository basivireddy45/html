package ParaBank_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    SeleniumActions seleniumActions;

    public Home_Page(WebDriver driver) {

        seleniumActions = new SeleniumActions(driver);
    }

    By logOut = By.xpath("//li/a[text()='Log Out']");
    By clickOnOpenNewAccount = By.xpath("//li/a[text()='Open New Account']");
    By dropDownBox = By.xpath("//select[@id='type']");
    By clickOnNewAccount = By.xpath("//div/input[@type='button']");
    By successfull = By.xpath("//div/h1/following-sibling::p[text()='Congratulations, your account is now open.']");

    public void logoutButton() {
        seleniumActions.elementNot1(logOut);
    }

    public void openNewAccount() {
        seleniumActions.elementNot1(clickOnOpenNewAccount);
    }

    public void selectDropDown(String data) {
        seleniumActions.selectByValue(dropDownBox, data);
    }

    public void newAccount() {
        seleniumActions.elementNot1(clickOnNewAccount);
    }

    public String successMessage() {
        return seleniumActions.getTextMessage(successfull);
    }

}
