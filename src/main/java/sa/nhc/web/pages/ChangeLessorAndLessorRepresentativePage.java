package sa.nhc.web.pages;


import com.testcrew.web.Browser;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import sa.nhc.web.objects.ChangeLessorAndLessorRepresentativePageObject;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import static com.testcrew.api.UnirestAPI.logger;

public class ChangeLessorAndLessorRepresentativePage {

    public void searchForOwnershipDocument(String DN) throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentFilter());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.ownerShipDocumentInput(), DN);
        Browser.waitForSeconds(3);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
    }

    public void neviagteToOwnerShipDocumentPage() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.addProperty());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.displayAllDocument());
        Browser.waitForSeconds(1);
        logger.addScreenshot("");
        Browser.waitForSeconds(6);
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
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.changeCurrentLessorRepresentative());
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nextButton());
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(1);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmChangeButton());
        Browser.waitForSeconds(3);
    }

    public void addNewLessorRepresentative() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.nationalID());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.nationalIDInput(),"1000100011");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.birthDateInput(),"14000101");
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
        Browser.selectDropdownByVisibleText(ChangeLessorAndLessorRepresentativePageObject.selectDocumentType(),"أخرى");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentNameInput(),"Test");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentIssueDateIcon(),"20230101");
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.legalDocumentStartIssueDate());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentExpireDateIcon(),"20250101");
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.legalDocumentEndDate());
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.legalDocumentIssuePlace(),"Test");
        Browser.waitForSeconds(2);
        Browser.setText(ChangeLessorAndLessorRepresentativePageObject.nameOfLegalDocument(),"Test By Automation");
        Browser.waitForSeconds(2);
        logger.addScreenshot("");
        Browser.waitForSeconds(2);
    }


    public void uploadAttachment() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.uploadFileButton());
        Browser.waitForSeconds(2);
        robotFiles("Test.png");
    }

    public void ConfirmChangeLessorRepresentative() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(ChangeLessorAndLessorRepresentativePageObject.confirmChangeButton());
        Browser.waitForSeconds(2);
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
}