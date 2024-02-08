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

            put("Change-Lessor-Representative-List-Option", new HashMap<>() {{
                put("en", "//a[contains(text(),'تغيير ممثل المؤجر')]");
                put("ar", "//a[contains(text(),'تغيير ممثل المؤجر')]");
            }});

            put("Add-Lessor-Representative-Option", new HashMap<>() {{
                put("en", "//a[contains(text(),'إضافة ممثل المؤجر')]");
                put("ar", "//a[contains(text(),'إضافة ممثل المؤجر')]");
            }});

            put("Delete-Lessor-Representative-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'إزالة الممثل')]");
            }});

            put("Delete-Current-Lessor-Representative", new HashMap<>() {{
                put("en", "");
                put("ar", "//label[contains(text(),'إزالة ممثل المؤجر الحالي')]");
            }});

            put("Add Lessor-Representative-Legal-Document", new HashMap<>() {{
                put("en", "");
                put("ar", "//a[contains(text(),'إضافة وثيقة قانونية جديدة')]");
            }});

            put("Delete-Lessor-Representative-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[contains(text(),'تمت إزالة ممثل المؤجر الحالي في وثيقة الملكية بنجا')]");
            }});

            put("Select-Document-Type", new HashMap<>() {{
                put("en", "");
                put("ar", "//select[@name='document_type']");
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
                put("ar", "//app-form-field[@data-name='issued_date']//div[@class='date-picker-button']");
            }});

            put("Legal-Document-End-Date", new HashMap<>() {{
                put("en", "");
                put("ar", "//app-form-field[@data-name='expiry_date']//div[@class='date-picker-button']");
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

            put("National-ID-Input\n", new HashMap<>() {{
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

            put("Confirm-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'تأكيد')]");
            }});

            put("Confirm-Change-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'تأكيد التغيير')]");
            }});

            put("Upload-File-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[contains(text(),'تحميل الملف')]");
            }});

            put("Alert-Message", new HashMap<>() {{
                put("en", "");
                put("ar", "//p[@class='info-label mt-4']");
            }});

            put("Next-Button", new HashMap<>() {{
                put("en", "");
                put("ar", "//button[contains(text(),'التالي')]");
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

    public static By addLessorRepresentativeOption() throws Exception {
        return By.xpath(get("add-Lessor-Representative-Option"));
    }

    public static By nextButton() throws Exception {
        return By.xpath(get("Next-Button"));
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
        return By.xpath(get("Delete-Current-Lessor-Representative"));
    }

    public static By addLessorRepresentativeLegalDocument() throws Exception {
        return By.xpath(get("Add Lessor-Representative-Legal-Document"));
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
        return By.xpath(get("Change-Current-Lessor-Representative"));
    }
}
