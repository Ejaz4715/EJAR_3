package sa.nhc.web.pages;

import com.testcrew.base.WebBasePage;
import com.testcrew.manager.ReportManager;
import com.testcrew.web.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sa.nhc.web.objects.LoginPageObjects;

import java.util.List;
import java.util.Map;

import static com.testcrew.web.Browser.driver;

public class LoginPage extends WebBasePage {
    public static final ReportManager logger = new ReportManager(LoginPage.class);

    // Page actions
    public void enterUsername(String email) throws Exception {
        logger.info("Enter Username as " + email);
        Browser.setText(LoginPageObjects.setTextEmail(), email);
        logger.addScreenshot("Entered Username successfully");

    }

    public void enterBORegistrationPassword(Map<String, String> data) throws Exception {
        logger.info("Enter Password");
        Browser.setText(LoginPageObjects.setTextPassword(), data.get("Password"));
    }

    public void enterPassword(String password) throws Exception {
        logger.info("Enter Password as " + password);
        Browser.setText(LoginPageObjects.setTextPassword(), password);
        Browser.waitForSeconds(1);
        logger.addScreenshot("Password has been entered successfully");
    }

    public void clickLogin() throws Exception {
        logger.info("Click Login");
        Browser.click(LoginPageObjects.getButtonLogin());
        Browser.waitForSeconds(2);
    }

    public void closePopUp() throws Exception {
        Browser.waitForSeconds(5);
        Browser.click(LoginPageObjects.popUpButton());
    }

    public void enterAdminUsername(String User) throws Exception {
        logger.info("Enter User Name As" + User);
        Browser.setText(LoginPageObjects.setUserName(), User);
        logger.addScreenshot("After Enter User Name");
        Browser.takeScreenshot();
    }
  /*  public void changeUILanguage(String language) throws Exception {
        logger.info("Change Language");
        Browser.waitUntilVisibilityOfElement(getDashboardHeading(), 20);
    }*/

    public void clickConfirmButton() throws Exception {
        logger.info("Click Confirm");
        Browser.click(LoginPageObjects.confirmButton());
    }

    public void changeUILanguage(String language) throws Exception {
        logger.info("Change Language");
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getDashboardHeading(), 20);
        Browser.waitForSeconds(3);
        String actualHeading = Browser.getWebElement(LoginPageObjects.getDashboardHeading()).getText();
        String dropDownLanguage;
        String expectedHeading = "الخدمات الإلكترونية";
            Browser.getWebElement(LoginPageObjects.getButtonLanguage()).click();
            List<WebElement> list =  driver.findElements(LoginPageObjects.getLanguage());
            for (WebElement w : list) {
                if (language.equalsIgnoreCase("en") && expectedHeading.equalsIgnoreCase(actualHeading)) {
                    dropDownLanguage = w.getText();
                    if(dropDownLanguage.equalsIgnoreCase("EN")){
                        w.click();
                        break;
                    }

                }
                else if(language.equalsIgnoreCase("ar")&& expectedHeading.equalsIgnoreCase(actualHeading)){
                    break;
                }
            }
    }

//    public void login(Map<String, String> data) throws Exception {
//        logger.info("Login to application.");
//        enterUsername(data.get("Email"));
//        enterPassword(data.get("Password"));
//        clickLogin();
//    }


    // Assert functions
    public void assertLoginPageDisplayed() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getDashboardHeading(), 20);
        Assert.assertTrue(Browser.isElementPresent(LoginPageObjects.getDashboardHeading()),
                "Login Page is displayed.");
        logger.info("Login Page displayed.");
    }

    public void enterVerificationCode() throws Exception {
        Browser.waitUntilVisibilityOfElement(LoginPageObjects.getVerificationCode(), 20);
        Browser.setText(LoginPageObjects.getVerificationCode(), "1234");
        Browser.click(LoginPageObjects.confirmButton());
        logger.addScreenshot("Verification code entered successfully");
        Browser.waitForSeconds(2);
    }

    public void clickLogout() throws Exception {
        Browser.waitForSeconds(2);
        logger.info("Click Logout");
        Browser.click(LoginPageObjects.adminDropdownMenu());
        Browser.waitForSeconds(2);
        Browser.click(LoginPageObjects.clickLogOut());
        Browser.waitForSeconds(3);
        Browser.takeScreenshot();
        Browser.waitForSeconds(3);
    }

    public void closeExploreEjarPopUp() throws Exception {
        Browser.waitForSeconds(5);
        if (Browser.isElementPresent(LoginPageObjects.exploreEjarPopUp())) {
//        if (Browser.isElementPresent(By.xpath("//div[@class=\"modal-content\"]"))){ //maybe by amna
            Browser.waitForSeconds(5);
            Browser.click(By.xpath("//button[@class = 'close-button']"));
        }
       /* if (Browser.isElementPresent(LoginPageObjects.popUpButton())){
            Browser.waitForSeconds(5);
            Browser.click(LoginPageObjects.popUpButton());
        }*/
    }
}


