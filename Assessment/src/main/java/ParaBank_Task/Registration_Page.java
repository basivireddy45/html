package ParaBank_Task;


import com.sun.jdi.ByteValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration_Page {
    SeleniumActions seleniumActions;

String fname,lname,sname,cname,zcode,stname,ssnnum,uname,pswd,repswd;

    By clickOnRegister = By.xpath("//p/a[text()='Register']");
    By enterFirstName = By.xpath("//td/input[@name='customer.firstName']");

     By enterLastName = By.xpath("//td/input[@name='customer.lastName']");
//By address =By.xpath("//td/input[@name='customer.address.street']");
     By street =By.xpath("//td/input[@name='customer.address.street']");
     By city = By.xpath("//td/input[@name='customer.address.city']");
    By state =By.xpath("//td/input[@name='customer.address.state']");
      By zipCode = By.xpath("//td/input[@name='customer.address.zipCode']");
    By ssn=By.xpath("//td/input[@name='customer.ssn']");
    By userName=By.xpath("//td/input[@name='customer.username']");
     By password=By.xpath("//td/input[@name='customer.password']");
      By repeatPassword = By.xpath("//td/input[@name='repeatedPassword']");
     By submitButton= By.xpath("//td/input[@type='submit']");

    public Registration_Page(WebDriver driver) {

        seleniumActions = new SeleniumActions(driver);
    }

    public void register() {
        seleniumActions.elementNot1(clickOnRegister);

    }

    public void firstName() {

        seleniumActions.enterValues(enterFirstName,fname);

    }
    public void lastName(){

        seleniumActions.enterValues(enterLastName,lname);


    }
    public void streetName() {

        seleniumActions.enterValues(street,sname);
    }
    public void cityName() {

      seleniumActions.enterValues(city,cname);
    }
    public void stateName() {

       seleniumActions.enterValues(state,stname);
    }
    public void zpcode() {

       seleniumActions.enterValues(zipCode,zcode);
    }
    public void ssnnumber() {

        seleniumActions.enterValues(ssn,ssnnum);
    }


    public void enterUserName() {

        seleniumActions.enterValues(userName,uname);
    }
    public void enterPassword() {

        seleniumActions.enterValues(password,pswd);
    }
    public void enterRepeatPassword() {

       seleniumActions.enterValues(repeatPassword,repswd);
    }
    public void submit() {
        seleniumActions.elementNot1(submitButton);

    }

}

