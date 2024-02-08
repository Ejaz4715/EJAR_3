package sa.nhc.web.login;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import java.util.Map;

import static com.testcrew.api.UnirestAPI.logger;


public class ChangeLessorAndLessorRepresentative extends NHCWebTest {

    //----------------------------------One Owner Without Lessor Representative---------------------------------------

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
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.AddNewLessorRepresentativeToOwnerShipDocument();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyUpdateLessorRepresentative(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.updateCurrentLessorRepresentativeDFromOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.addNewLessorRepresentative();
        app.changeLessorAndLessorRepresentativePage.addLessorRepresentativeLegalDocument();
        app.changeLessorAndLessorRepresentativePage.uploadAttachment();
        app.changeLessorAndLessorRepresentativePage.ConfirmChangeLessorRepresentative();
    }

    @Test(dataProvider = "testDataProvider")
    public void VerifyDeleteLessorRepresentative(Map<String, String> data) throws Exception {
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
        logger.info("Step 02: Navigate to OwnerShip Document Page");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for OwnerShip Document");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.deleteLessorRepresentativeToOwnerShipDocument();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument("1-0002");
        app.changeLessorAndLessorRepresentativePage.assertLessorRepresentativeDeleted();
    }

    //-------------------------------------------ChangeLessor---------------------------------------

    @Test(dataProvider = "testDataProvider")
    public void VerifyUpdateLessor(Map<String, String> data , ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 02: Navigate to ownerShip document page , Search for ownership document");
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        logger.info("Step 03: Search for ownership document ,Neviagte To Change Lessor Page");
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data.get("OwnerShipReference"));
        app.changeLessorAndLessorRepresentativePage.NeviagteToChangeLessorPage();
        logger.info("Step 04: Change Lessor by add new ownership document");
        app.changeLessorAndLessorRepresentativePage.addOwnerShipDocumentNumber(data);
        app.changeLessorAndLessorRepresentativePage.addOwnerShipDocumentDetails(context);
        app.changeLessorAndLessorRepresentativePage.addNewLessorToOwnerShipDocument(data);
        app.changeLessorAndLessorRepresentativePage.getNameOfNewLessor();
        app.changeLessorAndLessorRepresentativePage.sendToLessorForApproved();
    }

    //------------------------------ApprovedChangeLessor-----------------------------------------

    @Test(dataProvider = "testDataProvider")
        public void VerifyApprovedLessor(Map<String, String> data) throws Exception {
            logger.info("Step 00: Test Data : " + data.toString());
            app.openApplication(data);
            app.loginPage.changeUILanguage("ar");
            app.loginPage.assertLoginPageDisplayed();
            logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
            app.loginPage.enterUsername(data.get("UserName"));
            app.loginPage.enterPassword(data.get("Password"));
            app.loginPage.clickLogin();
            app.loginPage.enterVerificationCode();
            app.loginPage.closeExploreEjarPopUp();
            app.changeLessorAndLessorRepresentativePage.NeviagteToRequestsPage(data);
            app.changeLessorAndLessorRepresentativePage.enterOTPForApproval("1234");
            app.changeLessorAndLessorRepresentativePage.clickVerifyIdentityBTN();
            app.changeLessorAndLessorRepresentativePage.assertLessorChange();
        }

    //------------------------------------CheckLessorIsUpdated----------------------------------------

    @Test(dataProvider = "testDataProvider")
        public void CheckLessorIsUpdated(Map<String, String> data) throws Exception {
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();
        logger.info("Step 01: Login to Application , Enter userName & password, Click Login");
        app.loginPage.enterUsername(data.get("UserName"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.changeLessorAndLessorRepresentativePage.neviagteToOwnerShipDocumentPage();
        app.changeLessorAndLessorRepresentativePage.searchForOwnershipDocument(data.get("New-DN"));
        app.changeLessorAndLessorRepresentativePage.checkNewLessorDetails();
    }
}