package com.duoweidu.cases.hsq.openapi;

import com.duoweidu.cases.interfaces.HsqInterfaceTest;
import com.duoweidu.utils.ConfigFileUrl;
import org.apache.http.NameValuePair;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class user_logout_test extends HsqInterfaceTest {

    @AfterClass
    @Test(description = "用户登出")
    public void user_logout_true() throws IOException {
        url = ConfigFileUrl.getUrlByKey(ConfigFileUrl.USER_LOGOUT);
        List<NameValuePair> list = new LinkedList<>();
        process(list,true,false);
    }
}
