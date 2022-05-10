package com.orangehrmlive.demo.pages;


import com.orangehrmlive.demo.utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


/**
 * Created by Neha
 */
public class HomePage extends Utility {

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminField;

// HomePage - Store OrangeHRM logo, Admin, PIM, Leave,Dashboard, Welcome Text locatores
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimField;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveField;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboardField;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeTextField;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logOutBtnField;
    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orangeHRMLogoField;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdminTab() {
        clickOnElement(adminField);
    }

    public void clickOnPIMTab() {
        clickOnElement(pimField);
    }

    public void clickOnLeaveTab() {
        clickOnElement(leaveField);
    }

    public void clickOnDasgBoardTab() {
        clickOnElement(dashboardField);
    }

    public void verifyWelComeMessage(String text) {
        verifySoftAssertText(welcomeTextField, text);
    }

    public void verifyLogo() {
        if (orangeHRMLogoField.isDisplayed()) {
            System.out.println(" Logo displayed");
        } else {
            System.out.println("Logo not displayed");
        }
    }

    public void clickOnProfileLogo() {
        clickOnElement(welcomeTextField);
    }

    public void clickOnLOgOut() {
        clickOnElement(logOutBtnField);
    }
}

