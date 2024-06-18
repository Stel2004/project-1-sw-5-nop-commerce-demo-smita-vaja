package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "smock", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        //Click on login link
        homePage.clickOnLoginLink();
        //verify that "Welcome, Please Sign In!" message display
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test(groups = {"sanity", "smock", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.enterEmailId("smitavaja@gmail.com");
        //Enter Password
        loginPage.enterPassword("Admin@123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Test(groups = {"smock", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.enterEmailId("smitavaja@gmail.com");
        //Enter Password
        loginPage.enterPassword("Admin@1234");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Verify that LogOut link is display
        String expectedErrorMessage = "Log out";
        String actualErrorMessage = homePage.verifyLogoutLinkDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "LogOut Link not display");

    }

    @Test(groups = "regression")
    public void verifyThatUserShouldLogOutSuccessFully() {
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter email id
        loginPage.enterEmailId("smitavaja@gmail.com");
        //Enter password
        loginPage.enterPassword("Admin@1234");
        //Click on login button
        loginPage.clickOnLoginButton();
        //click on logout button
        homePage.clickOnLogOutButton();
        //Verify that LogIn Link Display
        String expectedErrorMessage = "Log in";
        String actualErrorMessage = homePage.verifyLogInLinkDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Login Link not display");

    }
}

