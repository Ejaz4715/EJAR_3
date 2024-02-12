package sa.nhc.web.pages;


import com.testcrew.manager.TestDataManager;
import com.testcrew.web.Browser;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.PolyUnit;
import org.openqa.selenium.By;
import org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.nhc.web.objects.AddPropertyPageObjects;
import sa.nhc.web.objects.ChangeLessorAndLessorRepresentativePageObject;
import sa.nhc.web.objects.LoginPageObjects;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.util.Map;

import static com.testcrew.api.UnirestAPI.logger;

public class ChangeLessorAndLessorRepresentativePage {

    public void searchForOwnershipDocument(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentFilter());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentInput(), data.get("OwnerShipReference"));
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.ownerShipNameTxt(), 30);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void searchForNewOwnershipDocument(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentFilter());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentInput(), data.get("New-DN"));
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.ownerShipNameTxt(), 30);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void checkNewLessorDetails() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.viewOwnerShipDocument());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);

    }

    public void checkNewLessorRepresentativeDetails() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.viewOwnerShipDocument());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownersProperty());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
    }

    public void neviagteToOwnerShipDocumentPage() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.addProperty());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.displayAllDocument());
        Browser.waitForSeconds(4);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void NeviagteToChangeLessorRepresentativePage() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.changeLessorRepresentativeOption());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void NeviagteToChangeLessorPage() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.changeLessorOption());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void addOwnerShipDocumentNumber(Map<String, String> data) throws Exception {


        Browser.waitForSeconds(2);
        Browser.isElementPresent(ChangeLessorAndLessorRepresentativePageObject.oldOwnerShipNameTxt());
        Browser.executeJSScroll(300);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.getButtonAddOwnershipDocument());
        Browser.waitForSeconds(2);
        String ChangeLessorText = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.changeLessorHeaderTxt()).getText();
        Assert.assertTrue(ChangeLessorText.contains("طلب تغيير المالك"));
        Browser.waitForSeconds(1);
        Browser.selectDropdownByVisibleText(ChangeLessorAndLessorRepresentativePageObject
                .getDropdownOwnershipDocumentType(), "حجة استحكام");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.getTextIssuedDate(), data.get("DN-Date"));
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.getTextDocumentNumber(), data.get("New-DN"));
        String NewDN = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getTextDocumentNumber()).getText();

        TestDataManager.addDependantGlobalTestData("ChangeLessor", "New-DN", NewDN);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");


//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "CheckNewLessorDetails", "New-DN", NewDN);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void addOwnerShipDocumentDetails(ITestContext context) throws Exception {
        Browser.click(AddPropertyPageObjects.getButtonCreateNew());
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.TXTIssuedBy(), 6);
        Browser.setText(AddPropertyPageObjects.TXTIssuedBy(), "ايجار");
        Browser.waitForSeconds(3);
        Browser.setText(AddPropertyPageObjects.TXTIssuedPlace(), "الرياض");
        Browser.executeJSScrollIntoView(AddPropertyPageObjects.getUploadFile());
        Browser.moveToElement(AddPropertyPageObjects.getUploadFile());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(AddPropertyPageObjects.getUploadFile());
        robotFiles("ejartest.pdf");
        logger.addScreenshot("Fill new ownership document information");
        Browser.click(AddPropertyPageObjects.getButtonConfirmOwnershipDocument());
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(300);
        String NewOwnerShipDocument = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getNewOwnerShipName()).getText();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "New-DN", NewOwnerShipDocument);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");

