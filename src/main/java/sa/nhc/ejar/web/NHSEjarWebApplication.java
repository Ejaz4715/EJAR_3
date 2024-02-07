package sa.nhc.ejar.web;

import sa.nhc.ejar.web.pages.LoginPage;
import com.testcrew.manager.TestConfigManager;
import com.testcrew.web.Browser;

import java.util.Map;

public class NHSEjarWebApplication {

    public final LoginPage loginPage;

    public NHSEjarWebApplication() {
        loginPage = new LoginPage();
    }

    public void openApplication(Map<String, String> data) throws Exception {
        if (data.get("URL") != null) {
            Browser.openUrl(data.get("URL"));
        } else {
            Browser.openUrl(TestConfigManager.getTestSettingsWebAppURL());
        }
        loginPage.waitForPageLoad();
    }
}
