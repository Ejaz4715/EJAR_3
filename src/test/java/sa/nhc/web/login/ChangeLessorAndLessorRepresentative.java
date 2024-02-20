package sa.nhc.web.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

import static com.testcrew.api.UnirestAPI.logger;


public class ChangeLessorAndLessorRepresentative extends NHCWebTest {

    //----------------------------------OneOwnerWithLessorRepresentative---------------------------------------
    //---------------------------------------------------------------------------------------------------------



    @Test(dataProvider = "testDataProvider")
    public void VerifyAddLessorRepresentative(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to OwnerShip Document Page , Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.AddNewLessorRepresentativeToOwnerShipDocument();
    }


    //---------------------------------ChangeLessorRepresentative---------------------------
    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_04_WEB Verify Update The Lessor Representative",
            description = "Verify lessor representative has been updated")
    public void VerifyUpdateLessorRepresentative(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.updateCurrentLessorRepresentativeDFromOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.addNewLessorRepresentative(data);
        app.changeLessorAndLessorRepresentativePage.addLessorRepresentativeLegalDocument();
        app.changeLessorAndLessorRepresentativePage.uploadAttachment();
        app.changeLessorAndLessorRepresentativePage.ConfirmChangeLessorRepresentative();
        app.changeLessorAndLessorRepresentativePage.sendToLessorRepresentativeForApproved();
    }


    //---------------------------------ApproveUpdateLessorRepresentative---------------------------
    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_05_WEB Verify The Lessor Representative Approve The Update",
            description = "Verify lessor representative approved the change")
    public void VerifyLessorRepresentativeApproveTheUpdate(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.navigateToRequestsPageForUpdateLessorRepresentative(data);
        app.changeLessorAndLessorRepresentativePage.enterOTPForApproval("1234");
        app.changeLessorAndLessorRepresentativePage.clickVerifyIdentityBTN();
        app.changeLessorAndLessorRepresentativePage.assertLessorChangeOrLessorRepresentative();
    }


    //------------------------------------CheckLessorRepresentativeIsUpdated----------------------------------------
    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_06_WEB Check The Lessor Representative Is Updated",
            description = "Check lessor representative is updated")
    public void CheckLessorRepresentativeIsUpdated(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.checkNewLessorRepresentativeDetails();
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_10_WEB Verify Delete The Lessor Representative With Not Exist",
            description = "Verify Delete The Lessor Representative With Not Exist")
    public void VerifyDeleteLessorRepresentativeWithNotExist(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.deleteNoLessorRepresentative();

    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_11_WEB Verify Delete The Lessor Representative With More Than Owner",
            description = "Verify Delete The Lessor Representative With More Than Owner")
    public void VerifyDeleteLessorRepresentativeWithMoreThanOwner(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.deleteLessorRepresentativeWithMoreThanOwner();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_07_WEB Verify Delete The Lessor Representative",
            description = "Verify Delete The Lessor Representative")
    public void VerifyDeleteLessorRepresentative(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.deleteLessorRepresentativeToOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.ConfirmDeleteLessorRepresentative();
        app.changeLessorAndLessorRepresentativePage.sendToLessorForApproveTheDeletion();

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_08_WEB Verify The Lessor Representative Approve The Delete",
            description = "Verify The Lessor Representative Approve The Delete")
    public void VerifyLessorApproveTheDelete(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.navigateToRequestsPageForDeleteLessorRepresentative(data);
        app.changeLessorAndLessorRepresentativePage.enterOTPForApproval("1234");
        app.changeLessorAndLessorRepresentativePage.clickVerifyIdentityBTN();
        app.changeLessorAndLessorRepresentativePage.assertLessorChangeOrLessorRepresentative();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_09_WEB Check The Lessor Representative Is Deleted",
            description = "Check The Lessor Representative Is Deleted")
    public void CheckLessorRepresentativeIsDeleted(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.checkDeletedLessorRepresentativeDetails();
    }


    //-------------------------------------------ChangeLessorWithOneOwnerAndOneRepresentative---------------------------------------

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_01_WEB Verify Current Lessor Is Changed",
            description = "Verify lessor has been updated")
    public void VerifyUpdateLessor(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to ownerShip document page , Search for ownership document");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for ownership document ,Neviagte To Change Lessor Page");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.NeviagteToChangeLessorPage();
        logger.info("Step 04: Change Lessor by add new ownership document");
        app.changeLessorAndLessorRepresentativePage.addOwnerShipDocumentNumber(data);
        app.changeLessorAndLessorRepresentativePage.addOwnerShipDocumentDetails(data);
        app.changeLessorAndLessorRepresentativePage.addNewLessorToOwnerShipDocument(data);
        app.changeLessorAndLessorRepresentativePage.getNameOfNewLessor();
        app.changeLessorAndLessorRepresentativePage.sendToLessorForApproved();
    }

    //------------------------------ApprovedChangeLessor-----------------------------------------

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_02_WEB Verify Current Lessor Approve The Change",
            description = "Verify lessor approved the change")
    public void VerifyApprovedLessor(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.NeviagteToRequestsPage(data);
        app.changeLessorAndLessorRepresentativePage.enterOTPForApproval("1234");
        app.changeLessorAndLessorRepresentativePage.clickVerifyIdentityBTN();
        app.changeLessorAndLessorRepresentativePage.assertLessorChangeOrLessorRepresentative();
    }

    //------------------------------------CheckLessorIsUpdated----------------------------------------

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC_03_WEB Check Current Lessor Is Updated",
            description = "Check lessor is updated")
    public void CheckLessorIsUpdated(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForNewOwnershipDocument(data);
        app.changeLessorAndLessorRepresentativePage.checkNewLessorDetails();
    }


    @Test(dataProvider = "testDataProvider")
    public void VerifyContractVersionIsUpdated(Map<String, String> data) throws Exception {
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        app.changeLessorAndLessorRepresentativePage.enterOwnerShipDocumentInContractSearchInputField("1-010111");
        app.changeLessorAndLessorRepresentativePage.navigateToContractPageDetails(1);
        app.changeLessorAndLessorRepresentativePage.PDFValidation("10341891107" ,"Contract No. 10341891107 / 1-11");
        app.changeLessorAndLessorRepresentativePage.closeChildWindow();
        app.changeLessorAndLessorRepresentativePage.navigateToContractPageDetails(1);
    }
}

















