package sa.nhc.web.pages;


import com.testcrew.utility.TCRobot;
import sa.nhc.web.objects.AddPropertyPageObjects;

import com.testcrew.base.WebBasePage;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.testng.Assert;
import sa.nhc.web.objects.LoginPageObjects;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.nio.file.Paths;
import java.util.Map;

import static com.testcrew.web.Browser.driver;

public class AddPropertyPage extends WebBasePage {
    public static final ReportManager logger = new ReportManager(AddPropertyPage.class);


    public void addOwnershipDocument(Map<String, String> data) throws Exception {
        logger.info("Click On Create NewProperty ");
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddProperty(),20);
        Browser.click(AddPropertyPageObjects.getButtonAddProperty());
        Browser.click(AddPropertyPageObjects.getButtonCreateNewProperty());
        logger.info("Click On Add Ownership Document with filling all required data");
        Browser.click(AddPropertyPageObjects.getButtonAddOwnershipDocument());
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownOwnershipDocumentType(), data.get("Ownership_Document_Type"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextIssuedDate(), data.get("Issued-Date"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextDocumentNumber(), data.get("Ownership_Reference"));
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonCreateNew(), 20);
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getButtonCreateNew());
        Browser.waitForSeconds(3);
        Browser.moveToElement(AddPropertyPageObjects.getUploadFile());
        Browser.waitForSeconds(3);
        Browser.click(AddPropertyPageObjects.getUploadFile());
        robotFiles("ejartestt");
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextErrorMessage(), 5);
        Browser.moveToElement(AddPropertyPageObjects.getTextErrorMessage());
        Assert.assertTrue(Browser.isElementPresent(AddPropertyPageObjects.getTextErrorMessage()), "The Message : File is too big. Maximum upload file size is 10 MB. is displayed");
        Browser.takeScreenshot();
        Browser.waitForSeconds(3);
        Browser.moveToElement(AddPropertyPageObjects.getUploadFile());
        Browser.waitForSeconds(3);
        Browser.click(AddPropertyPageObjects.getUploadFile());
        robotFiles("ejartest.pdf");
        Browser.click(AddPropertyPageObjects.getButtonConfirmOwnershipDocument());
        Browser.waitForSeconds(2);
    }


    public void addAnIndividual(Map<String, String> data) throws Exception {
        logger.info("Add An Individual with filling all required data");
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddAnIndividual(),25);
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(70);
        Browser.waitForSeconds(2);
        //Browser.moveToElement(AddPropertyPageObjects.getButtonAddAnIndividual());
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
        Browser.click(AddPropertyPageObjects.getButtonContinue());
        Browser.waitForSeconds(3);
        Browser.setText(AddPropertyPageObjects.getTextPhoneNumber(), data.get("Phone_Number"));
        Browser.waitForSeconds(2);
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownRegion(), data.get("Region"));
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getDropdownCity());
        Browser.click(AddPropertyPageObjects.getSelectCity());
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonConfirm(),20);
        Browser.click(AddPropertyPageObjects.getButtonConfirm());
        Browser.waitForSeconds(3);


    }

    public void addNewProperty(Map<String, String> data) throws Exception {
        logger.info("Add New Property with filling all required data");
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddNewProperty(),25);
        Browser.moveToElement(AddPropertyPageObjects.getButtonAddNewProperty());
        Browser.click(AddPropertyPageObjects.getButtonAddNewProperty());
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownPropertyType(), data.get("Property_Type"));
        Browser.waitForSeconds(2);
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownPropertyUsage(), data.get("Property_Usage"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextPropertyNumber(), data.get("Property_Number"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextTotalFloors(), data.get("Total_Floors"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextUnitsPerFloor(), data.get("Units_Per_Floor"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextPropertyName(), data.get("Property_Name"));
        Browser.waitForSeconds(2);
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownRegion(), data.get("Region"));
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getDropdownCity());
        Browser.click(AddPropertyPageObjects.getSelectCity());
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextPostalCode(), data.get("Postal_Code"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextBuildingNumber(), data.get("Building_Number"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextAdditionalNumber(), data.get("Additional_Number"));
        Browser.waitForSeconds(2);
        Browser.click(AddPropertyPageObjects.getButtonConfirmPropertyDetails());
        Browser.waitForSeconds(6);


    }

    public void addNewUnit(Map<String, String> data) throws Exception {
        logger.info("Add New Unit with filling all required data");
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddNewUnit(),25);
        Browser.waitForSeconds(3);
        Browser.moveToElement(AddPropertyPageObjects.getButtonAddNewUnit());
        Browser.click(AddPropertyPageObjects.getButtonAddNewUnit());
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextUnitNumber(),15);
        Browser.setText(AddPropertyPageObjects.getTextUnitNumber(), data.get("Unit_Number"));
        Browser.waitForSeconds(2);
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownUnitType(), data.get("Unit_Type"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextFloorNumber(), data.get("Floor_Number"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextArea(), data.get("Area"));
        Browser.waitForSeconds(2);
        if (Browser.getWebElement(AddPropertyPageObjects.getTextNumberOfRooms()).isEnabled()) {
            Browser.setText(AddPropertyPageObjects.getTextNumberOfRooms(), data.get("Number_Of_Rooms"));
        } else {
            Browser.waitForSeconds(2);
        }
        Browser.click(AddPropertyPageObjects.getButtonConfirmPropertyUnits());
        Browser.waitForSeconds(3);
    }

    public void verifyThePropertyCreated(Map<String, String> data) throws Exception {
        logger.info("Verify The Property Added  by filtering the name of property");
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonSaveAndContinueLater(), 20);
        Browser.moveToElement(AddPropertyPageObjects.getButtonSaveAndContinueLater());
        Browser.click(AddPropertyPageObjects.getButtonSaveAndContinueLater());
        Browser.click(AddPropertyPageObjects.getButtonAddProperty());
        Browser.click(AddPropertyPageObjects.getButtonViewAllProperties());
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonFilter(), 20);
        Browser.click(AddPropertyPageObjects.getButtonFilter());
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextPropertyName(), 20);
        Browser.setText(AddPropertyPageObjects.getTextPropertyName(), data.get("Property_Name"));
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getAssertProperty(), 20);
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(500);
        Browser.waitForSeconds(2);
        Assert.assertTrue(Browser.isElementPresent(AddPropertyPageObjects.getAssertProperty()), "The Property is displayed.");
        Browser.waitForSeconds(4);
        Browser.takeScreenshot();

    }


    public void uploadPropertyAttachment(Map<String, String> data) throws Exception {
        logger.info("Click On Create NewProperty ");
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonAddProperty(),20);
        Browser.click(AddPropertyPageObjects.getButtonAddProperty());
        Browser.click(AddPropertyPageObjects.getButtonCreateNewProperty());
        logger.info("Add New Attachment related to property");
        Browser.waitForSeconds(3);
        Browser.moveToElement(AddPropertyPageObjects.getButtonUploadPropertyAttachment());
        Browser.click(AddPropertyPageObjects.getButtonUploadPropertyAttachment());
        robotFiles("ejartest.pdf");
        Browser.waitForSeconds(2);
    }
    public void addOwnershipDocumentWithOverSize(Map<String, String> data) throws Exception {
        logger.info("Click On Create NewProperty ");
        Browser.waitForSeconds(3);
        Browser.click(AddPropertyPageObjects.getButtonAddProperty());
        Browser.click(AddPropertyPageObjects.getButtonCreateNewProperty());
        logger.info("Click On Add Ownership Document with filling all required data and over size file");
        Browser.moveToElement(AddPropertyPageObjects.getButtonAddOwnershipDocument());
        Browser.click(AddPropertyPageObjects.getButtonAddOwnershipDocument());
        Browser.selectDropdownByVisibleText(AddPropertyPageObjects.getDropdownOwnershipDocumentType(), data.get("Ownership_Document_Type"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextIssuedDate(), data.get("Issued-Date"));
        Browser.waitForSeconds(2);
        Browser.setText(AddPropertyPageObjects.getTextDocumentNumber(), data.get("Ownership_Reference"));
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getButtonCreateNew(), 5);
        Browser.click(AddPropertyPageObjects.getButtonCreateNew());
        Browser.waitForSeconds(3);
        Browser.moveToElement(AddPropertyPageObjects.getUploadFile());
        Browser.waitForSeconds(3);
        Browser.click(AddPropertyPageObjects.getUploadFile());
        robotFiles("ejartestt");
        Browser.waitForSeconds(3);
        Browser.waitUntilVisibilityOfElement(AddPropertyPageObjects.getTextErrorMessage(), 5);
        Browser.moveToElement(AddPropertyPageObjects.getTextErrorMessage());
        Assert.assertTrue(Browser.isElementPresent(AddPropertyPageObjects.getTextErrorMessage()), "The Message : File is too big. Maximum upload file size is 10 MB. is displayed");
        Browser.takeScreenshot();


    }
    public void robotFiles(String File) throws Exception {

        TCRobot robot = new TCRobot();
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
}
































