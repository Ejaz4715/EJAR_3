package sa.nhc.web.login;

import org.testng.annotations.Test;
import sa.nhc.web.base.NHCWebTest;

import java.util.Map;

public class TC09_RechargeWallet extends NHCWebTest {
    @Test(dataProvider = "testDataProvider")
    public void chargeWalletBOManager(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter verification code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Navigate to EJAR dashboard");
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("BO_Manager");
        logger.info("Step 05: Recharge Wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
    @Test(dataProvider = "testDataProvider")
    public void chargeWalletTenant(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter verification code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Navigate to EJAR dashboard");
//        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("Tenant");
        logger.info("Step 05: Recharge Wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
    @Test(dataProvider = "testDataProvider")
    public void chargeWalletLesser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter verification code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Navigate to EJAR dashboard");
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("Lesser");
        logger.info("Step 05: Recharge Wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
    @Test(dataProvider = "testDataProvider")
    public void addIbanAndChargeWalletBOManager(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter Verification Code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Close Ejar POP up");
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("BO_Manager");
        logger.info("Step 05: Add Iban by filling all mandatory fields");
        app.rechargeWalletPage.addIban();
        logger.info("Step 06: Recharge wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
    @Test(dataProvider = "testDataProvider")
    public void addIbanAndChargeWalletTenant(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter Verification Code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Close Ejar POP up");
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("Tenant");
        logger.info("Step 05: Add Iban by filling all mandatory fields");
        app.rechargeWalletPage.addIban();
        logger.info("Step 06: Recharge wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
    @Test(dataProvider = "testDataProvider")
    public void addIbanAndChargeWalletLesser(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());
        app.openApplication(data);
        app.loginPage.changeUILanguage("ar");
        app.loginPage.assertLoginPageDisplayed();

        logger.info("Step 01: Login to Application Enter Email, Enter Password, click Login");
        app.loginPage.enterUsername(data.get("Username"));
        app.loginPage.enterPassword(data.get("Password"));
        app.loginPage.clickLogin();
        logger.info("Step 02: Enter Verification Code");
        app.loginPage.enterVerificationCode();
        logger.info("Step 03: Close Ejar POP up");
        app.loginPage.closeExploreEjarPopUp();
        logger.info("Step 04: Select officer");
        app.rechargeWalletPage.chooseOfficer("Lesser");
        logger.info("Step 05: Add Iban by filling all mandatory fields");
        app.rechargeWalletPage.addIban();
        logger.info("Step 06: Recharge wallet");
        app.rechargeWalletPage.rechargeWallet();
    }
}
