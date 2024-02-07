package sa.nhc.web.login;

import com.testcrew.manager.TestDataManager;
//
import com.testcrew.utility.Excel2CSVConvertor;
//import com.testcrew.utility.ExcelManager;
import com.testcrew.web.Browser;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;
public class ResidentialContract extends NHCWebTest{

    @Test(dataProvider = "testDataProvider")
    public void verifyBOOfficerNavigationToResidentialContractPage(Map<String, String> data) throws Exception {
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

        logger.info("Step 02: Navigate to EJAR Dashboard");
        app.addResidentialContractPage.clickContractsBtn();

        logger.info("Step 03: Navigate to Add New Residential page");
        app.addResidentialContractPage.selectNewResidualContract();

        logger.info("Step 04: Verify Add Residential Contract page is visible to the user");
        app.addResidentialContractPage.verifyAddResidentialContractPageIsVisible();
        Browser.close();
    }

    @Test(dataProvider = "testDataProvider")
    public void addNewResidentialContractWithDurationMoreThanThreeMonths(Map<String, String> data, ITestContext context) throws Exception {
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

        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();

        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "January يناير", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "January يناير", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();

        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Poroperty · 3333");
//        app.addResidentialContractPage.selectProperty("عمارة اوتوماشن 60 ・ 1223312");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
//        app.addResidentialContractPage.selectUnit("2030");
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();

        logger.info("Step 05: Select and confirm address from the map");
//        app.addResidentialContractPage.clickIdentifyAddressOnMapBTN();
//        app.addResidentialContractPage.clickConfirmBtnOnMap();
//        app.addResidentialContractPage.clickSaveBtnOnPropertyAddress();

        logger.info("Step 06: Navigate Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();

        logger.info("Step 07: Input Individual Information details > Confirm");
//        app.addResidentialContractPage.inputTenantPhoneNumber("509876567");
//        app.addResidentialContractPage.selectTenantRegion();
//        app.addResidentialContractPage.clickTenantCityDropdown();
//        app.addResidentialContractPage.selectTenantCity("Abdah");
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();

        logger.info("Step 08: Navigate to Financial > Input annual rent > Select payment frequency > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
//        app.addResidentialContractPage.addNewIbanBTN();
//        app.addResidentialContractPage.enterIbanNumber("SA2520000000000002323234");
//        app.addResidentialContractPage.enterAccountOwnerName("Test 2 Bank");
//        app.addResidentialContractPage.clickSaveBTNOnAddIban();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();

        logger.info("Step 09:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();

        logger.info("Step 10:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();

        logger.info("Step 11:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();

        logger.info("Step 12:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ResidentialContract", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ApproveContractLesser", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ApproveContractTenant", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "verifyContractStatusIsRegisteredAsBoManager", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();

        String contractID ="CT7657657657";
 /*   String contractID ="CT7657657657";
    String tenantID ="TN7687568765";
        TestDataManager.addDependantTestData("approveContractFromLesser","ContractID",contractID);
        TestDataManager.addDependantTestData("approveContractFromLesser","TenantID",tenantID);*/
        TestDataManager.addDependantTestData("approveContractFromLesser","ContractID",contractID);
        TestDataManager.writeDependantTestData("approveContractFromLesser");
        //data.putAll(TestDataManager.readDependantTestData("approveContractFromLesser"));
//        TestDataManager.addDependantTestData("approveContractFromTenant","ContractID",context.getAttribute("Contract number").toString());
//        TestDataManager.addDependantTestData("verifyContractStatusIsRegisteredAsBoManager","ContractID",context.getAttribute("Contract number").toString());

    }

    @Test(dataProvider = "testDataProvider")
    public void addNewResidentialContractWithDurationLessThanThreeMonths(Map<String, String> data,  ITestContext context) throws Exception {

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

        logger.info("Step 02: Navigate to Contracts > Add New Residential Contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectNewResidualContract();

        logger.info("Step 03: Input date > Select contract's duration from calender (More than 3 months) and confirm");
        app.addResidentialContractPage.clickDateInputField();
        app.addResidentialContractPage.selectStartDateOfResidualContract("20", "December ديسمبر", "2024");
        app.addResidentialContractPage.selectEndDateOfResidualContract("20", "February فبراير", "2025");
        app.addResidentialContractPage.clickConfirmPeriodBTN();

        logger.info("Step 04: Navigate to Add Property > Select property > Select unit and confirm");
        app.addResidentialContractPage.clickAddPropertyBTN();
        app.addResidentialContractPage.selectProperty("Poroperty · 3333");
        app.addResidentialContractPage.clickContinueWithThisPropertyBTN();
        app.addResidentialContractPage.clickContinueToSelectUnitsBTN();
        app.addResidentialContractPage.clickFilterBtnOnSelectUnitPage();
        app.addResidentialContractPage.selectUnitsAvailability();
        app.addResidentialContractPage.selectFirstAvailableUnit();
//        app.addResidentialContractPage.selectUnit("2030");
        app.addResidentialContractPage.clickConfirmPropertyDetailsBTN();

        logger.info("Step 05: Select and confirm address from the map");
//        app.addResidentialContractPage.clickIdentifyAddressOnMapBTN();
//        app.addResidentialContractPage.clickConfirmBtnOnMap();
//        app.addResidentialContractPage.clickSaveBtnOnPropertyAddress();

        logger.info("Step 06: Navigate Add Individual Tenant > Input Individual's identification details > Continue");
        app.addResidentialContractPage.clickContractPartiesBTN();
        app.addResidentialContractPage.clickAddIndividualTenantBTN();
        app.addResidentialContractPage.clickTenantRadioBTN();
        app.addResidentialContractPage.inputTenantNationalId(data.get("TenantID"));
        app.addResidentialContractPage.inputTenantDOB(data.get("TenantDOB"));
        app.addResidentialContractPage.clickContinueButtonOnTenantContractPage();

        logger.info("Step 07: Input Individual Information details > Confirm");
//        app.addResidentialContractPage.inputTenantPhoneNumber("509876567");
//        app.addResidentialContractPage.selectTenantRegion();
//        app.addResidentialContractPage.clickTenantCityDropdown();
//        app.addResidentialContractPage.selectTenantCity("Abdah");
        app.addResidentialContractPage.clickConfirmBtnOnTenantAddressPage();

        logger.info("Step 08: Navigate to Financial > Input annual rent > Select payment frequency > Add and select IBAN > Select account owner > Continue");
        app.addResidentialContractPage.clickFinancialTermsStepBTN();
        app.addResidentialContractPage.clickAddRentalContractTermsBTN();
        app.addResidentialContractPage.enterAnnulRent("12000");
        app.addResidentialContractPage.clickSinglePaymentFrequency();
        app.addResidentialContractPage.clickConfirmPaymentScheduleBTN();
        app.addResidentialContractPage.clickPayOnlineBTN();
//        app.addResidentialContractPage.addNewIbanBTN();
//        app.addResidentialContractPage.enterIbanNumber("SA2520000000000002323234");
//        app.addResidentialContractPage.enterAccountOwnerName("Test 2 Bank");
//        app.addResidentialContractPage.clickSaveBTNOnAddIban();
        app.addResidentialContractPage.selectIbanFromDropdown();
        app.addResidentialContractPage.selectLessorRadioBtnForAccountOwner();

        logger.info("Step 09:  Continue Additional Fees > Continue Financial terms");
        app.addResidentialContractPage.clickContinueToAdditionalFeeBTN();
        app.addResidentialContractPage.clickContinueFinancialTermsBTN();

        logger.info("Step 10:  Navigate to Terms And Conditions > Select Brokerage Office as Ejar fees payer > Select Governing Law");
        app.addResidentialContractPage.clickTermsAndConditionsStepBTN();
        app.addResidentialContractPage.clickAddTermsAndConditionsBTN();
        app.addResidentialContractPage.selectBrokerageOfficeAsEjarFeesPayer();
        app.addResidentialContractPage.selectGoverningLaw();
        app.addResidentialContractPage.clickConfirmTermsAndConditionsBTN();
        app.addResidentialContractPage.clickSubmitForApprovalBTN();

        logger.info("Step 11:  Submit the contract > Review all details > Submit");
        app.addResidentialContractPage.clickContinueBtnOnPreviewContractPage();
        app.addResidentialContractPage.clickContinuePayBtnOnPreviewBrokerageAgreementPage();
        app.addResidentialContractPage.clickDisclaimerCheckboxOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickConfirmAndSubmitBtnOnPayingEjarFeesPage();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.clickConfirmBtnOnCloseSurveyPopUp();

        logger.info("Step 12:  Get contract number > Search for the contract and verify the status has been changed");
        app.addResidentialContractPage.setContractNumberToContext(context);
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ResidentialContract", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ApproveContractLesser", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "ApproveContractTenant", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.writeToExcel("AddResidentialContract",
                "verifyContractStatusIsRegisteredAsBoManager", "ContractNumber(>3 months)",
                context.getAttribute("Contract number").toString());
        app.addResidentialContractPage.verifyContractStatusIsWaitingForApproval();
    }

    @Test(dataProvider = "testDataProvider")
    public void approveContractFromLesser(Map<String, String> data, ITestContext context) throws Exception {

       data.putAll(TestDataManager.readDependantTestData("approveContractFromLesser"));
        logger.info(data.get("ContractID").toString());
       /* logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();

        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();*/
//        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("contractID"));

        /*logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();*/
    }

    @Test(dataProvider = "testDataProvider")
    public void approveContractFromTenant(Map<String, String> data, ITestContext context) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();
        app.addResidentialContractPage.clickCloseBtnOnPopUp();

        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));

        logger.info("Step 03: Approve the contract");
        app.addResidentialContractPage.clickContractNumberOnContractViewPage();
        app.addResidentialContractPage.clickApproveContractBTN();
        app.addResidentialContractPage.clickLetsStartBTN();
        app.addResidentialContractPage.clickConfirmBTN();
        app.addResidentialContractPage.clickOnAgreementCheckbox();
        app.addResidentialContractPage.clickSubmitContractApprovalBTN();
        app.addResidentialContractPage.enterOTPForApproval("1234");
        app.addResidentialContractPage.clickVerifyIdentityBTN();
        app.addResidentialContractPage.clickCloseSurveyPopUpBTN();
        app.addResidentialContractPage.verifyApprovalIsSubmitted();
    }

    @Test(dataProvider = "testDataProvider")
    public void verifyContractStatusIsRegisteredAsBoManager(Map<String, String> data, ITestContext context) throws Exception {

        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Enter Email, Password > click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        app.loginPage.enterVerificationCode();
        app.loginPage.closeExploreEjarPopUp();

        logger.info("Step 02: Navigate to View All Contracts > Search for the contract");
        app.addResidentialContractPage.clickContractsBtn();
        app.addResidentialContractPage.selectViewAllContractsButton();
        app.addResidentialContractPage.clickFilterBtnOnViewAllContractsPage();
        app.addResidentialContractPage.enterContractNumberInContractSearchInputField(data.get("ContractNumber(>3 months)"));
        app.addResidentialContractPage.verifyContractStatusIsRegistered();

        TestDataManager.addDependantTestData("dataTesting","ContractID","TestValue");
        TestDataManager.addDependantTestData("dataTesting","ContractID","TestValue");

    }

    @Test(dataProvider = "testDataProvider")
    public void dataTesting(Map<String, String> data, ITestContext context) throws Exception {

        data.putAll(TestDataManager.readDependantTestData("dataTesting"));

        logger.info(data.get("ContractID"));

        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        String testData = data.get("ContractID");
        System.out.println(testData);

    }


}
