package com.duoweidu.cases.fyb.openapi;

import com.duoweidu.cases.interfaces.FybInterfaceTest;
import com.duoweidu.config.FybConfig;
import com.duoweidu.config.GeneralAssert;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class UserDeleteaddress extends FybInterfaceTest {

    @Test(dependsOnGroups = "userAddaddress",description = "删除用户地址")
    public void userDeleteaddress() {
        setUrl("user.deleteaddress.uri");
        try {
            JSONObject jsonResult = new JSONObject(FybConfig.addaddressResult);
            JSONObject data = (JSONObject) jsonResult.get("data");
            String id = data.get("id").toString();
            List<NameValuePair> list = new LinkedList<>();
            list.add(new BasicNameValuePair("addressId", id));
            process(list,true,false);
        }catch (JSONException e) {
            GeneralAssert.jsonAssert(url, pathId, param, result, e);
        }
    }
}
