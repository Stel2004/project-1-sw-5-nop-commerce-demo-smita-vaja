package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    HomePage homePage = new HomePage();

    //Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement softwareLink;


    public String verifyComputerText() {
        String message = getTextFromElement(computerText);
        CustomListeners.test.log(Status.PASS, "Get computer text");
        Reporter.log("Get computer text" + computerText.toString());
        return message;
    }

    public void mouseOverToComputerAndClickOnDesktop(){
        mouseHoverToElement(homePage.computerLink);
        mouseHoverToElementAndClick(desktopLink);
        CustomListeners.test.log(Status.PASS,"Clicking on desktop link" + desktopLink);
        Reporter.log("Clicking on logout link" + desktopLink.toString());
    }






}
