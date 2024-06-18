package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "smock", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        // Verify "Register" text
        String expectedErrorMessage = "Register";
        String actualErrorMessage = registerPage.verifyRegisterTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "register text not display");

    }

    @Test(groups = {"smock", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        // Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        // Verify the error message "First name is required."
        String expectedErrorMessage = "First name is required.";
        String actualErrorMessage = registerPage.verifyFirstNameRequiredTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "firstname required text not display");
        // Verify the error message "Last name is required."
        expectedErrorMessage = "Last name is required.";
        actualErrorMessage = registerPage.verifyLastNameRequiredTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "lastname required text not display");
        // Verify the error message "Email is required."
        expectedErrorMessage = "Email is required.";
        actualErrorMessage = registerPage.verifyEmailRequiredTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "email required text not display");
        // Verify the error message "Password is required."
        expectedErrorMessage = "Password is required.";
        actualErrorMessage = registerPage.verifyPasswordRequiredTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "password required text not display");

    }

    @Test(groups = "regression")
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        //Click on Register Link
        homePage.clickOnRegisterLink();
        // Select gender "Female"
        registerPage.clickOnFemaleRadioButton();
        // Enter firstname
        registerPage.enterFirstName("Smita");
        // Enter lastname
        registerPage.enterLastName("Vaja");
        // Select day
        registerPage.enterDay("15");
        // Select month
        registerPage.enterMonth("August");
        // Select year
        registerPage.enterYear("1992");
        // Enter email
        String randomString = getRandomString(5);
        registerPage.enterEmail("smitavaja"+randomString+"@gmail.com");
        //Enter password
        registerPage.enterPassword("Admin@1234");
        //Enter confirm password
        registerPage.enterConfirmPassword("Admin@1234");
        //click on register button
        registerPage.clickOnRegisterButton();
        //Verify message "Your registration completed"
        String expectedErrorMessage = "Your registration completed";
        String actualErrorMessage = registerPage.verifyRegistrationCompleteTextDisplay();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "registration complete text not display");
    }
}