//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "NewOwnerShipDocument", "New-DN", NewOwnerShipDocument);

        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void addNewLessorToOwnerShipDocument(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddAnIndividual(), 25);
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(70);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(AddPropertyPageObjects.getButtonAddAnIndividual());
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getRadioButtonPropertyOwner());
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getRadioButtonNationalId());
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextNationalIdNumber(), data.get("National_Id"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextDateOfBirth(), data.get("Date_Of_Birth"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("Add New Individual Lessor");
        Browser.waitForSeconds(1);
        Browser.click(AddPropertyPageObjects.getButtonContinue());
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextPhoneNumber(), 8);
//        Browser.setText(AddPropertyPageObjects.getTextPhoneNumber(), data.get("Phone_Number"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.TXTEmail(), data.get("Email"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownRegion(), "تبوك");
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getDropdownCity());
        Browser.click(AddPropertyPageObjects.getSelectCity());
        Browser.setText(AddPropertyPageObjects.TXTPostalCode(), "11111");
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.TXTStreetName(), "Ejar Street");
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.TXTBuildingNumber(), "1111");
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.TXTAdditionalNumber(), "1111");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonConfirm(), 20);
        Browser.click(AddPropertyPageObjects.getButtonConfirm());
        Browser.waitForSeconds(2);
    }

    public void getNameOfNewLessor() throws Exception {
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(2);
        String NameOfNewLessor = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getNameOfNewLessorFromOwnerShip()).getText();
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "LessorName", NameOfNewLessor);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "CheckNewLessorDetails", "LessorName", NameOfNewLessor);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }


    public void sendToLessorForApproved() throws Exception {
        Browser.waitForSeconds(1);
        Browser.executeJSScrollIntoView(ChangeLessorAndLessorRepresentativePageObject.sendButton());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.sendButton());
        Browser.waitForSeconds(5);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber(), 25);
        Browser.waitForSeconds(15);
        String RequestNumber = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber()).getText().substring(20, 28);
        TestDataManager.addDependantGlobalTestData("ChangeLessor", "RequestNumber", RequestNumber);
        TestDataManager.writeDependantGlobalTestData("ChangeLessor");
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "NewOwnerShipDocument", "RequestNumber", RequestNumber);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
        Browser.waitForSeconds(2);
    }

    public void sendToLessorRepresentativeForApproved() throws Exception {
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber(), 30);
        String RequestNumber = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber()).getText().substring(20, 28);
        TestDataManager.addDependantGlobalTestData("ChangeLessorRepresentative", "RequestNumber", RequestNumber);
        TestDataManager.writeDependantGlobalTestData("ChangeLessorRepresentative");

//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "NewOwnerShipDocument", "RequestNumber", RequestNumber);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
        Browser.waitForSeconds(2);
    }


    public void sendToLessorForApproveTheDeletion() throws Exception {
        Browser.waitForSeconds(1);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber(), 30);
        String RequestNumber = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.getRequestNumber()).getText().substring(20, 28);
        TestDataManager.addDependantGlobalTestData("ChangeLessorRepresentative", "RequestNumber", RequestNumber);
        TestDataManager.writeDependantGlobalTestData("ChangeLessorRepresentative");

