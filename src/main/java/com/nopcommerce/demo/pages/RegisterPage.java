package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameRequiredText;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameRequiredText;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailRequiredText;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement passwordRequiredText;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadioButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement fistName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'result']")
    WebElement registrationCompleteText;

    public String verifyRegistrationCompleteTextDisplay() {
        String message = getTextFromElement(registrationCompleteText);
        CustomListeners.test.log(Status.PASS, "Registration complete text display");
        Reporter.log("Registration complete text display" + registrationCompleteText.toString());
        return message;

    }

    public void enterEmail(String email_Id) {
        sendTextToElement(email, email_Id);
        CustomListeners.test.log(Status.PASS, "Enter emailId " + email_Id);
        Reporter.log("Enter emailId " + email.toString());

    }

    public void enterPassword(String password_field) {
        sendTextToElement(password, password_field);
        CustomListeners.test.log(Status.PASS, "Enter password " + password_field);
        Reporter.log("Enter password " + password.toString());

    }

    public void enterConfirmPassword(String confirm_password_field) {
        sendTextToElement(confirmPassword, confirm_password_field);
        CustomListeners.test.log(Status.PASS, "Enter confirm password " + confirm_password_field);
        Reporter.log("Enter confirm password " + confirmPassword.toString());

    }

    public void enterDay(String date) {
        sendTextToElement(day, date);
        CustomListeners.test.log(Status.PASS, "Enter date " + date);
        Reporter.log("Enter date " + day.toString());

    }

    public void enterMonth(String month_) {
        sendTextToElement(month, month_);
        CustomListeners.test.log(Status.PASS, "Enter month" + month_);
        Reporter.log("Enter month " + month.toString());

    }

    public void enterYear(String year_) {
        sendTextToElement(year, year_);
        CustomListeners.test.log(Status.PASS, "Enter year " + year_);
        Reporter.log("Enter year " + year.toString());

    }

    public void enterFirstName(String first_Name) {
        sendTextToElement(fistName, first_Name);
        CustomListeners.test.log(Status.PASS, "Enter First Name " + first_Name);
        Reporter.log("Enter First Name " + fistName.toString());

    }

    public void enterLastName(String last_Name) {
        sendTextToElement(lastName, last_Name);
        CustomListeners.test.log(Status.PASS, "Enter Last Name " + last_Name);
        Reporter.log("Enter Last Name " + lastName.toString());

    }


    public void clickOnFemaleRadioButton() {
        clickOnElement(femaleRadioButton);
        CustomListeners.test.log(Status.PASS, "Clicking on female radio button" + femaleRadioButton);
        Reporter.log("Clicking on female radio button" + femaleRadioButton.toString());

    }


    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Clicking on register link" + registerButton);
        Reporter.log("Clicking on register link" + registerButton.toString());

    }

    public String verifyFirstNameRequiredTextDisplay() {
        String message = getTextFromElement(firstNameRequiredText);
        CustomListeners.test.log(Status.PASS, "Get first name required text display");
        Reporter.log("Get first name required text display" + firstNameRequiredText.toString());
        return message;

    }

    public String verifyLastNameRequiredTextDisplay() {
        String message = getTextFromElement(lastNameRequiredText);
        CustomListeners.test.log(Status.PASS, "Get last name required text display");
        Reporter.log("Get last name required text display" + lastNameRequiredText.toString());
        return message;

    }

    public String verifyEmailRequiredTextDisplay() {
        String message = getTextFromElement(emailRequiredText);
        CustomListeners.test.log(Status.PASS, "Get Email required text display");
        Reporter.log("Get Email required text display" + emailRequiredText.toString());
        return message;

    }

    public String verifyPasswordRequiredTextDisplay() {
        String message = getTextFromElement(passwordRequiredText);
        CustomListeners.test.log(Status.PASS, "Get password required text display");
        Reporter.log("Get password required text display" + passwordRequiredText.toString());
        return message;

    }

    public String verifyRegisterTextDisplay() {
        String message = getTextFromElement(registerText);
        CustomListeners.test.log(Status.PASS, "Get register text");
        Reporter.log("Get register text" + registerText.toString());
        return message;

    }

}
