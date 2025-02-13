package Pound_Land_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    SeleniumActions seleniumactions;

    public BasketPage(WebDriver driver) {
        seleniumactions = new SeleniumActions(driver);
    }

    By basketButton = By.xpath("(//span[@class='basket-amount']/span/span[@class='price'])[2]");
    By basketProductName = By.xpath("//div[contains(@class,'item-details')]/strong/a");
    By basketProductPrice = By.xpath("//span[@class='cart-price']/span");
    By removeProduct = By.xpath("(//li[@class='action-delete']/a/span[normalize-space()='Remove'])[2]");

    public void clickOnCartButton() {
        seleniumactions.clickOnElement(basketButton);
    }

    public String getbasketProductName() {
        return seleniumactions.getTextMessage(basketProductName);
    }

    public String getbasketProductPrice() {
        return seleniumactions.getTextMessage(basketProductPrice);
    }

    public void clickonremoveproduct() {
        seleniumactions.clickOnElement(removeProduct);
    }
}

