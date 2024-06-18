package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(), 'Computers ')]")
    WebElement computerLink;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutText;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement logInLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logOutButton;

    public String verifyLogoutLinkDisplay(){
        String message = getTextFromElement(logOutText);
        CustomListeners.test.log(Status.PASS, "Get logout link");
        Reporter.log("Get logout link" + logOutText.toString());
        return message;

    }
    public String verifyLogInLinkDisplay() {
        String message = getTextFromElement(logInLink);
        CustomListeners.test.log(Status.PASS, "Get login link");
        Reporter.log("Get login link" + logInLink.toString());
        return message;
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutButton);
        CustomListeners.test.log(Status.PASS,"Clicking on logOut link" + logOutButton);
        Reporter.log("Clicking on logout link" + logOutButton.toString());

    }


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS,"Clicking on login link" + loginLink);
        Reporter.log("Clicking on login link" + loginLink.toString());

    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS,"Clicking on register link");
        Reporter.log("Clicking on register link" + registerLink.toString());
    }

    public void clickOnComputerTabLink(){
        clickOnElement(computerLink);
        CustomListeners.test.log(Status.PASS,"Clicking on computer link");
        Reporter.log("Clicking on computer link" + computerLink.toString());
    }

}
