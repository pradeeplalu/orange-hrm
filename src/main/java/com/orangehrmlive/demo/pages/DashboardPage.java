package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardTextField;

    // Dashboard text Locator
    //and create appropriate methods for it.

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    public void getVerifyDashBoardText(String text) {
        verifyAssertText(dashBoardTextField, text);
    }
}
