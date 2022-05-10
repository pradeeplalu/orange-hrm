package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    @FindBy(xpath = "//h1[contains(text(),'System Users')]")
    WebElement systemUserTextField;

    // System Users Text, Username Field, User Roll dropDown, Employee Name Field,
    //Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's actions
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement usernameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRollDropDownField;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDownField;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButtonField;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButtonField;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButtonField;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButtonField;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement userSearchlist;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_43']")
    WebElement deleteCheckField;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement okButtonField;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement userNotFoundFiled;
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifySystemUserText(String text) {

        verifySoftAssertText(systemUserTextField, text);
    }

    public void enteruserName(String text) {
        sendTextToElement(usernameField, text);
    }

    public void selectRoleFromDropDown(String text) {
        selectByVisibleTextFromDropDown(userRollDropDownField, text);
    }


    public void enterEmployeeName(String text) {
        sendTextToElement(employeeNameField, text);
    }

    public void selectStatusFromDropDown(String text) {
        selectByVisibleTextFromDropDown(statusDropDownField, text);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButtonField);
    }

    public void clickOnResetButton() {
        clickOnElement(resetButtonField);
    }

    public void clickOnAddButton() {
        clickOnElement(addButtonField);
    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButtonField);
    }

    public void verifyUserSearchList(String text) {

        verifySoftAssertText(userSearchlist, text);
    }

    public void clickOnDeleteCheckforUser() {
        clickOnElement(deleteCheckField);
    }

    public void clickOnOkButtondelete() {
        clickOnElement(okButtonField);
    }

    public void verifyNoRecordFound(String text) {
        verifySoftAssertText(userNotFoundFiled, text);
    }
}