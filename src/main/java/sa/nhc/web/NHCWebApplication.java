package sa.nhc.web;
import com.testcrew.utility.TCRobot;
import sa.nhc.web.pages.*;
import sa.nhc.web.pages.AddResidentialContractPage;
import sa.nhc.web.pages.AddPropertyPage;
import sa.nhc.web.pages.LoginPage;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.awt.event.KeyEvent;
import java.util.Map;

public class NHCWebApplication {

    public final LoginPage loginPage;
    public final AddResidentialContractPage addResidentialContractPage;
    public final RechargeWalletPage rechargeWalletPage;
    public final AddPropertyPage addPropertyPage;
    public final RegistrationPage registrationPage;

    public final ChangeLessorAndLessorRepresentativePage changeLessorAndLessorRepresentativePage;

    public NHCWebApplication() {
        loginPage = new LoginPage();
        addResidentialContractPage = new AddResidentialContractPage();
        rechargeWalletPage = new RechargeWalletPage();
        addPropertyPage = new AddPropertyPage();
        registrationPage = new RegistrationPage();
        changeLessorAndLessorRepresentativePage = new ChangeLessorAndLessorRepresentativePage();


    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
        Browser.waitForSeconds(8);
        TCRobot robot = new TCRobot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
        }
    }
}
