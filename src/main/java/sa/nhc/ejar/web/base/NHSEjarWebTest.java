package sa.nhc.ejar.web.base;

import sa.nhc.ejar.web.NHSEjarWebApplication;
import com.testcrew.web.Browser;
import com.testcrew.wrapper.base.TestCrewWebBaseTest;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

public class NHSEjarWebTest extends TestCrewWebBaseTest {

    public NHSEjarWebApplication app;

    public NHSEjarWebTest() {
        app = new NHSEjarWebApplication();
    }

    @BeforeSuite
    public void beforeSuiteRewaa() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        Browser.setUserDesiredCapabilities(desiredCapabilities);
    }
}