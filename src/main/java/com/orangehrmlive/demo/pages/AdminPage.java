package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagementField;

    //UserManagement, Job, Organization Tabs Locators and it's actions
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobfield;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organizationField;
    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    public void mouseOverUserManagement() {
        mouseHoverToElement(userManagementField);
    }

    public void jobtab() {
        mouseHoverToElement(jobfield);
    }

    public void mouseorganisationTab() {
        mouseHoverToElement(organizationField);
    }


}
