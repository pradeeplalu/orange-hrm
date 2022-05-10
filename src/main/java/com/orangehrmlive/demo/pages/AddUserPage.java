package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDownField;

    //User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
    //Save and Cancle Button Locators and it's actions
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeNameField;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userNameField;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDownField;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement passWordField;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButtonField;
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButtonField;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserTextfield;

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectRoleFromDropDown(String text) {
        selectByVisibleTextFromDropDown(userRoleDropDownField, text);
    }

    public void enterEmployeeName(String text) {
        sendTextToElement(employeeNameField, text);
    }

    public void enterUserName(String text) {
        sendTextToElement(userNameField, text);
    }

    public void selectStatusFromDropDown(String text) {
        selectByVisibleTextFromDropDown(statusDropDownField, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(passWordField, text);
    }

    public void enterConfirmPassword(String text) {
        sendTextToElement(confirmPasswordField, text);
    }


    public void clickOnSaveButton() {
        clickOnElement(saveButtonField);
    }

    public void clickOnCancelButton() {
        clickOnElement(cancelButtonField);
    }

    public void verifyAddUserText(String text) {
        verifySoftAssertText(addUserTextfield, text);
    }

}
