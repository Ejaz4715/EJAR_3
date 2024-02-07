package sa.nhc.ejar.api;

import sa.nhc.ejar.api.repo.LoginAPI;

public class NHSEjarAPI {

    public final LoginAPI loginApi;

    public NHSEjarAPI() {
        loginApi = new LoginAPI();
    }
}