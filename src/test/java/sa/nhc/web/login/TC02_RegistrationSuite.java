package sa.nhc.web.login;

import com.testcrew.web.Browser;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;
import java.util.Map;

public class TC02_RegistrationSuite extends NHCWebTest {

   @Test(dataProvider = "testDataProvider")
   public void TC02_VerifyBoOfficerAbleToCreateRegistrationRequest(Map<String, String> data, ITestContext context) throws Exception {
      logger.info("Step : Navigate BO Registration Page,Registered As Bo Officer,Get Request Number");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      //TC01_Verify BO Officer able to Navigate to BO Registration page.
      app.registrationPage.NeviagteToBORegistration(data);
      //TC02_Verify BO Officer able to create registration request.
      app.registrationPage.clickToNextButton();
//      app.registrationPage.fillInvalidOfficeManagerInformation();
      app.registrationPage.fillValidOfficeManagerInformation(data);
//      app.registrationPage.fillInvalidIdentifyVerification();
      app.registrationPage.FillValidIdentifyVerification();
      app.registrationPage.clickToNextReviewButton();
//      app.registrationPage.fillInvalidBrokerageOfficeInformation();
      app.registrationPage.FillValidBrokerageOfficeInformation(data);
      app.registrationPage.FillRepresentationDocument(data);
      app.registrationPage.FillMobileNumber();
      app.registrationPage.ConfirmFillValidIdentifyVerification();
      app.registrationPage.NavigateToReviewPage();
   }

   @Test(dataProvider = "testDataProvider")
   public void TC03_VerifyBoOfficerAbleToCheckRegistrationStatus(Map<String, String> data, ITestContext context) throws Exception {
      logger.info("Step : Neviagte to Check BO Request Status,Search by request Number");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      //TC03_Verify BO Officer able to check the registration status.
      app.registrationPage.neviagteToCheckBORequestStatus();
      app.registrationPage.checkRequestNumberWithInvalidNumber(data);
      app.registrationPage.checkRequestNumberSubmitted(data);
   }

   @Test(dataProvider = "testDataProvider")
   public void TC06_VerifyAdminAbleToManageBOSubscriptions(Map<String, String> data) throws Exception {
      logger.info("Step : Login As Admin Enter Email, Enter Password, click Login ,click on Manage BO Subscriptions, View BO Subscription details");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      app.loginPage.enterAdminUsername(data.get("Username"));
      app.loginPage.enterPassword(data.get("Password"));
      app.loginPage.clickLogin();
      app.loginPage.enterVerificationCode();
      //TC05_Verify Admin able to Navigate to Manage BO Subscriptions page.
      app.registrationPage.NavigateToManageBOSubscriptionsPage();
      //TC06_Verify Admin able to check the Subscriptions status,
      //TC07_Verify Admin able to view Subscriptions details.
      app.registrationPage.SearchForBOSubscriptionsRequest(data);
   }

   @Test(dataProvider = "testDataProvider")
   public void TC07_VerifyAdminAbleToApprovedSubscriptionRequest(Map<String, String> data) throws Exception {
      logger.info("Step : Login As Admin Enter Email, Enter Password, click Login,click on Manage BO Subscriptions,Approved BO Subscription request");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      app.loginPage.enterAdminUsername(data.get("Username"));
      app.loginPage.enterBORegistrationPassword(data);
      app.loginPage.clickLogin();
      app.loginPage.enterVerificationCode();
      logger.info("Step : Click on Manage BO Subscriptions, View BO Subscription details");
      //TC05_Verify Admin able to Navigate to Manage BO Subscriptions page.
      app.registrationPage.NavigateToManageBOSubscriptionsPage();
      //TC06_Verify Admin able to check the Subscriptions status,
      //TC07_Verify Admin able to view Subscriptions details.
      app.registrationPage.SearchForBOSubscriptionsRequest(data);
      logger.info("Step : Click to Approved BO Subscription");
      app.registrationPage.ClickToApprovedBOSubscriptionsRequest();
      //TC09_Verify Admin able to log out from Ejar successfully.
      app.loginPage.clickLogout();
   }

   @Test(dataProvider = "testDataProvider")
   public void TC08_VerifyAdminAbleToRejectSubscriptionRequest(Map<String, String> data) throws Exception {
      logger.info("Step : Login As Admin Enter Email, Enter Password, click Login ,click on Manage BO Subscriptions , Reject Subscription Request");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      app.loginPage.enterAdminUsername(data.get("Username"));
      app.loginPage.enterBORegistrationPassword(data);
      app.loginPage.clickLogin();
      app.loginPage.enterVerificationCode();
      //TC05_Verify Admin able to Navigate to Manage BO Subscriptions page.
      app.registrationPage.NavigateToManageBOSubscriptionsPage();
      //TC06_Verify Admin able to check the Subscriptions status,
      //TC07_Verify Admin able to view Subscriptions details.
      app.registrationPage.SearchForBOSubscriptionsRequest(data);
      logger.info("Step : Click to Approved BO Subscription");
      app.registrationPage.ClickToRejectBOSubscriptionsRequest();
      //TC09_Verify Admin able to log out from Ejar successfully.
      app.loginPage.clickLogout();
   }

   @Test(dataProvider = "testDataProvider")
   public void TC09_VerifyBoOfficerAbleToCheckBORequestStatusAfterAdminTakeAction(Map<String,String>data) throws Exception {
      //TC10_Verify BO manager able to Navigate to Check BO request status page.
      logger.info("Step : As BO Officer check BO Request Status After Admin Approved/Reject");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      //TC01_Verify BO Officer able to Navigate to BO Registration page.
      app.registrationPage.neviagteToCheckBORequestStatus();
      //TC11_Verify BO manager able to check request status.
      app.registrationPage.checkRequestNumberApprovedOrReject(data);
   }

   @Test(dataProvider = "testDataProvider")
   public void TC10_VerifyBoOfficerAbleToCreateAccountAfterAdminApproval(Map<String,String> data ,ITestContext context) throws Exception {
      //TC10_Verify BO manager able to Navigate to Check BO request status page.
      logger.info("Step : Bo Officer Create an Account After Admin Approved the Request");
      app.openApplication(data);
      app.loginPage.changeUILanguage("ar");
      //TC01_Verify BO Officer able to Navigate to BO Registration page.
      app.registrationPage.neviagteToCheckBORequestStatus();
      //TC11_Verify BO manager able to check request status.
      app.registrationPage.checkRequestNumberApprovedOrReject(data);
      app.registrationPage.CreateBoOfficerAccount(context);
   }
}