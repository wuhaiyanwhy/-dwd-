package com.duoweidu.cases.hsq.openapi;

import com.duoweidu.cases.interfaces.HsqInterfaceTest;
import com.duoweidu.utils.ConfigFileUrl;
import org.apache.http.NameValuePair;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class user_addresslist_test extends HsqInterfaceTest {

    @Test(dependsOnGroups = "loginTrue",description = "获取用户地址列表")
    public void user_addresslist_true() throws IOException {
        url = ConfigFileUrl.getUrlByKey(ConfigFileUrl.USER_ADDRESSLIST);
        List<NameValuePair> list = new LinkedList<>();
        process(list,true,true);
    }
}
