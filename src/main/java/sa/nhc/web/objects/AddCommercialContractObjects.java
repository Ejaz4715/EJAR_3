package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class AddCommercialContractObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {{

        put("option-new-residential-contract", new HashMap<>(){{
            put ("en", "//span[text()='Create new residential']");
            put ("ar", "//span[text()='تسجيل عقد سكني']");
        }});
        put("btn-contracts", new HashMap<>(){{
            put ("en", "//a[text()=' Contracts ']");
            put ("ar", "//a[text()=' العقود ']");
        }});
        put("date-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"contract_start_date\"]");
            put ("ar", "//input[@data-name=\"contract_start_date\"]");
        }});
        put("click-start-year", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"year-selection\"])[1]");
            put ("ar", "(//button[@data-test-id=\"year-selection\"])[1]");
        }});
        put("select-start-year", new HashMap<>(){{
            put ("en", "//div[@class=\"year-select-item\"]/child::button");
            put ("ar", "//div[@class=\"year-select-item\"]/child::button");
        }});
        put("click-start-month", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"month-selection\"])[1]");
            put ("ar", "(//button[@data-test-id=\"month-selection\"])[1]");
        }});
        put("select-start-month", new HashMap<>(){{
            put ("en", "//div[@class=\"month-select-item\"]/child::button");
            put ("ar", "//div[@class=\"month-select-item\"]/child::button");
        }});
        put("select-start-day", new HashMap<>(){{
            put ("en", "(//table)[1]//tr//td");
            put ("ar", "(//table)[1]//tr//td");
        }});
        put("click-end-year", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"year-selection\"])[2]");
            put ("ar", "(//button[@data-test-id=\"year-selection\"])[2]");
        }});
        put("select-end-year", new HashMap<>(){{
            put ("en", "//div[@class=\"year-select-item\"]/child::button");
            put ("ar", "//div[@class=\"year-select-item\"]/child::button");
        }});
        put("click-end-month", new HashMap<>(){{
            put ("en", "(//button[@data-test-id=\"month-selection\"])[2]");
            put ("ar", "(//button[@data-test-id=\"month-selection\"])[2]");
        }});
        put("select-end-month", new HashMap<>(){{
            put ("en", "//div[@class=\"month-select-item\"]/child::button");
            put ("ar", "//div[@class=\"month-select-item\"]/child::button");
        }});
        put("select-end-day", new HashMap<>(){{
            put ("en", "(//table)[2]//tr//td");
            put ("ar", "(//table)[2]//tr//td");
        }});
        put("btn-confirm-period", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm period ']");
            put ("ar", "//button[text()=' تأكيد مدة الإيجار ']");
        }});
        put("btn-add-property", new HashMap<>(){{
            put ("en", "//a[text()=' Add property ']");
            put ("ar", "//button[text()=' تأكيد مدة الإيجار ']");
        }});
        put("property-use-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_usage\"]");
        }});
        put("property-type-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_type\"]");
        }});
        put("ownership-document-type-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"property_type\"]");
        }});
        put("property-name", new HashMap<>(){{
            put ("en", "//div[@class=\"col\"]/child::h5");
        }});
        put("continue-with-this-property-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue with this property ']");
        }});
        put("continue-to-select-units-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to select units ']");
        }});
        put("select-units", new HashMap<>(){{
            put ("en", "//div[@class=\"col p-0 pe-3\"]/child::h5");
        }});
        put("confirm-property-details", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm property details ']");
        }});
        put("covered-property-units-step-btn", new HashMap<>(){{
            put ("en", "//div[text()=' Covered property and units ']");
        }});
        put("identify-address-on-map-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Identify address on map ']");
        }});
        put("confirm-btn-on-map", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm ']");
        }});
        put("save-btn-property-address", new HashMap<>(){{
            put ("en", "//button[text()=' Save ']");
        }});
        put("contract-parties-step-btn", new HashMap<>(){{
            put ("en", "//div[text()=' Contract parties ']");
        }});
        put("add-individual-tenant-btn", new HashMap<>(){{
            put ("en", "//a[@data-test-id=\"contracts.contract-parties.add-individual-tenant\"]");
        }});
        put("tenant-type-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Tenant ']");
        }});
        put("tenant-national-id-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"id_number\"]");
        }});
        put("tenant-date-of-birth-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"hijri\"]");
        }});
        put("continue-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue ']");
        }});
        put("tenant-phone-number-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"nationalNumber\"]");
        }});
        put("tenant-region-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"region\"]");
        }});
        put("tenant-city-dropdown", new HashMap<>(){{
            put ("en", "//label[text()=\"City\"]/parent::app-form-field/descendant::div[text()=' Please select ']");
        }});
        put("select-tenant-city", new HashMap<>(){{
            put ("en", "//div[@class=\"option-text\"]");
        }});
        put("confirm-btn-on-tenant-address-page", new HashMap<>(){{
            put ("en", "//button[text()=' Confirm ']");
        }});
        put("filter-btn-on-select-units-page", new HashMap<>(){{
            put ("en", "//span[@class=\"icon filter-icon\"]");
        }});
        put("select-units-availability", new HashMap<>(){{
            put ("en", "//select[@data-name=\"unit_availability\"]");
        }});
        put("add-residential-contract-heading", new HashMap<>(){{
            put ("en", "//h1[text()=' Add Residential Contract ']");
        }});
        put("annual-rent-fee-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"total_units_rent\"]");
        }});
        put("single-payment-frequency-radio-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Single Payment ']");
        }});
        put("continue-to-billing-schedule-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Continue to Billing schedule ']");
        }});
        put("pay-online-btn", new HashMap<>(){{
            put ("en", "//label[text()=' Pay online only ']");
        }});
        put("add-new-iban-btn", new HashMap<>(){{
            put ("en", "//button[text()=' Add new IBAN ']");
        }});
        put("iban-number-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"iban_number\"]");
        }});

        put("account-owner-name-input-field", new HashMap<>(){{
            put ("en", "//input[@data-name=\"alias_name\"]");
        }});


        put("save-btn-on-add-new-iban", new HashMap<>(){{
            put ("en", "//button[text()=' Save ']");
        }});

        put("select-iban-dropdown", new HashMap<>(){{
            put ("en", "//select[@data-name=\"iban_number\"]");
        }});





    }};


    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By clickDateInputField() throws Exception{
        return By.xpath(get("date-input-field"));
    }

    public static By clickContractStartYear() throws Exception{
        return By.xpath(get("click-start-year"));
    }
    public static By selectContractStartYear() throws Exception{
        return By.xpath(get("select-start-year"));
    }
    public static By clickContractStartMonth() throws Exception{
        return By.xpath(get("click-start-month"));
    }
    public static By selectContractStartMonth() throws Exception{
        return By.xpath(get("select-start-month"));
    }

    public static By selectContractStartDay() throws Exception{
        return By.xpath(get("select-start-day"));
    }
    public static By clickContractEndYear() throws Exception{
        return By.xpath(get("click-end-year"));
    }
    public static By selectContractEndYear() throws Exception{
        return By.xpath(get("select-end-year"));
    }
    public static By clickContractEndMonth() throws Exception{
        return By.xpath(get("click-end-month"));
    }
    public static By selectContractEndMonth() throws Exception{
        return By.xpath(get("select-end-month"));
    }

    public static By selectContractEndDay() throws Exception{
        return By.xpath(get("select-end-day"));
    }

    public static By confirmPeriodBTN() throws Exception{
        return By.xpath(get("btn-confirm-period"));
    }

    public static By addPropertyBTN() throws Exception{
        return By.xpath(get("btn-add-property"));
    }

    public static By propertyUseMenu() throws Exception{
        return By.xpath(get("property-use-dropdown"));
    }

    public static By propertyTypeMenu() throws Exception{
        return By.xpath(get("property-type-dropdown"));
    }

    public static By OwnershipDocumentTypeMenu() throws Exception{
        return By.xpath(get("ownership-document-type-dropdown"));
    }

    public static By propertyName() throws Exception{
        return By.xpath(get("property-name"));
    }
    public static By continueWithThisPropertyBTN() throws Exception{
        return By.xpath(get("continue-with-this-property-btn"));
    }

    public static By continueToSelectUnitsBTN() throws Exception{
        return By.xpath(get("continue-to-select-units-btn"));
    }

    public static By selectUnit() throws Exception{
        return By.xpath(get("select-units"));
    }

    public static By confirmPropertyDetailsBTN() throws Exception{
        return By.xpath(get("confirm-property-details"));
    }
    public static By coveredPropertyUnitsBTN() throws Exception{
        return By.xpath(get("covered-property-units-step-btn"));
    }

    public static By identifyAddressOnMapBTN() throws Exception{
        return By.xpath(get("identify-address-on-map-btn"));
    }

    public static By confirmBtnOnMap() throws Exception{
        return By.xpath(get("confirm-btn-on-map"));
    }

    public static By saveBtnOnPropertyAddress() throws Exception{
        return By.xpath(get("save-btn-property-address"));
    }


    public static By contractPartiesStepBTN() throws Exception{
        return By.xpath(get("contract-parties-step-btn"));
    }

    public static By addIndividualTenantBTN() throws Exception{
        return By.xpath(get("add-individual-tenant-btn"));
    }

    public static By tenantRadioBTN() throws Exception{
        return By.xpath(get("tenant-type-radio-btn"));
    }

    public static By tenantNationalIdInput() throws Exception{
        return By.xpath(get("tenant-national-id-input-field"));
    }

    public static By tenantDateOfBirthInput() throws Exception{
        return By.xpath(get("tenant-date-of-birth-input-field"));
    }


    public static By continueBtnOnIndividualContractPage() throws Exception{
        return By.xpath(get("continue-btn"));
    }

    public static By tenantPhoneNumberInput() throws Exception{
        return By.xpath(get("tenant-phone-number-input-field"));
    }

    public static By tenantRegionDropdown() throws Exception{
        return By.xpath(get("tenant-region-dropdown"));
    }

    public static By tenantCityDropdown() throws Exception{
        return By.xpath(get("tenant-city-dropdown"));
    }


    public static By selectTenantCity() throws Exception{
        return By.xpath(get("select-tenant-city"));
    }

    public static By confirmBtnOnTenantAddressPage() throws Exception{
        return By.xpath(get("confirm-btn-on-tenant-address-page"));
    }

    public static By filterBtnOnSelectUnitsPage() throws Exception{
        return By.xpath(get("filter-btn-on-select-units-page"));
    }

    public static By selectUnitsAvailability() throws Exception{
        return By.xpath(get("select-units-availability"));
    }

    public static By addResidentialContractDashboard() throws Exception {
        return By.xpath(get("add-residential-contract-heading"));
    }

    public static By annualRentInputField() throws Exception {
        return By.xpath(get("annual-rent-fee-input-field"));
    }

    public static By singlePaymentRadioBTN() throws Exception {
        return By.xpath(get("single-payment-frequency-radio-btn"));
    }

    public static By continueToBillingScheduleBTN() throws Exception {
        return By.xpath(get("continue-to-billing-schedule-btn"));
    }
    public static By payOnlineBTN() throws Exception {
        return By.xpath(get("pay-online-btn"));
    }
    public static By addNewIbanBTN() throws Exception {
        return By.xpath(get("add-new-iban-btn"));
    }
    public static By ibanNumberInputField() throws Exception {
        return By.xpath(get("iban-number-input-field"));
    }
    public static By accountOwnerNameInputField() throws Exception {
        return By.xpath(get("account-owner-name-input-field"));
    }

    public static By saveBTNonAddNewIban() throws Exception {
        return By.xpath(get("save-btn-on-add-new-iban"));
    }
}
