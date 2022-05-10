package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPageObject;
    HomePage homePageObject;
    ViewSystemUsersPage viewSystemUsersPageObject;
    DashboardPage dashboardPageObject;
    AdminPage adminPageObject;
    AddUserPage addUserPageObject;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPageObject = new LoginPage();
        homePageObject = new HomePage();
        viewSystemUsersPageObject = new ViewSystemUsersPage();
        dashboardPageObject = new DashboardPage();
        addUserPageObject = new AddUserPage();
        adminPageObject = new AdminPage();
    }


    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.verifyWelComeMessage("Welcome");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.verifyLogo();

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.clickOnProfileLogo();
        homePageObject.clickOnLOgOut();
        loginPageObject.verifyLoginPanel("Login Panel");

    }


}




