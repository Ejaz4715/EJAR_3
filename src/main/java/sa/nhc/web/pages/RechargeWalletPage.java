package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
//import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import sa.nhc.web.objects.LoginPageObjects;
import sa.nhc.web.objects.RechargeWalletPageObjects;

import javax.naming.Context;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.logging.Logger;

import static com.testcrew.web.Browser.driver;
import static com.testcrew.web.Browser.logger;

public class RechargeWalletPage extends WebBasePage {
    public void rechargeWallet() throws Exception{
         Browser.waitForSeconds(3);
            Browser.waitForSeconds(3);
            Browser.click(RechargeWalletPageObjects.rechargeButton());
            Browser.waitForSeconds(3);
            Browser.click(RechargeWalletPageObjects.chargeWalletButton());
            Browser.click(RechargeWalletPageObjects.enterAmount());
            Browser.setText(RechargeWalletPageObjects.enterAmount(),"125");
            Browser.click(RechargeWalletPageObjects.clickNexxtButton());
            Browser.waitForSeconds(10);
            Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.madaPayButton(),10);
            Browser.click(RechargeWalletPageObjects.madaPayButton());
//        Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.cardNumberButton(),20);
//        if(Browser.isElementPresent(RechargeWalletPageObjects.cardNumberButton())){
            Browser.waitForSeconds(14);
            driver.switchTo().frame("card.number");
            Browser.waitForSeconds(3);
            Browser.click(RechargeWalletPageObjects.cardNumberButton());
            Browser.setText(RechargeWalletPageObjects.cardNumberButton(),"4464040000000007");
            driver.switchTo().defaultContent();
            Browser.click(RechargeWalletPageObjects.expiryDateButton());
            Browser.setText(RechargeWalletPageObjects.expiryDateButton(),"07/29");
            Browser.waitForSeconds(2);
            Browser.click(RechargeWalletPageObjects.cardNameButton());
            Browser.setText(RechargeWalletPageObjects.cardNameButton(),"test");
            Browser.waitForSeconds(2);
            driver.switchTo().frame("card.cvv");
            Browser.click(RechargeWalletPageObjects.enterCardCVV());
            Browser.waitForSeconds(2);
            Browser.setText(RechargeWalletPageObjects.enterCardCVV(),"100");

            driver.switchTo().defaultContent();
            Browser.click(RechargeWalletPageObjects.clickPayButton());
            Browser.waitForSeconds(2);

//        Browser.click(RechargeWalletPageObjects.testPaymentWindow());

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.TAB).perform();
            Browser.waitForSeconds(2);
            actions.sendKeys(Keys.TAB).perform();
            Browser.waitForSeconds(2);
            actions.sendKeys(Keys.ENTER).perform();
            Browser.waitForSeconds(2);
//        Browser.click(RechargeWalletPageObjects.submitButton());
//        Browser.waitForSeconds(3);
            Browser.isElementPresent(RechargeWalletPageObjects.rechargeWalletMessage());
            Browser.waitForSeconds(3);
            Browser.click(RechargeWalletPageObjects.closePopUpButton());
            logger.addScreenshot("Wallet has been recharged successfully");
        }
//    }

    public void closePopUp() throws Exception{
        Browser.waitForSeconds(6);
        Browser.click(LoginPageObjects.popUpButton());
    }

    public void addIban() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(LoginPageObjects.wallet());
//        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.addIban(),8);
        Browser.waitForSeconds(6);
        Browser.click(RechargeWalletPageObjects.addIban());
        Browser.waitForSeconds(12);
        if(Browser.isElementPresent(RechargeWalletPageObjects.addNewIbanButton())){
            Browser.click(RechargeWalletPageObjects.addNewIbanButton());
        }
//        Browser.click(RechargeWalletPageObjects.addNewIbanButton());
        Browser.waitForSeconds(2);
        Browser.click(RechargeWalletPageObjects.clickIbanNumber());
        Browser.setText(RechargeWalletPageObjects.clickIbanNumber(),"SA0420000000002344564764");
        Browser.waitForSeconds(2);
        Browser.click(RechargeWalletPageObjects.accountOwnerName());
        Browser.setText(RechargeWalletPageObjects.accountOwnerName(),"test");
        Browser.waitForSeconds(2);
        Browser.click(RechargeWalletPageObjects.bankName());
        Browser.setText(RechargeWalletPageObjects.bankName(),"Riyadh Bank");
        Browser.waitForSeconds(2);
        Browser.click(RechargeWalletPageObjects.bankAddress());
        Browser.setText(RechargeWalletPageObjects.bankAddress(),"Riyadh");
        Browser.click(RechargeWalletPageObjects.saveButton());
        Browser.waitForSeconds(3);
        if(Browser.isElementPresent(By.xpath("//input[@id = 'index_1']"))){
            Browser.waitForSeconds(3);
            Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
            Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
            Browser.waitForSeconds(2);
            Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.verifyIdentityBTN(), 20);
            Browser.click(RechargeWalletPageObjects.verifyIdentityBTN());
        }
     /*   Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(RechargeWalletPageObjects.verifyIdentityBTN(), 20);
        Browser.click(RechargeWalletPageObjects.verifyIdentityBTN());*/
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
    }

    public void chooseOfficer(String officer) throws Exception {
//        Browser.waitForSeconds(4);
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.officerButton(),20);
        Browser.click(LoginPageObjects.officerButton());
        if(officer.equals("BO_Manager")){
            Browser.waitUntilVisibilityOfElement(LoginPageObjects.manageAccountButton(),20);
            Browser.click(LoginPageObjects.manageOfficeButton());
        }
        else if(officer.equals("Tenant") || officer.equals("Lesser")){
            Browser.waitUntilVisibilityOfElement(LoginPageObjects.manageAccountButton(),20);
            Browser.click(LoginPageObjects.manageAccountButton());
        }
        logger.addScreenshot("Officer has been selected successfully");
        Browser.waitForSeconds(2);
    }
}
