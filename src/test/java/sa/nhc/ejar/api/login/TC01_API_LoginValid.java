package sa.nhc.ejar.api.login;

import java.util.Map;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.testng.Assert;
import org.testng.annotations.Test;
import sa.nhc.ejar.api.base.NHSEjarAPITest;

public class TC01_API_LoginValid extends NHSEjarAPITest {

    @Test(dataProvider = "testDataProvider")
    public void apiLoginValid(Map<String, String> data) throws Exception {
        logger.info("Step 00: Test Data : " + data.toString());

        logger.info("Step 01: Get Login API Details");
        data.putAll(api.loginApi.getLoginAPIDetails("Login"));
        HttpResponse<JsonNode> response = api.loginApi.login(data);

        logger.info("Step 02: Validate Complete Response");
        api.loginApi.assertLoginResponse(data);

        logger.info("Step 03: Validate Specific Response");
        String token = String.valueOf(response.getBody().getObject().getString("token"));
        Assert.assertNotEquals(token, "", "Response body token.");
        logger.pass("Response body token is " + token);

        // Cascade API Possible

    }
}
