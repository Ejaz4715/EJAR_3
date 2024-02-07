package sa.nhc.web.login;

import com.testcrew.web.Browser;
import sa.nhc.web.base.NHCWebTest;
import org.testng.annotations.Test;

import java.util.Map;

public class TC01_LoginValid extends NHCWebTest {

    @Test(dataProvider = "testDataProvider")
    public void loginValid(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();

    }

    @Test(dataProvider = "testDataProvider")
    public void addPropertyIncludingLessor(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Add Property Including Lessor in all steps");
        app.addPropertyPage.addOwnershipDocument(data);
        app.addPropertyPage.addAnIndividual(data);
        app.addPropertyPage.addNewProperty(data);
        app.addPropertyPage.addNewUnit(data);
        app.addPropertyPage.verifyThePropertyCreated(data);
    }

    @Test(dataProvider = "testDataProvider")
    public void uploadPropertyAttachment(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();

        logger.info("Step 02: Upload Attachment related to property");
        app.addPropertyPage.uploadPropertyAttachment(data);

    }
    @Test(dataProvider = "testDataProvider")
    public void uploadOverSizeFileAttachment(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();

        logger.info("Step 02: Upload Attachment related to property");
        app.addPropertyPage.addOwnershipDocumentWithOverSize(data);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC04_VerifyAdminAbleToLoginToEjarSystem(Map<String, String> data) throws Exception {
        //TC04_Verify Admin able to log in to Ejar successfully.
        logger.info("Step : Login As Admin Enter valid UserName, Enter Password, click Login");
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        Browser.waitForSeconds(6);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC05_VerifyAdminNotAbleToLoginToEjarSystemWithInvalidData(Map<String, String> data) throws Exception {
        //TC04_Verify Admin able to log in to Ejar successfully.
        logger.info("Step : Login As Admin Enter invalid UserName, Enter invalid Password, click Login");
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        Browser.waitForSeconds(6);
    }
    @Test(dataProvider = "testDataProvider")
    public void TC11_VerifyBoOfficerAbleToLoginToEjarSystem(Map<String, String> data) throws Exception {
        //TC11_VerifyBoOfficerAbleToLoginToEjarSystem
        logger.info("Step : Login As Bo Officer Enter UserName, Enter Password, click Login ,Activated Account");
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
    }
    @Test(dataProvider = "testDataProvider")
    public void TC12_VerifyBoOfficerAbleToLoginAndActiveTheAccount(Map<String, String> data) throws Exception {
        //TC11_VerifyBoOfficerAbleToLoginToEjarSystem
        logger.info("Step : Login As Bo Officer Enter UserName, Enter Password, click Login ,Activated Account");
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.enterAdminUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.registrationPage.clickToAccountActivation();
        app.registrationPage.clickCityDropdown();
        app.registrationPage.selectBOCity("الرياض");
        app.registrationPage.fillAddress();
        app.registrationPage.selectOfficeLocated();
        app.registrationPage.clickOnFindOnMap();
        app.registrationPage.completeEarTraining();
    }
}
