package sa.nhc.web.pages;

//
import com.testcrew.web.Browser;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.nhc.web.objects.AddResidentialContractPageObjects;

import org.openqa.selenium.WebElement;
import sa.nhc.web.objects.LoginPageObjects;
import sa.nhc.web.objects.ContractsApprovalPageObjects;

import java.util.List;

public class AddResidentialContractPage {

    /*
    * Click date input field
    * */
    public void clickDateInputField() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickDateInputField(), 5);
        Browser.click(AddResidentialContractPageObjects.clickDateInputField());
    }

    /*
     * Click on Contracts Button
     * */
    public void clickContractsBtn() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.contractButton(), 20);
        Browser.click(LoginPageObjects.contractButton());
    }

    public void selectViewAllContractsButton() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.viewAllContractsButton(), 20);
        Browser.click(LoginPageObjects.viewAllContractsButton());
    }


    /*
     * Select New Residual Contract
     * */
    public void selectNewResidualContract() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.optionCreateNewContract(), 5);
        Browser.click(LoginPageObjects.optionCreateNewContract());
        Browser.takeScreenshot();
    }

    /*
     * Select Start date of contract
     * */
    public void selectEndDateOfResidualContract(String day, String month, String year) throws Exception{
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractEndYear(), 5);
        Browser.click(AddResidentialContractPageObjects.clickContractEndYear());


        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndYear());
        for (WebElement y : listYear){
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)){
                y.click();
                break;
            }
        }

         //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractEndMonth(), 5);
        Browser.click(AddResidentialContractPageObjects.clickContractEndMonth());
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndMonth());
        String [] monthArray = month.split(" ");
        for (WebElement m : listMonth){
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])){
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectContractEndDay(), 5);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractEndDay());
        for (WebElement d : listDay){
            String getDay = d.getText();
            if (getDay.equalsIgnoreCase(day)){
                d.click();
                break;
            }
        }
    }


    /*
     * Select End date of contract
     * */
    public void selectStartDateOfResidualContract(String day, String month, String year) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractStartYear(), 5);
        Browser.click(AddResidentialContractPageObjects.clickContractStartYear());

        //Select year
        List<WebElement> listYear = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartYear());
        for (WebElement y : listYear){
            String getYear = y.getText();
            if (getYear.equalsIgnoreCase(year)){
                y.click();
                break;
            }
        }

        //Select month
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.clickContractStartMonth(), 5);
        Browser.click(AddResidentialContractPageObjects.clickContractStartMonth());
        String [] monthArray = month.split(" ");
        List<WebElement> listMonth = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartMonth());
        for (WebElement m : listMonth){
            String getMonth = m.getText();
            if (getMonth.equalsIgnoreCase(monthArray[0]) || getMonth.equalsIgnoreCase(monthArray[1])){
                m.click();
                break;
            }
        }

        //Select day
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectContractStartDay(), 10);
        List<WebElement> listDay = Browser.driver.findElements(AddResidentialContractPageObjects.selectContractStartDay());
        for (WebElement d : listDay){
            String getMonth = d.getText();
            if (getMonth.equalsIgnoreCase(day)){
                Browser.waitForSeconds(2);
                d.click();
                break;
            }
        }
    }

    public void clickConfirmPeriodBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmPeriodBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.confirmPeriodBTN());
        Browser.takeScreenshot();
    }

    public void clickAddPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.coveredPropertyUnitsBTN(), 20);
        Browser.waitForSeconds(5);
        Browser.click(AddResidentialContractPageObjects.coveredPropertyUnitsBTN());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addPropertyBTN(), 10);
        Browser.click(AddResidentialContractPageObjects.addPropertyBTN());
    }

    public void selectProperty(String propertyName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.propertyName(), 5);
        Browser.waitForSeconds(2);
        List<WebElement> listPropertyNames = Browser.driver.findElements(AddResidentialContractPageObjects.propertyName());
        for (WebElement property : listPropertyNames){
            String getPropertyName = property.getText();
            if (getPropertyName.equalsIgnoreCase(propertyName)){
                property.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }

    public void clickContinueWithThisPropertyBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueWithThisPropertyBTN(), 5);
        Browser.click(AddResidentialContractPageObjects.continueWithThisPropertyBTN());
    }

    public void clickContinueToSelectUnitsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToSelectUnitsBTN(), 10);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueToSelectUnitsBTN());
    }

    public void clickFilterBtnOnSelectUnitPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnSelectUnitsPage(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnSelectUnitsPage());
    }

    public void selectUnitsAvailability() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectUnitsAvailability(), 10);
        Browser.waitForSeconds(2);
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.selectUnitsAvailability(), 1);
    }

    public void selectUnit(String inputUnit) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectUnit(), 10);
        Browser.waitForSeconds(2);
        List<WebElement> listUnits = Browser.driver.findElements(AddResidentialContractPageObjects.selectUnit());
        for (WebElement unit : listUnits){
            String getUnitNum= unit.getText();
            System.out.println("unit number is " + getUnitNum);
            if (getUnitNum.contains(inputUnit)){
                unit.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }
    public void selectFirstAvailableUnit() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectFirstAvailableUnit(), 10);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.selectFirstAvailableUnit());
        Browser.takeScreenshot();
    }

    public void clickConfirmPropertyDetailsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmPropertyDetailsBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmPropertyDetailsBTN());
        Browser.takeScreenshot();
    }

    public void clickIdentifyAddressOnMapBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.identifyAddressOnMapBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.identifyAddressOnMapBTN());
    }

    public void clickConfirmBtnOnMap() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnMap(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnMap());
        Browser.takeScreenshot();
    }

    public void clickSaveBtnOnPropertyAddress() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBtnOnPropertyAddress(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.saveBtnOnPropertyAddress());
    }

    public void clickContractPartiesBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractPartiesStepBTN(), 30);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.contractPartiesStepBTN());
    }

    public void clickAddIndividualTenantBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addIndividualTenantBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.addIndividualTenantBTN());
        Browser.takeScreenshot();
    }

    public void clickTenantRadioBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRadioBTN(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.tenantRadioBTN());
    }

    public void inputTenantNationalId(String nationalId) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantNationalIdInput(), 5);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.tenantNationalIdInput(), nationalId);
    }

    public void inputTenantDOB(String DOB) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantDateOfBirthInput(), 5);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.tenantDateOfBirthInput(), DOB);
    }

    public void clickContinueButtonOnTenantContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnIndividualContractPage());
        Browser.takeScreenshot();
    }


    public void inputTenantPhoneNumber(String phoneNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantPhoneNumberInput(), 5);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.tenantPhoneNumberInput(), phoneNumber);
    }

    public void selectTenantRegion() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantRegionDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.tenantRegionDropdown());
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.tenantRegionDropdown(), 1);
    }
    public void clickTenantCityDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.tenantCityDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.tenantCityDropdown());
    }
    public void selectTenantCity(String city) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectTenantCity(), 5);
        Browser.waitForSeconds(2);
        List<WebElement> listCity = Browser.driver.findElements(AddResidentialContractPageObjects.selectTenantCity());
        for (WebElement cityName : listCity){
            String getCityName = cityName.getText();
            if (getCityName.contains(city)){
                cityName.click();
                Browser.waitForSeconds(2);
                break;
            }
        }
        Browser.takeScreenshot();
    }
    public void clickConfirmBtnOnTenantAddressPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnTenantAddressPage());
        Browser.takeScreenshot();
    }

    public void verifyAddResidentialContractPageIsVisible() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addResidentialContractDashboard(), 15);
        Assert.assertTrue(Browser.isElementPresent(AddResidentialContractPageObjects.addResidentialContractDashboard()), "Add Residential Contract dashboard is not visible");
        Browser.takeScreenshot();
    }

    public void clickFinancialTermsStepBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.financialTermsStepBTN(), 15);
        Browser.click(AddResidentialContractPageObjects.financialTermsStepBTN());
    }

    public void clickAddRentalContractTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addRentalContractTermsBTN(), 15);
        Browser.waitForSeconds(3);
        Browser.click(AddResidentialContractPageObjects.addRentalContractTermsBTN());
    }

    public void enterAnnulRent(String rent) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.annualRentInputField(), 15);
        Browser.setText(AddResidentialContractPageObjects.annualRentInputField(), rent);
        Browser.takeScreenshot();
    }
    public void clickSinglePaymentFrequency() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.singlePaymentRadioBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.singlePaymentRadioBTN());
    }
    public void clickConfirmPaymentScheduleBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToBillingScheduleBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueToBillingScheduleBTN());
    }

    public void clickPayOnlineBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.payOnlineBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.payOnlineBTN());
    }

    public void addNewIbanBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addNewIbanBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.addNewIbanBTN());
        Browser.takeScreenshot();
    }

    public void enterIbanNumber(String ibanNumber) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanNumberInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.ibanNumberInputField(), ibanNumber);
    }

    public void enterAccountOwnerName(String ownerName) throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.accountOwnerNameInputField(), 15);
        Browser.waitForSeconds(2);
        Browser.setText(AddResidentialContractPageObjects.accountOwnerNameInputField(), ownerName);
    }

    public void clickSaveBTNOnAddIban() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.saveBTNonAddNewIban(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.saveBTNonAddNewIban());
        Browser.takeScreenshot();
    }

    public void selectIbanFromDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.selectIbanDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.selectIbanDropdown());
        Browser.selectDropdownByIndex(AddResidentialContractPageObjects.selectIbanDropdown(), 1);
    }

    public void selectLessorRadioBtnForAccountOwner() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.ibanAccountOwnerRadioBTN());
    }

    public void clickContinueToAdditionalFeeBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueToAdditionalFeeBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueToAdditionalFeeBTN());
    }
    public void clickContinueFinancialTermsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueFinancialTermsBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueFinancialTermsBTN());
        Browser.takeScreenshot();
    }

    public void clickTermsAndConditionsStepBTN() throws Exception {
        Browser.waitUntilElementToBeClickable(AddResidentialContractPageObjects.termsAndConditionsStepBTN(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.termsAndConditionsStepBTN());
    }

    public void clickAddTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.addTermsAndConditionsBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.addTermsAndConditionsBTN());
        Browser.takeScreenshot();
    }

    public void selectBrokerageOfficeAsEjarFeesPayer() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.ejarFeesPayerRadioBTN());
    }

    public void selectGoverningLaw() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.governingLawRadioBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.governingLawRadioBTN());
    }

    public void clickConfirmTermsAndConditionsBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN(), 15);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmTermsAndConditionsBTN());
        Browser.takeScreenshot();
    }

    public void clickSubmitForApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.submitForApprovalBTN(), 35);
        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(AddResidentialContractPageObjects.submitForApprovalBTN());
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.submitForApprovalBTN());
        Browser.takeScreenshot();
    }

    public void clickContinueBtnOnPreviewContractPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage(), 60);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continueBtnOnPreviewContractPage());
    }

    public void clickContinuePayBtnOnPreviewBrokerageAgreementPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.continuePayBtnOnPreviewBrokerageAgreementPage());
    }

    public void clickDisclaimerCheckboxOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.disclaimerCheckboxOnPayingEjarFeesPage());
        Browser.takeScreenshot();
    }

    public void clickConfirmAndSubmitBtnOnPayingEjarFeesPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmAndSubmitBtnOnPayingEjarFeesPage());
        Browser.takeScreenshot();
    }

    public void verifyContractStatusIsWaitingForApproval() throws Exception {
        String [] expectedStatus = {"بانتظار موافقة الأطراف ", "Waiting Parties Approval"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        Browser.waitForSeconds(2);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertFalse(false);
        }
        Browser.takeScreenshot();
    }

    public void clickCloseSurveyPopUpBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.closeSurveyPopUpBTN(), 95);
        Browser.waitForSeconds(5);
        Browser.click(AddResidentialContractPageObjects.closeSurveyPopUpBTN());
        Browser.takeScreenshot();
    }

    public void clickConfirmBtnOnCloseSurveyPopUp() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.confirmBtnOnCloseSurveyPopUp(), 35);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.confirmBtnOnCloseSurveyPopUp());
    }

    public String getContractNumber() throws Exception {
        Browser.waitForSeconds(2);
        String number = Browser.getWebElement(AddResidentialContractPageObjects.contractNumber()).getText();
        String contractNumber = number.split("#")[1];
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "AddResidentialContract",
//                "addNewResidentialContractWithDurationMoreThanThreeMonths", "ContractNumber", contractNumber);
        return contractNumber;
    }

    public void clickFilterBtnOnViewAllContractsPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage(), 20);
        Browser.click(AddResidentialContractPageObjects.filterBtnOnViewAllContractsPage());
        Browser.takeScreenshot();
    }

    public void enterContractNumberInContractSearchInputField(String contractNumber) throws Exception {
        Browser.waitForSeconds(3);
        Browser.setText(AddResidentialContractPageObjects.searchContractNumberInputField(), contractNumber);
        Browser.takeScreenshot();
    }

    public void setContractNumberToContext(ITestContext context) throws Exception{
        String contractNumber= getContractNumber();
        context.setAttribute("Contract number",contractNumber);
    }
    public void writeToExcel (String sheetName, String reference, String columnName, String data){
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(),sheetName ,reference, columnName, data);
    }
    public void clickContractNumberOnContractViewPage() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractNumberTextOnViewContractsPage(), 20);
        Browser.waitForSeconds(5);
        Browser.click(AddResidentialContractPageObjects.contractNumberTextOnViewContractsPage());
        Browser.takeScreenshot();
    }

    public void clickApproveContractBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.approveContractBTN(), 20);
        Browser.waitForSeconds(2);
        Browser.click(AddResidentialContractPageObjects.approveContractBTN());
        Browser.takeScreenshot();
    }

    /*
    * Contract Approval
    * */
    public void clickLetsStartBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.letsStartBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.letsStartBTN());
        Browser.takeScreenshot();
    }

    public void clickConfirmBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.confirmBTN(), 20);
        Browser.waitForSeconds(2);
        Browser.click(ContractsApprovalPageObjects.confirmBTN());

        //Handle the dynamic requirement of double-click on Confirm BTN
        if (!Browser.isElementPresent(ContractsApprovalPageObjects.agreementCheckbox())){
            Browser.waitForSeconds(2);
            Browser.click(ContractsApprovalPageObjects.confirmBTN());
        }
        Browser.takeScreenshot();
    }

    public void clickOnAgreementCheckbox() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.agreementCheckbox(), 20);
        Browser.click(ContractsApprovalPageObjects.agreementCheckbox());
        Browser.takeScreenshot();
    }

    public void clickSubmitContractApprovalBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.submitContractApprovalBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.submitContractApprovalBTN());
        Browser.takeScreenshot();
    }

    public void enterOTPForApproval(String otp) throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.OTPButton(), 20);
        Browser.setText(ContractsApprovalPageObjects.OTPButton(), otp);
        Browser.takeScreenshot();
    }

    public void clickVerifyIdentityBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.verifyIdentityBTN(), 20);
        Browser.click(ContractsApprovalPageObjects.verifyIdentityBTN());
        Browser.takeScreenshot();
    }

    public void verifyApprovalIsSubmitted() throws Exception {
        Browser.waitUntilVisibilityOfElement(ContractsApprovalPageObjects.approvalSubmittedText(), 20);
        Assert.assertTrue(Browser.isElementPresent(ContractsApprovalPageObjects.approvalSubmittedText()));
        Browser.takeScreenshot();
    }

    public void verifyContractStatusIsRegistered() throws Exception {
        boolean status = false;
        String [] expectedStatus = {"Registered", "مُسجل"};
        Browser.waitUntilVisibilityOfElement(AddResidentialContractPageObjects.contractStatus(), 35);
        Browser.waitForSeconds(2);
        String actualStatus = Browser.getWebElement(AddResidentialContractPageObjects.contractStatus()).getText();
        Browser.executeJSScroll(1000);
        if (actualStatus.equalsIgnoreCase(expectedStatus[0]) || actualStatus.equalsIgnoreCase(expectedStatus[1])){
            status = true;
        }
        Assert.assertTrue(status, "Contract status is not Registered");
    }


    public void clickCloseBtnOnPopUp() throws Exception {
        Browser.waitForSeconds(3);
        if (Browser.isElementPresent(ContractsApprovalPageObjects.closeBtnOnPopUp())){
            Browser.click(ContractsApprovalPageObjects.closeBtnOnPopUp());
        }
    }

}
