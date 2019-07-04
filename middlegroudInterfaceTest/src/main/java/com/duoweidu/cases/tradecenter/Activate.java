package com.duoweidu.cases.tradecenter;

import com.duoweidu.cases.interfaces.InterfaceTest;
import com.duoweidu.config.SqlDetail;
import com.duoweidu.config.TradecenterConfig;
import com.duoweidu.model.tradecenter.ResultData;
import com.duoweidu.utils.ConfigFileUrl;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class Activate extends InterfaceTest {

    {
        url = ConfigFileUrl.getUrlByKey("gateway.http.uri");
        pathId = SqlDetail.getPathId("gateway.http.uri");
    }

    private ResultData model;

    @Test(dependsOnGroups = "iqgCreate", description = "激活账户", groups = "iqgActivate")
    public void iqgActivate() {
        List<NameValuePair> list = new LinkedList<>();
        list.add(new BasicNameValuePair("method", "account.activate"));
        list.add(new BasicNameValuePair("accountNumber", TradecenterConfig.iqgAccountNumber));
        list.add(new BasicNameValuePair("version", SqlDetail.getParamValue(0, "version")));
        list.add(new BasicNameValuePair("ip", SqlDetail.getParamValue(0, "ip")));
        list.add(new BasicNameValuePair("userId", SqlDetail.getParamValue(0, "createUserId")));
        list.add(new BasicNameValuePair("appId", SqlDetail.getParamValue(0, "iqgAppId")));
        process(list, true, false);
        if ("beta".equals(ConfigFileUrl.getEnv())) {
            model = sparseJson(ResultData.class);
            detailAssert();
        }
    }

    private void detailAssert() {
        detailAssertTest("success", "result", model.result);
        detailAssertTest("", "reverse", model.reverse);

    }


}