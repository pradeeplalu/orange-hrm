package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import lombok.extern.java.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    @FindBy(id = "txtUsername")
    WebElement userNameField;
    @FindBy(id = "txtPassword")
    WebElement passwordField;
    @FindBy(id = "btnLogin")
    WebElement loginButtonnField;
    @FindBy(id = "logInPanelHeading")
    WebElement loginPanelField;
    @FindBy(id = "logInPanelHeading")
    WebElement loginPanelText;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String text) {
        sendTextToElement(userNameField, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(passwordField, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButtonnField);
    }

    public void verifyLoginPanel(String text) {
        verifySoftAssertText(loginButtonnField, text);
    }
}
