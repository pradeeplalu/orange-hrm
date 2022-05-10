package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsersTest extends TestBase {

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
    public void adminShouldAddUserSuccessFully() {
        SoftAssert softAssertObject = new SoftAssert();
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.clickOnAdminTab();
        viewSystemUsersPageObject.verifySystemUserText("System Users");
        viewSystemUsersPageObject.clickOnAddButton();
        addUserPageObject.verifyAddUserText("Add12 User");
        addUserPageObject.selectRoleFromDropDown("Admin");
        addUserPageObject.enterEmployeeName("Ananya Dash");
        addUserPageObject.enterUserName("AnanyaDashz");
        addUserPageObject.selectStatusFromDropDown("Enabled");
        addUserPageObject.enterPassword("dfdfds");
        addUserPageObject.enterConfirmPassword("dfdfds");
        addUserPageObject.clickOnSaveButton();
        softAssertObject.assertAll();

    }

    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.clickOnAdminTab();
        viewSystemUsersPageObject.verifySystemUserText("System Users");
        viewSystemUsersPageObject.enteruserName("dilshad");
        viewSystemUsersPageObject.selectRoleFromDropDown("All");
        viewSystemUsersPageObject.selectStatusFromDropDown("All");
        viewSystemUsersPageObject.clickOnSearchButton();
        viewSystemUsersPageObject.verifyUserSearchList("dilshad");

    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.clickOnAdminTab();
        viewSystemUsersPageObject.verifySystemUserText("System Users");
        viewSystemUsersPageObject.enteruserName("Aravind");
        viewSystemUsersPageObject.selectRoleFromDropDown("All");
        viewSystemUsersPageObject.selectStatusFromDropDown("All");
        viewSystemUsersPageObject.clickOnSearchButton();
        viewSystemUsersPageObject.verifyUserSearchList("dilshad");
        viewSystemUsersPageObject.clickOnDeleteCheckforUser();
        Thread.sleep(1000);
        viewSystemUsersPageObject.clickOnDeleteButton();
        Thread.sleep(1000);
        viewSystemUsersPageObject.clickOnOkButtondelete();


    }


    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        loginPageObject.enterUsername("Admin");
        loginPageObject.enterPassword("admin123");
        loginPageObject.clickOnLoginButton();
        homePageObject.clickOnAdminTab();
        viewSystemUsersPageObject.verifySystemUserText("System Users");
        viewSystemUsersPageObject.enteruserName("dilshad");
        viewSystemUsersPageObject.selectRoleFromDropDown("All");
        viewSystemUsersPageObject.selectStatusFromDropDown("All");
        viewSystemUsersPageObject.clickOnSearchButton();
        viewSystemUsersPageObject.verifyNoRecordFound("No Records Found");

    }


}
