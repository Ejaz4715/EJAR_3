package sa.nhc.web.objects;

import com.testcrew.manager.TestConfigManager;
import org.openqa.selenium.By;
import java.util.HashMap;
import java.util.Map;

public class ChangeLessorAndLessorRepresentativePageObject {

    static Map<String, Map<String, String>> objects = new HashMap<>() {
        {
            put("OwnerShip-Document-Filter", new HashMap<>() {{
                put("en", "//button[@class='btn btn-filter btn-outline-primary align-end ms-2']");
                put("ar", "//button[@class='btn btn-filter btn-outline-primary align-end ms-2']");
            }});

            put("DN", new HashMap<>() {{
                put("en", "//div//input[@formcontrolname='document_number']");
                put("ar", "//div//input[@formcontrolname='document_number']");
            }});

            put("Add-Property", new HashMap<>() {{
                put("en", "//a[contains(text(),'العقارات')]");
                put("ar", "//a[contains(text(),'العقارات')]");
            }});

            put("Display-All-Document", new HashMap<>() {{
                put("en", "//span[contains(text(),'عرض جميع وثائق الملكية')]");
                put("ar", "//span[contains(text(),'عرض جميع وثائق الملكية')]");
            }});

            put("View-OwnerShip-Document", new HashMap<>() {{
                put("en", "//a[contains(text(),'عرض وثيقة الملكية')]");
                put("ar", "//a[contains(text(),'عرض وثيقة الملكية')]");
            }});

            put("Owner-Ship-Document-List-Action", new HashMap<>() {{
                put("en", "//span[@class='round-icon large menu']");
                put("ar", "//span[@class='round-icon large menu']");
            }});

            put("Owners-Property", new HashMap<>() {{

                put("ar", "//div[text()=' ملّاك العقار ']");
            }});

            put("Change-Lessor-Representative-List", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'تغيير ممثل المؤجر')]");
            }});

            put("Change-Lessor-List-Option", new HashMap<>() {{
                put("en", "//a[contains(text(),'تغيير المؤجر/المالك')]");
                put("ar", "//a[contains(text(),'تغيير المؤجر/المالك')]");
            }});


            put("Add-Lessor-Representative-Option", new HashMap<>() {{
                put("ar", "//label[contains(text(),' إضافة ممثل المؤجر الجديد ')]");
            }});

            put("Update-Lessor-Representative-Option", new HashMap<>() {{
                put("ar", "//label[contains(text(),' تعديل ممثل المؤجر الحالي ')]");
            }});


            put("Delete-Lessor-Representative-Option", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'إزالة ممثل المؤجر الحالي')]");
            }});
            put("Delete-Lessor-Representative-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'إزالة الممثل')]");
            }});

            put("Add-Lessor-Representative-Legal-Document", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'إضافة وثيقة قانونية جديدة')]");
            }});

            put("Add-Lessor-Representative-Legal-Representation-Document", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),' إضافة وثيقة تمثيل نظامي جديدة')]");
            }});

            put("Delete-Lessor-Representative-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[contains(text(),'تمت إزالة ممثل المؤجر الحالي في وثيقة الملكية بنجا')]");
            }});

            put("Select-Document-Type", new HashMap<>() {{
                put("en", "");
                put("ar", "//select[@data-name=\"document_type\"]");
            }});

            put("Legal-Document-Name-Input", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='document_number']");
            }});

            put("Legal-Document-Issue-Date", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//input[@type='text'])[4]");
            }});

            put("Legal-Document-Expire-Date", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//input[@type='text'])[5]");
            }});

            put("Legal-Document-Start-Issue-Date", new HashMap<>() {{
                put("en", "");
                put("ar", "((//div//input[@class='form-control ng-dirty ng-valid ng-touched touched'])/following-sibling::div)[1]");
            }});

            put("Legal-Document-End-Date", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div[@class='date-picker-button active'])[2]");
            }});

            put("Legal-Document-Issue-Place", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//input[@type='text'])[6]");
            }});

            put("Name-Of-Legal-Document", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//input[@type='text'])[7]");
            }});

            put("National-ID", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'هوية وطنية')]");
            }});

            put("National-ID-Input", new HashMap<>() {{
                put("en", "");
                put("ar", "//div//input[@formcontrolname='id_number']");
            }});

            put("Birth-Date-Input", new HashMap<>() {{
                put("en", "");
                put("ar", "(//div//input[@type='text'])[2]");
            }});

            put("Close-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'إغلاق')]");
            }});

            put("Add-Individual-Lessor", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'إضافة مالك فرد')]");
            }});

            put("View-OwnerShip-Document", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'عرض وثيقة الملكية')]");
            }});



            put("Confirm-Change-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'تأكيد التغيير')]");
            }});
            put("Confirm-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[text()=' تأكيد ']");
            }});
            put("Close-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[text()=' إغلاق ']");
            }});

            put("Upload-File-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[contains(text(),'تحميل الملف')]");
            }});

            put("Alert-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[@class='info-label mt-4']");
            }});
            put("Alert-Message-Update-Lessor-Representative", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-card-body[contains(text(),'تغيير ممثل المؤجر')]");
            }});
            put("Alert-Message-Delete-Lessor-Representative", new HashMap<>() {{
                put("en", "");
                put("ar", "//h2[contains(text(),'إزالة ممثل المؤجر الحالي')]");
            }});
            put("Message-Delete-Lessor-Representative", new HashMap<>() {{
                put("en", "");
                put("ar", "//div[@class=\"subtitle\"]");
            }});

            put("Alert-Message-Add-Lessor-Representative", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[text()='']");
            }});

            put("Next-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'التالي')]");
            }});
            put("Next-BTN", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-update-representative-steps//button[@class='btn btn-primary'][contains(text(),'التالي')]");
            }});
            put("Next-BTNR", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-remove-representative-steps//button[@class='btn btn-primary'][contains(text(),'التالي')]");
            }});


            put("Add-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[text()=' إضافة ']");
            }});

            put("Request-Number-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-card-body/div/p[contains(text(),'تم ارسال الطلب')]");
            }});

            put("Send-Approval-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-card-body/div/p/following-sibling::div");
            }});


            put("button-add-ownership-document", new HashMap<>() {{
                put("en", "//a[contains(text(),' Add Ownership document ')]");
                put("ar", "//a[contains(text(),'إضافة وثيقة ملكية')]");
            }});

            put("dropdown-ownership-document-type", new HashMap<>() {{
                put("en", "//select[@data-name=\"ownership_document_type\"]");
                put("ar", "//select[@data-name=\"ownership_document_type\"]");
            }});

            put("text-issued-date", new HashMap<>() {{
                put("en", "//input[@data-name=\"issued_date\"]");
                put("ar", "//input[@data-name=\"issued_date\"]");
            }});

            put("text-document-number", new HashMap<>() {{
                put("en", "//input[@data-name=\"document_number\"]");
                put("ar", "//input[@data-name=\"document_number\"]");
            }});

            put("Change-Successfully-Msg", new HashMap<>() {{
                put("en", "");
                put("ar", "//h2[contains(text(),'تم تغيير المؤجر/ممثل المؤجر بنجاح')]");
            }});

            put("Confirm-Request", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'تأكيد الموافقة على الطلب')]");
            }});

            put("Agree-CheckBox", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-form-checkbox[contains(@class,'agree border')]");
            }});

            put("Change-Lessor-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h1[contains(text(),'طلب تغيير المؤجر')]");
            }});
            put("Change-Lessor-Representative-Title", new HashMap<>() {{
                put("en", "");
                put("ar", "//h1[contains(text(),'طلب تعديل ممثل المؤجر الحالي')]");
            }});

            put("Accept-Request", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'الموافقة على طلب التغيير')]");
            }});

            put("Request-Menu", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='round-icon large menu']");
            }});

            put("Reference-Input", new HashMap<>() {{
                put("en", "");
                put("ar", "//input[@formcontrolname='reference']");
            }});

            put("Request-Filter-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[@class='icon filter-icon']");
            }});

            put("View-Request", new HashMap<>() {{
                put("en", "");
                put("ar", "//span[contains(text(),'عرض الطلبات')]");
            }});

            put("Request-Tab", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'الطلبات')]");
            }});

            put("Get-Request-Number", new HashMap<>() {{
                put("en", "");
                put("ar", "//img[@src=\"/assets/icons/graphic-icons/change-request-submitted.svg\"]/following-sibling::p[@class='info-value']");
            }});

            put("Request-Tab", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'الطلبات')]");
            }});

            put("Get-Request-Number", new HashMap<>() {{
                put("en", "");
                put("ar", "//img[@src=\"/assets/icons/graphic-icons/change-request-submitted.svg\"]/following-sibling::p[@class='info-value']");
            }});

            put("Send-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'إرسال')]");
            }});

            put("Get-Name-Of-New-Lessor-From-OwnerShip", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[@class='mb-1']");
            }});

            put("Get-New-OwnerShip-Name", new HashMap<>() {{
                put("en", "");
                put("ar", "(//p[@class='info-value empty'])[6]");
            }});

            put("Change-Lessor-Header-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//h1[contains(text(),'طلب تغيير المالك')]");
            }});

            put("Old-OwnerShip-Name-Txt", new HashMap<>() {{
                put("en", "");
                put("ar", "//h2[contains(text(),'وثيقة ملكية قديمة')]");
            }});

            put("OwnerShipNameTxt", new HashMap<>() {{
                put("en", "");
                put("ar", "(//h5[@class='item-value'])[1]");
            }});

            put("OTP-input", new HashMap<>(){{
                put ("en", "//input[@data-name=\"index_1\"]");
                put ("ar", "//input[@data-name=\"index_1\"]");
            }});

            put("verify-identity-btn", new HashMap<>(){{
                put ("en", "//input[@data-name=\"index_1\"]");
                put ("ar", "//button[contains(text(),'التحقق من الهوية')]");
            }});

            put("approval-submitted-text", new HashMap<>(){{
                put ("en", "//h2[text()]");
                put ("ar", "//h2[text()]");
            }});

            put("change-lessor-rep-option", new HashMap<>(){{
                put ("en", "");
                put ("ar", "//a[text()=' تغيير ممثل المؤجر ']");
            }});

            put("add-new-lessor-rep-radio-btn", new HashMap<>(){{
                put ("en", "");
                put ("ar", "//label[text()=' إضافة ممثل المؤجر الجديد ']");
            }});
            put("national-id-radio-btn", new HashMap<>(){{
                put ("en", "");
                put ("ar", "//label[text()=' هوية وطنية ']");
            }});
            put("lessor-rep", new HashMap<>(){{

                put ("ar", "//app-card-body[@class=\"card-body\"]/div/div/app-round-icon");
            }});
            put("no-lessor-rep", new HashMap<>(){{

                put ("ar", "//p[@class='info-label mt-4 with-breaks']");
            }});

        }};

    public static String get(String locator) throws Exception {
        return objects.get(locator).get(TestConfigManager.getSettingsApplicationLanguage());
    }

    public static String get(String locator, String language) throws Exception {
        return objects.get(locator).get(language);
    }

    public static By ownerShipDocumentFilter() throws Exception {
        return By.xpath(get("OwnerShip-Document-Filter"));
    }

    public static By ownerShipDocumentInput() throws Exception {
        return By.xpath(get("DN"));
    }

    public static By addProperty() throws Exception {
        return By.xpath(get("Add-Property"));
    }

    public static By displayAllDocument() throws Exception {
        return By.xpath(get("Display-All-Document"));
    }

    public static By ownerShipDocumentListAction() throws Exception {
        return By.xpath(get("Owner-Ship-Document-List-Action"));
    }

    public static By changeLessorRepresentativeOption() throws Exception {
        return By.xpath(get("Change-Lessor-Representative-List-Option"));
    }

    public static By changeLessorOption() throws Exception {
        return By.xpath(get("Change-Lessor-List-Option"));
    }

    public static By addLessorRepresentativeOption() throws Exception {
        return By.xpath(get("add-Lessor-Representative-Option"));
    }
    public static By updateLessorRepresentativeOption() throws Exception {
        return By.xpath(get("Update-Lessor-Representative-Option"));
    }


    public static By nextButton() throws Exception {
        return By.xpath(get("Next-Button"));
    }
    public static By nextBTN() throws Exception {
        return By.xpath(get("Next-BTN"));
    }

    public static By nextBTNR() throws Exception {
        return By.xpath(get("Next-BTNR"));
    }

    public static By alertMessage() throws Exception {
        return By.xpath(get("Alert-Message"));
    }

    public static By uploadFileButton() throws Exception {
        return By.xpath(get("Upload-File-Button"));
    }

    public static By confirmChangeButton() throws Exception {
        return By.xpath(get("Confirm-Change-Button"));
    }

    public static By confirmButton() throws Exception {
        return By.xpath(get("Confirm-Button"));
    }

    public static By viewOwnerShipDocument() throws Exception {
        return By.xpath(get("View-OwnerShip-Document"));
    }

    public static By addIndividualLessor() throws Exception {
        return By.xpath(get("Add-Individual-Lessor"));
    }

    public static By closeButton() throws Exception {
        return By.xpath(get("Close-Button"));
    }

    public static By deleteLessorRepresentativeMessage() throws Exception {
        return By.xpath(get("Delete-Lessor-Representative-Message"));
    }

    public static By deleteLessorRepresentativeButton() throws Exception {
        return By.xpath(get("Delete-Lessor-Representative-Button"));
    }

    public static By deleteCurrentLessorRepresentativeButton() throws Exception {
        return By.xpath(get("Delete-Lessor-Representative-Option"));
    }

    public static By addLessorRepresentativeLegalDocument() throws Exception {
        return By.xpath(get("Add-Lessor-Representative-Legal-Document"));
    }

    public static By addLessorRepresentativeLegalRepresentationDocument() throws Exception {
        return By.xpath(get("Add-Lessor-Representative-Legal-Representation-Document"));
    }

    public static By selectDocumentType () throws Exception {
        return By.xpath(get("Select-Document-Type"));
    }

    public static By legalDocumentNameInput() throws Exception {
        return By.xpath(get("Legal-Document-Name-Input"));
    }

    public static By legalDocumentIssueDateIcon () throws Exception {
        return By.xpath(get("Legal-Document-Issue-Date"));
    }

    public static By legalDocumentExpireDateIcon() throws Exception {
        return By.xpath(get("Legal-Document-Expire-Date"));
    }

    public static By legalDocumentStartIssueDate() throws Exception {
        return By.xpath(get("Legal-Document-Start-Issue-Date"));
    }

    public static By legalDocumentEndDate() throws Exception {
        return By.xpath(get("Legal-Document-End-Date"));
    }

    public static By legalDocumentIssuePlace() throws Exception {
        return By.xpath(get("Legal-Document-Issue-Place"));
    }

    public static By nameOfLegalDocument() throws Exception {
        return By.xpath(get("Name-Of-Legal-Document"));
    }

    public static By nationalID() throws Exception {
        return By.xpath(get("National-ID"));
    }

    public static By nationalIDInput() throws Exception {
        return By.xpath(get("National-ID-Input"));
    }

    public static By birthDateInput() throws Exception {
        return By.xpath(get("Birth-Date-Input"));
    }

    public static By changeCurrentLessorRepresentative() throws Exception {
        return By.xpath(get("Change-Lessor-Representative-List"));
    }

    public static By getButtonAddOwnershipDocument() throws Exception {
        return By.xpath(get("button-add-ownership-document"));
    }
    public static By getDropdownOwnershipDocumentType() throws Exception {
        return By.xpath(get("dropdown-ownership-document-type"));
    }

    public static By getTextIssuedDate() throws Exception {
        return By.xpath(get("text-issued-date"));
    }

    public static By getTextDocumentNumber() throws Exception {
        return By.xpath(get("text-document-number"));
    }

    public static By ownerShipNameTxt () throws Exception {
            return By.xpath(get("OwnerShipNameTxt"));
        }

    public static By oldOwnerShipNameTxt() throws Exception {
        return By.xpath(get("Old-OwnerShip-Name-Txt"));
    }

    public static By changeLessorHeaderTxt() throws Exception {
        return By.xpath(get("Change-Lessor-Header-Txt"));
    }

    public static By getNewOwnerShipName() throws Exception {
        return By.xpath(get("Get-New-OwnerShip-Name"));
    }

    public static By getNameOfNewLessorFromOwnerShip() throws Exception {
        return By.xpath(get("Get-Name-Of-New-Lessor-From-OwnerShip"));
    }

    public static By sendButton() throws Exception {
        return By.xpath(get("Send-Button"));
    }

    public static By getRequestNumber() throws Exception {
        return By.xpath(get("Get-Request-Number"));
    }

    public static By requestTab() throws Exception {
        return By.xpath(get("Request-Tab"));
    }

    public static By requestFilterButton() throws Exception {
        return By.xpath(get("Request-Filter-Button"));
    }

    public static By viewRequest() throws Exception {
        return By.xpath(get("View-Request"));
    }

    public static By referenceInput() throws Exception {
        return By.xpath(get("Reference-Input"));
    }

    public static By requestMenu () throws Exception {
        return By.xpath(get("Request-Menu"));
    }

    public static By acceptRequest() throws Exception {
        return By.xpath(get("Accept-Request"));
    }

    public static By changeLessorTitle () throws Exception {
        return By.xpath(get("Change-Lessor-Title"));
    }
    public static By changeLessorRepresentativeTitle () throws Exception {
        return By.xpath(get("Change-Lessor-Representative-Title"));
    }

    public static By agreeCheckBox () throws Exception {
        return By.xpath(get("Agree-CheckBox"));
    }

    public static By ConfirmRequest() throws Exception {
        return By.xpath(get("Confirm-Request"));
    }

    public static By changeSuccessfullyMsg () throws Exception {
        return By.xpath(get("Change-Successfully-Msg"));
    }

    public static By OTPButton() throws Exception{
        return By.xpath(get("OTP-input"));
    }
    public static By verifyIdentityBTN() throws Exception{
        return By.xpath(get("verify-identity-btn"));
    }
    public static By approvalSubmittedText() throws Exception{
        return By.xpath(get("approval-submitted-text"));
    }
    public static By addButton() throws Exception {
        return By.xpath(get("Add-Button"));
    }
    public static By requestNumberMessage() throws Exception {
        return By.xpath(get("Request-Number-Message"));
    }


    public static By alertMessageUpdateLessorRepresentative() throws Exception {
        return By.xpath(get("Alert-Message-Update-Lessor-Representative"));
    }
    public static By alertMessageDeleteLessorRepresentative() throws Exception {
        return By.xpath(get("Alert-Message-Delete-Lessor-Representative"));
    }
    public static By messageDeleteLessorRepresentative() throws Exception {
        return By.xpath(get("Message-Delete-Lessor-Representative"));
    }

    public static By alertMessageAddLessorRepresentative() throws Exception {
        return By.xpath(get("Alert-Message-Add-Lessor-Representative"));
    }

    public static By sendApprovalMessage() throws Exception {
        return By.xpath(get("Send-Approval-Message"));
    }
    public static By ownersProperty() throws Exception {
        return By.xpath(get("Owners-Property"));
    }
    public static By lessorRep() throws Exception {
        return By.xpath(get("lessor-rep"));
    }
    public static By noLessorRep() throws Exception {
        return By.xpath(get("no-lessor-rep"));
    }

    public static By changeLessorRepOption() throws Exception {
        return By.xpath(get("change-lessor-rep-option"));
    }

    public static By addNewLessorRadioBTN() throws Exception {
        return By.xpath(get("add-new-lessor-rep-radio-btn"));
    }

    public static By nationalIDRadioBTN() throws Exception {
        return By.xpath(get("national-id-radio-btn"));
    }


}
