package sa.nhc.web;
import sa.nhc.web.pages.*;
import sa.nhc.web.pages.AddResidentialContractPage;
import sa.nhc.web.pages.AddPropertyPage;
import sa.nhc.web.pages.LoginPage;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

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
    }
}
