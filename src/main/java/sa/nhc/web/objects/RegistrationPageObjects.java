package sa.nhc.web.objects;


import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static org.slf4j.MDC.get;


public class RegistrationPageObjects {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("BO-Registration-Tab", new HashMap<>() {{
                put("ar", "(//app-ejar-services-nav//a[@class='nav-item'])[2]");
                put("en", "//a[@routerlink='../../bo-registration/welcome']");
            }});

            put("Registration-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h1[@class='my-1']");
            }});

            put("Next-button", new HashMap<>() {{
                put("en", "//app-button-bar/div/button[@class='btn btn-primary']");
                put("ar", "//button[@class='btn btn-primary']");
            }});
            put("Check-Request-But", new HashMap<>() {{
                put("en", "//div//button[@class='btn btn-primary']");
                put("ar", "//div//button[@class='btn btn-primary']");
            }});
            put("Check-Request-Continue-But", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-primary continue-button']");
            }});
            put("Check-Request-Status-But", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-tablet btn-primary']");
            }});

            put("NID-Number", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='id_number']");
                put("ar", "//div//input[@formcontrolname='id_number']");
            }});

            put("DOB", new HashMap<>() {{
                put("en", "(//div//input[@type='text'])[2]");
                put("ar", "(//div//input[@type='text'])[2]");
            }});

            put("Search-But", new HashMap<>() {{
                put("en", "//app-button//button[@type='button']");
                put("ar", "//button[@class='btn btn-primary']");
            }});

            put("OTP1", new HashMap<>() {{
                put("en", "//form//div//input[@id='index_1']");
                put("ar", "//form//div//input[@id='index_1']");
            }});

            put("OTP2", new HashMap<>() {{
                put("en", "//form//div//input[@id='index_2']");
                put("ar", "//form//div//input[@id='index_2']");
            }});

            put("OTP3", new HashMap<>() {{
                put("en", "//form//div//input[@id='index_3']");
                put("ar", "//form//div//input[@id='index_3']");
            }});

            put("OTP4", new HashMap<>() {{
                put("en", "//form//div//input[@id='index_4']");
                put("ar", "//form//div//input[@id='index_4']");
            }});

            put("Office-Manager-Information-Title", new HashMap<>() {{
                put("en", "//div//h2[@class='card-title']");
                put("ar", "//div//h2[@class='card-title']");
            }});

            put("IDV-Title", new HashMap<>() {{
                put("en", "//div//h2[@class='card-title card-title-variant']");
                put("ar", "//div//h2[@class='card-title card-title-variant']");
            }});
            put("IDV-Title1", new HashMap<>() {{
                put("en", "//div//h2[@class='card-title card-title-variant']");
                put("ar", "(//div//h2[@class='card-title card-title-variant'])[2]");
            }});
            put("VID-BUT", new HashMap<>() {{
                put("en", "//app-button-bar/div/button[@class='btn btn-primary']");
                put("ar", "//button[contains(text(),'تأكيد')]");
            }});

            put("Error-Msg1", new HashMap<>() {{
                put("en", "//div/app-form-errors/ul/li");
                put("ar", "//div/app-form-errors/ul/li");
            }});
            put("Error-Request-Number", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[@class='message']");
            }});
            put("Error-Msg2", new HashMap<>() {{
                put("en", "//ul[@class='errors m-0']//li");
                put("ar", "//ul[@class='errors m-0']//li");
            }});

            put("Error-Msg3", new HashMap<>() {{
                put("en", "//app-flash-message//div[@class='message']");
                put("ar", "//app-flash-message//div[@class='message']");
            }});

            put("Cr-Number", new HashMap<>() {{
                put("en", "//form//input[@formcontrolname='registration_number']");
                put("ar", "//form//input[@formcontrolname='registration_number']");
            }});

            put("BOI-Title", new HashMap<>() {{
                put("en", "(//div//h2[@class='card-title card-title-variant'])[1]");
                put("ar", "(//div//h2[@class='card-title card-title-variant'])[1]");
            }});

            put("Active-Status", new HashMap<>() {{
                put("en", "//p[@class='info-value pin success']");
                put("ar", "//p[@class='info-value pin success']");
            }});

            put("Verify-Representation-Title", new HashMap<>() {{
                put("en", "//app-card-header/div/div//h2[@class='card-title card-title-variant']");
                put("ar", "//app-card-header/div/div//h2[@class='card-title card-title-variant']");
            }});

            put("RDM", new HashMap<>() {{
                put("en", "//input[@data-name=\"representation_document_number\"]");
                put("ar", "//input[@data-name=\"representation_document_number\"]");
            }});

            put("RDM-Drop", new HashMap<>() {{
                put("en", "//select[@data-name=\"representation_document_type\"]");
                put("ar", "//select[@data-name=\"representation_document_type\"]");
            }});

            put("RDM-Type", new HashMap<>() {{
                put("en", "//select[contains(@class,'form')]/child::option");
                put("ar", "//select[contains(@class,'form')]/child::option");
            }});

            put("Upload-But1", new HashMap<>() {{
                put("en", "(//label//i[@class='fa fa-file-upload fa-2x'])[1]");
                put("ar", "(//label[@class='btn btn-link'])[1]");
            }});

            put("Upload-But2", new HashMap<>() {{
                put("en", "(//label//i[@class='fa fa-file-upload fa-2x'])[2]");
                put("ar", "(//label[@class='btn btn-link'])[2]");
            }});

            put("MOB", new HashMap<>() {{
                put("en", "//input[@data-name=\"phone_number\"]");
                put("ar", "//input[@data-name=\"phone_number\"]");
            }});

            put("BOA-Title", new HashMap<>() {{
                put("en", "//app-card-header/div/div//h2[@class='card-title card-title-variant']");
                put("ar", "//app-card-header/div/div//h2[@class='card-title card-title-variant']");
            }});

            put("RN", new HashMap<>() {{
                put("en", "//span[@class='request-number']");
                put("ar", "//input[@formcontrolname='requestNumber']");
            }});

            put("Back-Home", new HashMap<>() {{
                put("en", "//div//div//a[@class='btn btn-outline-primary']");
                put("ar", "//button[@class='btn btn-outline-primary']");
            }});

            put("Confirm-But", new HashMap<>() {{
                put("en", "//app-modal/div//div/div//footer/button[@class='btn btn-primary']");
                put("ar", "//app-modal/div//div/div//footer/button[@class='btn btn-primary']");
            }});

            put("ConfirmLoginBut", new HashMap<>() {{
                put("en", "(//button[@class='btn btn-primary'])[2]");
                put("ar", "(//button[@class='btn btn-primary'])[2]");
            }});

            put("BO-Request-Status", new HashMap<>() {{
                put("en", "//a[@routerlink='../../bo-registration/check-request-status']");
                put("ar", "//a[@routerlink='../../bo-registration/check-request-status']");
            }});

            put("RN-Input", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='referenceNumber']");
                put("ar", "//div//input[@formcontrolname='referenceNumber']");
            }});

            put("Check-RS-Status", new HashMap<>() {{
                put("en", "//app-card-header//div//span[@class='pin mt-1 success']");
                put("ar", "//span[@class='pin mt-1 warning']");
            }});

            put("Continue-But ", new HashMap<>() {{
                put("en", "//app-card[2]/app-card-body//button[@class='btn btn-primary']");
                put("ar", "//app-card[2]/app-card-body//button[@class='btn btn-primary']");
            }});

            put("LoginPassword", new HashMap<>() {{
                put("en", "//input[@formcontrolname='password']");
                put("ar", "//input[@formcontrolname='password']");
            }});

            put("text-verificationCode",new HashMap<>(){{
                put("en","//input[@id = 'index_1']");
                put("ar","//input[@id = 'index_1']");
            }});

            put("User-ID", new HashMap<>() {{
                put("en", "//input[@formcontrolname='username']");
                put("ar", "//input[@formcontrolname='username']");
            }});

            put("Subscription-Filter-button", new HashMap<>(){{
                put ("en", "//div/button//span[@class='icon filter-icon']");
                put ("ar", "//div/button//span[@class='icon filter-icon']");
            }});

            put("Subscription-Request-Number-Input", new HashMap<>(){{
                put ("en", "//*[@formcontrolname=\"request_number\"]");
                put ("ar", "//*[@formcontrolname=\"request_number\"]");
            }});

            put("Subscription-Request-Status", new HashMap<>(){{
                put ("en", "//span[@class='pin mt-1 success']");
                put ("ar", "//span[contains(@class,'pin mt-1')]");
            }});

            put("Subscription-option", new HashMap<>(){{
                put ("en", "(//app-nav-item//div//span[@class='col-m'])[3]");
                put ("ar", "(//app-nav-item//div//span[@class='col-m'])[3]");
            }});

            put("Verified-Status", new HashMap<>(){{
                put ("en", "//h2//span[@class='pin ms-2 mt-1 success']");
                put ("ar", "//h2//span[@class='pin ms-2 mt-1 success']");
            }});

            put("View-subscription-Details", new HashMap<>(){{
                put ("en", "//div//a[@class='nav-item p-3 text-center']");
                put ("ar", "//div//a[@class='nav-item p-3 text-center']");
            }});

            put("subscription-Action-menu", new HashMap<>(){{
                put ("en", "//span[@class='round-icon large menu']");
                put ("ar", "//span[@class='round-icon large menu']");
            }});

            put("First-Term", new HashMap<>() {{
                put("en", "//button[@routerlink='../office-terms']");
                put("ar", "//button[@routerlink='../office-terms']");
            }});

            put("Confirm-Next-Page", new HashMap<>() {{
                put("en", "//button[@class='btn btn-primary']");
                put("ar", "//button[@class='btn btn-primary']");
            }});
            put("Confirm-Map-Details", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@class='btn btn-primary position-relative']");
            }});

            put("Error-Msg-File", new HashMap<>() {{
                put("en", "//div//p[@class='error']");
                put("ar", "");
            }});

            put("Error-Registration-Request", new HashMap<>() {{
                put("en", "//div//h5[@class='card-title']");
                put("ar", "//div//h5[@class='card-title']");
            }});

            put("Reject-But", new HashMap<>() {{
                put("en", "//div//button[@class='btn btn-outline-danger mx-3']");
                put("ar", "//div//button[@class='btn btn-outline-danger mx-3']");
            }});

            put("Input-Note", new HashMap<>() {{
                put("en", "//textarea[@formcontrolname='textReject']");
                put("ar", "//textarea[@formcontrolname='textReject']");
            }});

            put("Reject-But-After-Add-Note", new HashMap<>() {{
                put("en", "//button[@class='btn btn-outline-danger m-2']");
                put("ar", "//button[@class='btn btn-outline-danger m-2']");
            }});

            put("Sing-Up-Title", new HashMap<>() {{
                put("en", "//h4[@class='d-flex align-items-center']");
                put("ar", "//h4[@class='d-flex align-items-center']");
            }});

            put("User-Name-Input", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='username']");
                put("ar", "//div//input[@formcontrolname='username']");
            }});

            put("User-Password-Input", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='password']");
                put("ar", "//div//input[@formcontrolname='password']");
            }});

            put("Confirm-Password-Input", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='password_confirmation']");
                put("ar", "//div//input[@formcontrolname='password_confirmation']");
            }});

            put("Create-Account-Button", new HashMap<>() {{
                put("en", "//button[@class='btn btn-primary']");
                put("ar", "//button[@class='btn btn-primary']");
            }});

            put("Account-Created", new HashMap<>() {{
                put("en", "//p[@class='h3']");
                put("ar", "//p[@class='h3']");
            }});


            put("Continue-but", new HashMap<>() {{
                put("en", "//button[@class='btn btn-primary']");
                put("ar", "//button[@class='btn btn-primary']");
            }});

            put("Second-Term", new HashMap<>() {{
                put("en", "//button[@routerlink='../user-level-agreement']");
                put("ar", "//button[@routerlink='../user-level-agreement']");
            }});

            put("Label-Check-Box1", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[1]");
                put("ar", "(//label[@class='form-check-label'])[1]");
            }});

            put("Label-Check-Box2", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[2]");
                put("ar", "(//label[@class='form-check-label'])[2]");
            }});

            put("Third-Term", new HashMap<>() {{
                put("en", "//button[@routerlink='../office-address']");
                put("ar", "//button[@routerlink='../office-address']");
            }});
            put("Forth-Term", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[@routerlink='../training']");
            }});
            put("Map-button", new HashMap<>() {{
                put("en", "//button[@type='button']");
                put("ar", "//button[@type='button']");
            }});

            put("City-Dropdown", new HashMap<>() {{
                put("en", "(//app-custom-select[@formcontrolname='city'])[2]");
                put("ar", "(//app-custom-select[@formcontrolname='city'])[2]");
            }});

            put("City-List", new HashMap<>() {{
                put("en", "//app-custom-option//div[@class='option-text']");
                put("ar", "//app-custom-option//div[@class='option-text']");
            }});
            put("Building-Number", new HashMap<>() {{
                put("en", "(//input[@formcontrolname='building_number'])[2]");
                put("ar", "(//input[@formcontrolname='building_number'])[2]");
            }});

            put("Additional-Number", new HashMap<>() {{
                put("en", "(//input[@formcontrolname='additional_number'])[2]");
                put("ar", "(//input[@formcontrolname='additional_number'])[2]");
            }});

            put("Postal-Code", new HashMap<>() {{
                put("en", "(//input[@formcontrolname='postal_code'])[2]");
                put("ar", "(//input[@formcontrolname='postal_code'])[2]");
            }});

            put("Office-Located", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[3]");
                put("ar", "(//label[@class='form-check-label'])[3]");
            }});

            put("Find-On-Map", new HashMap<>() {{
                put("en", "//button[@class='btn btn-primary position-relative']");
                put("ar", "//button[@class='btn btn-primary position-relative']");
            }});

            put("Confirm-Adrees-Button", new HashMap<>() {{
                put("en", "//button[@class='btn btn-outline-primary position-relative']");
                put("ar", "//button[@class='btn btn-outline-primary position-relative']");
            }});

            put("Play-Video-Button", new HashMap<>() {{
                put("en", "//i[@class='fa fa-play']");
                put("ar", "//i[@class='fa fa-play']");
            }});

            put("Assessment-Answer-1", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[1]");
                put("ar", "(//label[@class='form-check-label'])[1]");
            }});

            put("Assessment-Answer-2", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[5]");
                put("ar", "(//label[@class='form-check-label'])[5]");
            }});

            put("Assessment-Answer-3", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[10]");
                put("ar", "(//label[@class='form-check-label'])[10]");
            }});

            put("Assessment-Answer-4", new HashMap<>() {{
                put("en", "(//label[@class='form-check-label'])[15]");
                put("ar", "(//label[@class='form-check-label'])[15]");
            }});

            put("Confirm-Assessment-Button", new HashMap<>() {{
                put("en", "//button[@class='btn btn-primary m-2']");
                put("ar", "//button[@class='btn btn-primary m-2']");
            }});
            put("National-ID-Label", new HashMap<>() {{
                put("en", "//label[@class='form-check-label']");
                put("ar", "//label[@class='form-check-label']");
            }});
        }
    };

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }
    public static By nationalIDLabel() throws Exception {
        return By.xpath(get("National-ID-Label"));
    }
    public static By userNameInput() throws Exception {
        return By.xpath(get("User-Name-Input"));
    }
    public static By userPasswordInput() throws Exception {
        return By.xpath(get("User-Password-Input"));
    }
    public static By confirmPasswordInput() throws Exception {
        return By.xpath(get("Confirm-Password-Input"));
    }
    public static By createAccountButton () throws Exception {
        return By.xpath(get("Create-Account-Button"));
    }
    public static By accountCreatedMessage() throws Exception {
        return By.xpath(get("Account-Created"));
    }
    public static By SingUpTitle() throws Exception {
        return By.xpath(get("Sing-Up-Title"));
    }
    public static By rejectButAfterAddNote() throws Exception {
        return By.xpath(get("Reject-But-After-Add-Note"));
    }
    public static By inputNote() throws Exception {
        return By.xpath(get("Input-Note"));
    }
    public static By firstTerm() throws Exception {
        return By.xpath(get("First-Term"));
    }

    public static By continueButton() throws Exception {
        return By.xpath(get("Continue-but"));
    }
    public static By secondTerm () throws Exception {
        return By.xpath(get("Second-Term"));
    }
    public static By labelCheckbox1 () throws Exception {
        return By.xpath(get("Label-Check-Box1"));
    }
    public static By labelCheckbox2 () throws Exception {
        return By.xpath(get("Label-Check-Box2"));
    }
    public static By thirdTerm () throws Exception {
        return By.xpath(get("Third-Term"));
    }
    public static By ForthTerm () throws Exception {
        return By.xpath(get("Forth-Term"));
    }

    public static By mapButton  () throws Exception {
        return By.xpath(get("Map-button"));
    }
    public static By cityDropdown () throws Exception {
        return By.xpath(get("City-Dropdown"));
    }
    public static By cityList  () throws Exception {
        return By.xpath(get("City-List"));
    }
    public static By rejectButton() throws Exception {
        return By.xpath(get("Reject-But"));
    }

    public static By errorRegistrationRequest() throws Exception {
        return By.xpath(get("Error-Registration-Request"));
    }

    public static By errorMsgFile() throws Exception {
        return By.xpath(get("Error-Msg-File"));
    }
    public static By confirmNextPage() throws Exception {
        return By.xpath(get("Confirm-Next-Page"));
    }
    public static By confirmMapDetails() throws Exception {
        return By.xpath(get("Confirm-Map-Details"));
    }
    
    public static final By confirmNextPage = By.xpath("//button[@class='btn btn-primary']");
    public static final By RequestNumber = By.xpath("//input[@data-name='requestNumber']");
    public static By boRegistrationTitle() throws Exception {
        return By.xpath(get("Registration-Title"));
    }
    public static By nextButton() throws Exception {
        return By.xpath(get("Next-button"));
    }
    public static By boRegistrationTab() throws Exception {
        return By.xpath(get("BO-Registration-Tab"));
    }

    public static By boCheckRegistrationRequestStatusTab() throws Exception {
        return By.xpath(get("BO-Request-Status"));
    }

    public static By nationalIDNumber() throws Exception {
        return By.xpath(get("NID-Number"));
    }

    public static By dataOfBirth() throws Exception {
        return By.xpath(get("DOB"));
    }

    public static By searchForRecordButton() throws Exception {
        return By.xpath(get("Search-But"));
    }

    public static By otpNum1() throws Exception {
        return By.xpath(get("OTP1"));
    }

    public static By otpNum2() throws Exception {
        return By.xpath(get("OTP2"));
    }

    public static By otpNum3() throws Exception {
        return By.xpath(get("OTP3"));
    }

    public static By otpNum4() throws Exception {
        return By.xpath(get("OTP4"));
    }

    public static By officeManagerInformationTitle() throws Exception {
        return By.xpath(get("Office-Manager-Information-Title"));
    }

    public static By identifyVerificationTitle() throws Exception {
        return By.xpath(get("IDV-Title"));
    }
    public static By identifyVerificationTitle1() throws Exception {
        return By.xpath(get("IDV-Title1"));
    }
    public static By VerifyIdentityButton() throws Exception {
        return By.xpath(get("VID-BUT"));
    }

    public static By errorMsgInvalidValue1() throws Exception {
        return By.xpath(get("Error-Msg1"));
    }
    public static By errorMsgInvalidRequestNumber() throws Exception {
        return By.xpath(get("Error-Request-Number"));
    }

    public static By errorMsgInvalidOtp() throws Exception {
        return By.xpath(get("Error-Msg2"));
    }

    public static By errorMsgInvalidValue3() throws Exception {
        return By.xpath(get("Error-Msg3"));
    }

    public static By brokerageOfficeInformationTitle() throws Exception {
        return By.xpath(get("BOI-Title"));
    }

    public static By registrationNum() throws Exception {
        return By.xpath(get("Cr-Number"));
    }

    public static By activeStatus() throws Exception {
        return By.xpath(get("Active-Status"));
    }

    public static By VerifyRepresentationTitle() throws Exception {
        return By.xpath(get("Verify-Representation-Title"));
    }

    public static By Error_Msg_Exist() throws Exception {
        return By.xpath(get("Already_Exist"));
    }

    public static By representationDocumentNumber() throws Exception {
        return By.xpath(get("RDM"));
    }

    public static By getRepresentationDocument() throws Exception {
        return By.xpath(get("RDM-Type"));
    }

    public static By representationDocumentDropDown() throws Exception {
        return By.xpath(get("RDM-Drop"));
    }

    public static By uploadBut() throws Exception {
        return By.xpath(get("Upload-But1"));
    }

    public static By uploadBut2() throws Exception {
        return By.xpath(get("Upload-But2"));
    }

    public static By mobilePhoneNumber() throws Exception {
        return By.xpath(get("MOB"));
    }

    public static By breakageOfficeAddedToEjarTitle() throws Exception {
        return By.xpath(get("BOA-Title"));
    }

    public static By requestNumber() throws Exception {
        return By.xpath(get("RN"));
    }

    public static By backToHomepage() throws Exception {
        return By.xpath(get("Back-Home"));
    }
    public static By confirmBut() throws Exception {
        return By.xpath(get("Confirm-But"));
    }
    public static By requestNumberInput() throws Exception {
        return By.xpath(get("RN-Input"));
    }

    public static By checkRequestStatus() throws Exception {
        return By.xpath(get("Check-RS-Status"));
    }
    public static By checkRequestStatusButton() throws Exception {
        return By.xpath(get("Check-Request-But"));
    }
    public static By checkRequestStatusContinueButton() throws Exception {
        return By.xpath(get("Check-Request-Continue-But"));
    }
    public static By checkRequestStatusButton2() throws Exception {
        return By.xpath(get("Check-Request-Status-But"));
    }

    public static By selectSubscription() throws Exception{
        return By.xpath(get("Subscription-option"));
    }
    public static By subscriptionFilterBut() throws Exception{
        return By.xpath(get("Subscription-Filter-button"));
    }
    public static By subscriptionRequestNumberInput() throws Exception{
        return By.xpath(get("Subscription-Request-Number-Input"));
    }
    public static By subscriptionRequestStatus() throws Exception{
        return By.xpath(get("Subscription-Request-Status"));
    }
    public static By clickSubscriptionActionMenu() throws Exception{
        return By.xpath(get("subscription-Action-menu"));
    }
    public static By clickViewSubscriptionDetails() throws Exception{
        return By.xpath(get("View-subscription-Details"));
    }
    public static By checkVerifiedStatus() throws Exception{
        return By.xpath(get("Verified-Status"));
    }

    public static By FirstTerm () throws Exception{
        return By.xpath(get("First-Term"));
    }
    public static By buildingNumber () throws Exception{
        return By.xpath(get("Building-Number"));
    }

    public static By additionalNumber() throws Exception{
        return By.xpath(get("Additional-Number"));
    }

    public static By postalCode() throws Exception{
        return By.xpath(get("Postal-Code"));
    }

    public static By officeLocated () throws Exception{
        return By.xpath(get("Office-Located"));
    }

    public static By findOnMap () throws Exception{
        return By.xpath(get("Find-On-Map"));
    }

    public static By confirmAdreesButton() throws Exception{
        return By.xpath(get("Confirm-Adrees-Button"));
    }

    public static By playVideoButton () throws Exception{
        return By.xpath(get("Play-Video-Button"));
    }

    public static By assessmentAnswer1 () throws Exception{
        return By.xpath(get("Assessment-Answer-1"));
    }

    public static By assessmentAnswer2 () throws Exception{
        return By.xpath(get("Assessment-Answer-2"));
    }

    public static By assessmentAnswer3 () throws Exception{
        return By.xpath(get("Assessment-Answer-3"));
    }

    public static By assessmentAnswer4 () throws Exception{
        return By.xpath(get("Assessment-Answer-4"));
    }

    public static By confirmAssessmentButton () throws Exception{
        return By.xpath(get("Confirm-Assessment-Button"));
    }
}