package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class DesktopsPage extends Utility {
    //Desktops text, Sortby, Display, selectProductList Locators
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement desktopText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "#products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement buildYourOwnComputer;


    public String verifyDesktopText(){
        String message = getTextFromElement(desktopText);
        CustomListeners.test.log(Status.PASS, "Get desktop text");
        Reporter.log("Get desktop text" + desktopText.toString());
        return message;
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        CustomListeners.test.log(Status.PASS,"Clicking on logOut link" + buildYourOwnComputer);
        Reporter.log("Clicking on logout link" + buildYourOwnComputer.toString());

    }



}