//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "Lessor",
//                "NewOwnerShipDocument", "RequestNumber", RequestNumber);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
        Browser.waitForSeconds(2);
    }

    public void NeviagteToRequestsPage(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(5);
        if (Browser.isElementPresent(ChangeLessorAndLessorRepresentativePageObject.closeButton())) {
            Browser.waitForSeconds(3);
            Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
        }
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestTab());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.viewRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestFilterButton());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.referenceInput(), data.get("RequestNumber"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestMenu());
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.acceptRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.changeLessorTitle(), 20);
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(3);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(25);
        Browser.waitUntilPresenceOfElement(ChangeLessorAndLessorRepresentativePageObject.confirmButton(), 30);
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmButton());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.agreeCheckBox());
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ConfirmRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(3);
    }

    public void navigateToRequestsPageForUpdateLessorRepresentative(Map<String, String> data) throws Exception {
        data.putAll(TestDataManager.readDependantGlobalTestData("ChangeLessorRepresentative"));

        Browser.waitForSeconds(5);
        if (Browser.isElementPresent(ChangeLessorAndLessorRepresentativePageObject.closeButton())) {
            Browser.waitForSeconds(3);
            Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
        }
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestTab());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.viewRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestFilterButton());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.referenceInput(),data.get("RequestNumber"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.requestMenu());
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.acceptRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.changeLessorRepresentativeTitle(), 20);
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(3);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(25);
        Browser.waitUntilPresenceOfElement(ChangeLessorAndLessorRepresentativePageObject.confirmButton(), 30);
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(600);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmButton());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.agreeCheckBox());
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ConfirmRequest());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(3);
    }

    public void assertLessorChangeOrLessorRepresentative() throws Exception {
        Browser.waitForSeconds(2);
        String SuccessfullyMsg = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.changeSuccessfullyMsg()).getText();
        Assert.assertTrue(SuccessfullyMsg.contains("تم تغيير المؤجر/ممثل المؤجر بنجاح"));
        Browser.waitForSeconds(1);
        logger.addScreenshot("Confirm Message : " + SuccessfullyMsg);
    }


    ///////////////////////////////////////////

    public void AddNewLessorRepresentativeToOwnerShipDocument() throws Exception {
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.addLessorRepresentativeOption());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        String AlertMsg = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.alertMessage()).getText();
        AlertMsg.contains("لا يمكن إضافة ممثل المؤجر بسبب وجود ممثل آخر في نفس وثيقة الملكية!");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void updateCurrentLessorRepresentativeDFromOwnerShipDocument() throws Exception {
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction(), 30);
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.changeCurrentLessorRepresentative());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.updateLessorRepresentativeOption(), 30);
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.updateLessorRepresentativeOption());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextBTN());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.nextButton(), 30);
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.confirmChangeButton(), 30);
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmChangeButton());
        Browser.waitForSeconds(3);
    }

    public void addNewLessorRepresentative(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nationalID());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.nationalIDInput(), data.get("National_Id"));
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.birthDateInput(), data.get("Date_Of_Birth"));
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
    }

    public void addLessorRepresentativeLegalDocument() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.addLessorRepresentativeLegalDocument());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.selectDocumentType(),30);
        Browser.selectDropdownByVisibleText(ChangeLessorAndLessorRepresentativePageObject.selectDocumentType(), "أخرى");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentNameInput(), "TestName");
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentIssueDateIcon(), "20230101");
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentExpireDateIcon(), "20250101");
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.legalDocumentEndDate());
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentIssuePlace(), "Test");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.nameOfLegalDocument(), "Test By Automation");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void uploadAttachment() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.uploadFileButton());
        Browser.waitForSeconds(2);
        robotFiles("Test.png");
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.addButton());
    }

    public void ConfirmChangeLessorRepresentative() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmChangeButton());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.alertMessageUpdateLessorRepresentative(), 30);
        Browser.waitForSeconds(2);
        String AlertUpdateLessorRep = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.alertMessageUpdateLessorRepresentative()).getText();
        Assert.assertTrue(AlertUpdateLessorRep.contains("موافقة ممثل المؤجر"));
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmButton());
    }

    public void robotFiles(String File) throws Exception {
        Robot robot = new Robot();
        robot.delay(2000);
        String CURRENT_DIR = System.getProperty("user.dir");
        String filepath1 = Paths.get(CURRENT_DIR, "src", "test", "resources") + "\\" + File;
        StringSelection select1 = new StringSelection(filepath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void deleteLessorRepresentativeToOwnerShipDocument() throws Exception {
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.deleteCurrentLessorRepresentativeButton());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextBTNR());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        Browser.executeJSScrollIntoView(ChangeLessorAndLessorRepresentativePageObject.deleteLessorRepresentativeButton());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.deleteLessorRepresentativeButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        String AlertMsg = Browser.getWebElement(ChangeLessorAndLessorRepresentativePageObject.
                deleteLessorRepresentativeMessage()).getText();
        //Confirm Delete lessor rep
        AlertMsg.contains("تمت إزالة ممثل المؤجر الحالي");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.closeButton());
    }

    public void assertLessorRepresentativeDeleted() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentListAction());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.viewOwnerShipDocument());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.executeJSScrollIntoView(ChangeLessorAndLessorRepresentativePageObject.addIndividualLessor());
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }


    public void enterOTPForApproval(String otp) throws Exception {
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.OTPButton(), 20);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.OTPButton(), otp);
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }

    public void clickVerifyIdentityBTN() throws Exception {
        Browser.waitUntilVisibilityOfElement(ChangeLessorAndLessorRepresentativePageObject.verifyIdentityBTN(), 20);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.verifyIdentityBTN());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(15);
    }
}