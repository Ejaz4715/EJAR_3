package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;

import com.testcrew.manager.TestDataManager;
import com.testcrew.utility.TCRobot;
import com.testcrew.web.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import sa.nhc.web.objects.LoginPageObjects;
import sa.nhc.web.objects.RegistrationPageObjects;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import static com.testcrew.manager.PDFReportManager.logger;
import static com.testcrew.web.Browser.driver;
import static sa.nhc.web.objects.LoginPageObjects.*;
import static sa.nhc.web.objects.RegistrationPageObjects.*;


public class RegistrationPage extends WebBasePage {
    public void NeviagteToBORegistration(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(6);
        logger.info("Step 01: Click on BO Registration Tab");
        Browser.takeScreenshot("Before Click on BO Registration Tab");
        Browser.click(RegistrationPageObjects.boRegistrationTab());
        String Text = Browser.getWebElement(boRegistrationTitle()).getText();
        Assert.assertTrue(Text.contains(data.get("Title"))||Text.contains("تسجيل مكتب وساطة جديد"));
        Browser.takeScreenshot("After Click on BO Registration Tab");
    }
    public void fillInvalidOfficeManagerInformation() throws Exception {
        logger.info("Step 02 : Enter Invalid National ID , DOB ");
        String OFM_Title = Browser.getWebElement(officeManagerInformationTitle()).getText();
        Assert.assertTrue(OFM_Title.contains("Office Manager Information")||
                OFM_Title.contains("استرجاع معلومات المدير"));
        Browser.executeJSScroll(250);
        Browser.waitForSeconds(1);
        Browser.click(RegistrationPageObjects.nationalIDLabel());
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.nationalIDNumber(), "6475777555");
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.dataOfBirth(), "1500-02-22");
        String ErrorMsg4 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg4.contains("The max value is")||
                ErrorMsg4.contains("أقصى قيمة"));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.searchForRecordButton());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg1 = Browser.getWebElement(errorMsgInvalidValue3()).getText();
        Assert.assertTrue(ErrorMsg1.contains("The entity was not found")||
                ErrorMsg1.contains("لم يتم العثور على الكيان"));
        Browser.waitForSeconds(2);
        Browser.clearText(RegistrationPageObjects.nationalIDNumber());
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.nationalIDNumber(), "0876544");
        String ErrorMsg2 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Assert.assertTrue(ErrorMsg2.contains("The min number of characters is 10")||
                ErrorMsg2.contains("الحد الأدنى لعدد الأحرف هو 10"));
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.clearText(RegistrationPageObjects.nationalIDNumber());
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.nationalIDNumber(), "mmmm");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg3 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Assert.assertTrue(ErrorMsg3.contains("Please check the format")||
                ErrorMsg3.contains("يرجى التأكد من التنسيق"));
        Browser.takeScreenshot("After Enter Invalid input in Office Manager Information Fields");
        Browser.waitForSeconds(1);
        Browser.clearText(RegistrationPageObjects.nationalIDNumber());
        Browser.waitForSeconds(1);
        Browser.clearText(RegistrationPageObjects.dataOfBirth());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
    }
    public void fillValidOfficeManagerInformation(Map<String, String> data) throws Exception {
        logger.info("Step 02 : Enter valid National ID , DOB ");
        String OFM_Title = Browser.getWebElement(officeManagerInformationTitle()).getText();
        Assert.assertTrue(OFM_Title.contains("Office Manager Information")||
                OFM_Title.contains("استرجاع معلومات المدير"));
//        Browser.executeJSScroll(250);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.nationalIDLabel());
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.nationalIDNumber(), data.get("NID_Num"));

        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.dataOfBirth(), data.get("DOB"));
        Browser.takeScreenshot("After Fill Office Manager Information Fields");
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.searchForRecordButton());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
    }

    public void fillInvalidIdentifyVerification() throws Exception {
        logger.info("Step 03 : Enter Invalid Identify Verification Number");
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        String Code_Title = Browser.getWebElement(identifyVerificationTitle()).getText();
        Assert.assertTrue(Code_Title.contains("Identify Verification")||
                Code_Title.contains("رمز التحقق"));
        Browser.executeJSScroll(310);
        Browser.waitForSeconds(2);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1236");
        Browser.takeScreenshot();
        Browser.waitForSeconds(3);
        Browser.click(RegistrationPageObjects.VerifyIdentityButton());
        Browser.waitUntilVisibilityOfElement(errorMsgInvalidOtp(), 10);
        String ErrorMsg1 = Browser.getWebElement(errorMsgInvalidOtp()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg1.contains("OTP code is invalid")||
                ErrorMsg1.contains("OTP غير صالح"));
        Browser.waitForSeconds(1);
        Browser.takeScreenshot("After Fill Invalid Identify Verification Number");
        Browser.clearText(LoginPageObjects.getVerificationCode());
        Browser.waitForSeconds(2);
    }

    public void FillValidIdentifyVerification() throws Exception {
        logger.info("Step 03 : Enter Identify Verification Number");
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
//        String Code_Title = Browser.getWebElement(identifyVerificationTitle()).getText();
//        Assert.assertTrue(Code_Title.contains("Identify Verification")||
//                Code_Title.contains("رمز التحقق"));
//        Browser.waitForSeconds(2);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot("After Fill Identify Verification Number");
        Browser.click(RegistrationPageObjects.VerifyIdentityButton());
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
        Browser.waitForSeconds(2);
    }

    public void ConfirmFillValidIdentifyVerification() throws Exception {
        logger.info("Step 03 : Enter Identify Verification Number");
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        String Code_Title = Browser.getWebElement(identifyVerificationTitle1()).getText();
        Assert.assertTrue(Code_Title.contains("Identify Verification")||
                Code_Title.contains("رمز التحقق"));
        Browser.waitForSeconds(2);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot("After Fill Identify Verification Number");
        Browser.click(RegistrationPageObjects.VerifyIdentityButton());
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(300);
    }

    public void clickToNextButton() throws Exception {
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(450);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.nextButton());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot("After Click on Next Button");
    }
    public void clickToNextReviewButton() throws Exception {
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.nextButton(),30);
        Browser.click(RegistrationPageObjects.nextButton());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot("After Click on Next Review Button");
    }
    public void fillInvalidBrokerageOfficeInformation() throws Exception {
        logger.info("Step 04 : Enter Invalid CR Number");
        String BOI_Title = Browser.getWebElement(brokerageOfficeInformationTitle()).getText();
        Assert.assertTrue(BOI_Title.contains("2. Brokerage office information")||
                BOI_Title.contains("استرجاع معلومات المكتب"));
        //Browser.executeJSScroll(250);
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.registrationNum(), "0067546786");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg1 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg1.contains("number must start with 7")||
                ErrorMsg1.contains("يجب أن يبدأ رقم المؤسسة بـ 7"));
        Browser.clearText(RegistrationPageObjects.registrationNum());
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.registrationNum(), "mmm");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg2 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg2.contains("Please check the format")||
                ErrorMsg2.contains("يرجى التأكد من التنسيق"));
        Browser.waitForSeconds(2);
        Browser.clearText(RegistrationPageObjects.registrationNum());
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.registrationNum(), "700000");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg3 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg3.contains("The min number of characters is 10")||
                ErrorMsg3.contains("الحد الأدنى لعدد الأحرف هو 10"));
        Browser.waitForSeconds(2);
        for(int i = 0 ;i<3; i++ ){
            Browser.clearText(RegistrationPageObjects.registrationNum());
        }
    }

    public void FillValidBrokerageOfficeInformation(Map<String, String> data) throws Exception {
        logger.info("Step 04 : Enter valid CR Number");
        String BOI_Title = Browser.getWebElement(brokerageOfficeInformationTitle()).getText();
        Assert.assertTrue(BOI_Title.contains("2. Brokerage office information")||
                BOI_Title.contains("استرجاع معلومات المكتب"));
        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.registrationNum(), data.get("CRN"));
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.searchForRecordButton());
        Browser.waitForSeconds(8);
        Browser.executeJSScroll(200);
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.nextButton(),5);
        Browser.click(RegistrationPageObjects.nextButton());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.waitForSeconds(10);
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
    public void FillRepresentationDocument(Map<String, String> data) throws Exception {
        logger.info("Step 05 : Fill Representation document Fields");
        Browser.waitUntilVisibilityOfElement(VerifyRepresentationTitle(), 35);
//        String Verify_Title = Browser.getWebElement(VerifyRepresentationTitle()).getText();
//        Browser.waitForSeconds(6);
//        Assert.assertTrue(Verify_Title.contains("doesn't belong to a manager of entity")||
//                Verify_Title.contains("مراجعة معلومات المكتب"));
//        Browser.waitForSeconds(3);
        Browser.setText(RegistrationPageObjects.representationDocumentNumber(), "Automation2");
        Browser.waitForSeconds(3);
        String dropRepresentationDocumentType;
        Browser.click(representationDocumentDropDown());
        Browser.waitForSeconds(2);
        List<WebElement> list = Browser.driver.findElements(RegistrationPageObjects.getRepresentationDocument());
        for (WebElement w : list) {
            dropRepresentationDocumentType = w.getText();
            if (dropRepresentationDocumentType.equals(data.get("RD_Type"))) {
                w.click();
                break;
            }
        }
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.executeJSScroll(250);
        Browser.waitForSeconds(2);
        //CheckInvalidsAttachmentSize();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.uploadBut());
        robotFiles("Test.png");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.executeJSScroll(400);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.uploadBut2());
        robotFiles("Test.png");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.nextButton());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
    }
    public void CheckInvalidsAttachmentSize() throws Exception {
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.uploadBut());
        robotFiles("ejartestt.pdf");
        Browser.waitForSeconds(2);
        String ErrorMsg = Browser.getWebElement(RegistrationPageObjects.errorMsgFile()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg.contains("File is too big")||
                ErrorMsg.contains("حجم الملف أكبر من المسموح به"));
}
    public void FillMobileNumber() throws Exception {
        logger.info("Step 06 : Enter Mobile Number");
//        Browser.waitUntilVisibilityOfElement(mobilePhoneNumber(), 20);
//        Browser.waitForSeconds(1);
//        checkInvalidMobileNumberFormat();
//        Browser.waitForSeconds(1);
        Browser.setText(RegistrationPageObjects.mobilePhoneNumber(), "5547876593");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.executeJSScroll(250);
        Browser.waitUntilVisibilityOfElement(checkRequestStatusButton(), 15);
        Browser.click(RegistrationPageObjects.checkRequestStatusButton());
        Browser.waitForSeconds(8);
        Browser.takeScreenshot();
    }
    public void checkInvalidMobileNumberFormat() throws Exception {
        Browser.setText(RegistrationPageObjects.mobilePhoneNumber(), "500000");
        Browser.waitForSeconds(1);
        String ErrorMsg1 = Browser.getWebElement(errorMsgInvalidValue1()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg1.contains("Please check the format")||
                ErrorMsg1.contains("يرجى التأكد من التنسيق"));
        Browser.waitForSeconds(2);
        Browser.clearText(RegistrationPageObjects.mobilePhoneNumber());
        Browser.waitForSeconds(1);
    }

    public void NavigateToReviewPage() throws Exception {
        logger.info("Step 07 : Click to Confirm Registration request");
        Browser.waitUntilVisibilityOfElement(breakageOfficeAddedToEjarTitle(), 30);
        String Acknowledgement_Msg = Browser.getWebElement(breakageOfficeAddedToEjarTitle()).getText();
        Assert.assertTrue(Acknowledgement_Msg.contains("تم تسجيل منشأة الوساطة العقارية بنجاح"));
        Browser.waitForSeconds(3);
        Browser.executeJSScroll(200);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click((By.xpath("//button[@class='btn btn-primary']")));
        Browser.waitForSeconds(6);
        Browser.executeJSScroll(200);
        Browser.waitForSeconds(3);
        String Status = Browser.getWebElement(By.xpath("//span[@class='pin mt-1 warning']")).getText();
        Assert.assertTrue(Status.contains("تم الإرسال."));
        Browser.waitForSeconds(3);
        String RN = Browser.getWebElement(By.xpath("(//p[@class='info-value'])[1]")).getText();
        Browser.waitForSeconds(2);
        TestDataManager.addDependantGlobalTestData("RegistrationSuite","RequestID",RN);
        TestDataManager.writeDependantGlobalTestData("RegistrationSuite");


//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC02", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC03", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC06", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC07", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC08", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC09", "RN", RN);
//        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
//                "TC10", "RN", RN);
        Browser.waitForSeconds(3);
    }
    public void neviagteToCheckBORequestStatus() throws Exception {
        Browser.waitForSeconds(3);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.boCheckRegistrationRequestStatusTab());
        Browser.waitForSeconds(3);
    }

    public void checkRequestNumberSubmitted(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.requestNumberInput(), data.get("RN"));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        driver.manage().addCookie(new Cookie("_GRECAPTCHA", "09APYnBZVuhv4RsBzJV8enT_IuC3ehAsBTTGcHBAY2-sOAyjlEb_SExnqrEda6E_m5-3c8GaltiCG5LCf1nN7vR78"));
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.checkRequestStatusButton2());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        String Status = Browser.getWebElement(By.xpath("//span[@class='pin mt-1 warning']")).getText();
        Assert.assertTrue(Status.contains("تم الإرسال."));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
    }

    public void checkRequestNumberWithInvalidNumber(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.requestNumberInput(), data.get("RN") + "TT");
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.executeJSScroll(100);
        Browser.waitForSeconds(1);
        Browser.click(RegistrationPageObjects.checkRequestStatusButton2());
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.errorMsgInvalidRequestNumber(),40);
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String Status = Browser.getWebElement(RegistrationPageObjects.errorMsgInvalidRequestNumber()).getText();
        Assert.assertTrue(Status.contains("number was not found")
                ||Status.contains("عذرا، لا يوجد طلب لهذا الرقم، يرجى التأكد من الرقم"));
        Browser.waitForSeconds(3);
        Browser.clearText(RegistrationPageObjects.requestNumberInput());
    }
    public void NavigateToManageBOSubscriptionsPage() throws Exception {
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.adminDropdownMenu(), 15);
        Browser.click(LoginPageObjects.adminDropdownMenu());
        Browser.waitForSeconds(3);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.selectSubscription());
        Browser.waitForSeconds(4);
        Browser.takeScreenshot();
    }

    public void SearchForBOSubscriptionsRequest(Map<String, String> data) throws Exception {
        Browser.click(RegistrationPageObjects.subscriptionFilterBut());
        Browser.waitForSeconds(2);
        Browser.setText(subscriptionRequestNumberInput(), data.get("RN") + "TT");
        Browser.waitForSeconds(4);
        Browser.executeJSScroll(120);
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        String ErrorMsg1 = Browser.getWebElement(RegistrationPageObjects.errorRegistrationRequest()).getText();
        Browser.waitForSeconds(2);
        Assert.assertTrue(ErrorMsg1.contains("No Brokerage Office Membership Request found")||
                ErrorMsg1.contains("لم يتم العثور على طلب عضوية منشأة الوساطة العقارية"));
        Browser.waitForSeconds(2);
        Browser.clearText(subscriptionRequestNumberInput());
        Browser.waitForSeconds(2);
        Browser.setText(subscriptionRequestNumberInput(), data.get("RN"));
        Browser.waitForSeconds(10);
        Browser.executeJSScroll(250);
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        String Status = Browser.getWebElement(RegistrationPageObjects.subscriptionRequestStatus()).getText();
        Assert.assertTrue(Status.contains("Submitted")||Status.contains("تم الإرسال."));
    }
    public void ClickToApprovedBOSubscriptionsRequest() throws Exception {
        clickToAdminDropDownMenu();
        String Status2 = Browser.getWebElement(RegistrationPageObjects.checkVerifiedStatus()).getText();
        Assert.assertTrue(Status2.contains("Verified")||Status2.contains("موثق"));
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.isElementPresent(RegistrationPageObjects.checkRequestStatusButton());
        Browser.click(RegistrationPageObjects.checkRequestStatusButton());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.waitForSeconds(6);
    }
    public void clickToAdminDropDownMenu() throws Exception {
        Browser.click(RegistrationPageObjects.clickSubscriptionActionMenu());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.clickViewSubscriptionDetails());
        Browser.waitForSeconds(2);
    }

    public void ClickToRejectBOSubscriptionsRequest() throws Exception {
        clickToAdminDropDownMenu();
        String Status2 = Browser.getWebElement(RegistrationPageObjects.checkVerifiedStatus()).getText();
        Assert.assertTrue(Status2.contains("Verified")||Status2.contains("موثق"));
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.isElementPresent(RegistrationPageObjects.rejectButton());
        Browser.click(RegistrationPageObjects.rejectButton());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.setText(RegistrationPageObjects.inputNote(), "Test");
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.rejectButAfterAddNote());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.waitForSeconds(3);
    }
    public void checkRequestNumberApprovedOrReject(Map<String, String> data) throws Exception {
        Browser.waitForSeconds(3);
        Browser.setText(RegistrationPageObjects.requestNumberInput(), data.get("RN"));
        Browser.waitForSeconds(3);
        driver.manage().addCookie(new Cookie("_GRECAPTCHA", "09APYnBZVuhv4RsBzJV8enT_IuC3ehAsBTTGcHBAY2-sOAyjlEb_SExnqrEda6E_m5-3c8GaltiCG5LCf1nN7vR78"));
        Browser.waitForSeconds(3);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
        Browser.waitForSeconds(4);
        Browser.executeJSScroll(70);
        Browser.doubleClick(RegistrationPageObjects.checkRequestStatusButton2());
        Browser.waitForSeconds(3);
        Browser.takeScreenshot();
        Browser.executeJSScroll(180);
        Browser.waitForSeconds(2);
        String Status = Browser.getWebElement(subscriptionRequestStatus()).getText();
        if (Status.contains("الموافقة")) {
            Assert.assertTrue(Status.contains("Approved")||Status.contains("تمت الموافقة"));
            Browser.waitForSeconds(2);
            Browser.click(RegistrationPageObjects.checkRequestStatusContinueButton());
            Browser.waitForSeconds(2);
        }
        else
            Assert.assertTrue(Status.contains("Rejected")||Status.contains("الرفض"));
    }

    public void CreateBoOfficerAccount(ITestContext context) throws Exception {
        Browser.waitForSeconds(2);
        String TitleLogin = Browser.getWebElement(RegistrationPageObjects.SingUpTitle()).getText();
        Assert.assertTrue(TitleLogin.contains("Log in into Ejar platform")
                ||TitleLogin.contains("تسجيل الدخول إلى منصة ايجار"));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.clearText(RegistrationPageObjects.userNameInput());
        Browser.waitForSeconds(2);
        context.setAttribute("Username" ,"BO_AutomationTest6");
        Browser.setText(RegistrationPageObjects.userNameInput(), (String)context.getAttribute("Username"));
        Browser.waitForSeconds(2);
        /*com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "UsersDetails",
                "TC11", "Username",(String)context.getAttribute("Username"));
        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
                "TC12", "Username",(String)context.getAttribute("Username"));*/
        Browser.waitForSeconds(2);
        Browser.clearText(RegistrationPageObjects.userPasswordInput());
        Browser.waitForSeconds(2);
        context.setAttribute("Password" ,"EJARPasswordA123");
        Browser.setText(RegistrationPageObjects.userPasswordInput(),(String)context.getAttribute("Password"));
        Browser.waitForSeconds(2);
        /*com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "UsersDetails",
                "TC11", "Password",(String)context.getAttribute("Password"));
        com.testcrew.utility.ExcelManager.writeToExcelColumn(Constants.RUN_MANAGER_WORKBOOK.toString(), "BORegistrationDetails",
                "TC12", "Password",(String)context.getAttribute("Password"));*/
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.confirmPasswordInput(),(String)context.getAttribute("Password"));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.createAccountButton());
        Browser.waitForSeconds(10);
        String CreateAccountSuccessfully = Browser.getWebElement(RegistrationPageObjects.accountCreatedMessage()).getText();
        Assert.assertTrue(CreateAccountSuccessfully.contains("created successfully!")
                ||CreateAccountSuccessfully.contains("نجاح"));
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
    }
    public void clickToAccountActivation() throws Exception {
        Browser.waitForSeconds(15);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.firstTerm());
        Browser.waitForSeconds(1);
        Browser.executeJSScroll(3800);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.labelCheckbox1());
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.continueButton());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.secondTerm());
                Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.executeJSScroll(500);
        Browser.click(RegistrationPageObjects.labelCheckbox1());
                Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.labelCheckbox2());
                Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.continueButton());
        Browser.waitForSeconds(20);
        Browser.click(RegistrationPageObjects.thirdTerm());
                Browser.waitForSeconds(2);
        Browser.takeScreenshot();
        Browser.click(RegistrationPageObjects.mapButton());
        Browser.waitForSeconds(2);
    }
    public void clickCityDropdown() throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.cityDropdown(), 5);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.cityDropdown());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
    }
    public void selectBOCity(String city) throws Exception {
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.cityList(), 20);
        Browser.waitForSeconds(2);
        List<WebElement> listCity = Browser.driver.findElements(RegistrationPageObjects.cityList());
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
    public void fillAddress() throws Exception {
        Browser.waitForSeconds(3);
        Browser.setText(RegistrationPageObjects.buildingNumber(),"1234");
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.additionalNumber(),"4356");
        Browser.waitForSeconds(2);
        Browser.setText(RegistrationPageObjects.postalCode(),"13245");
        Browser.waitForSeconds(2);
        Browser.takeScreenshot();
    }
    public void selectOfficeLocated() throws Exception {
        Browser.click(RegistrationPageObjects.officeLocated());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
    }

    public void clickOnFindOnMap() throws Exception {
        Browser.click(RegistrationPageObjects.findOnMap());
        Browser.waitForSeconds(3);
        Browser.click(RegistrationPageObjects.confirmAdreesButton());
        Browser.waitForSeconds(4);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.confirmMapDetails());
        Browser.waitForSeconds(6);
        Browser.takeScreenshot();
        Browser.executeJSScroll(260);
        Browser.click(RegistrationPageObjects.nextButton());
    }
    public void completeEarTraining() throws Exception {
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.ForthTerm());
        Browser.waitForSeconds(10);
        Browser.click(RegistrationPageObjects.playVideoButton());
        Browser.waitForSeconds(2);
        Browser.waitUntilVisibilityOfElement(RegistrationPageObjects.checkRequestStatusButton(),30);
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.confirmNextPage());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.assessmentAnswer1());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.assessmentAnswer2());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.assessmentAnswer3());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.assessmentAnswer4());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.confirmAssessmentButton());
        Browser.waitForSeconds(2);
        Browser.click(RegistrationPageObjects.confirmAssessmentButton());
        Browser.waitForSeconds(1);
        Browser.takeScreenshot();
    }
}