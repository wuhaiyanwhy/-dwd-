package com.duoweidu.cases.fyb.openapi;

import com.duoweidu.cases.interfaces.FybInterfaceTest;
import com.duoweidu.config.TraverseConfig;
import com.duoweidu.model.fyb.CommonQiniutokenData;
import org.testng.annotations.Test;

import java.util.Map;

public class CommonQiniutoken extends FybInterfaceTest {

    private CommonQiniutokenData model;

    @Test(description = "获取七牛token")
    public void commonQiniutoken() {
        setUrl("common.qiniutoken.uri");
        process(true,false);
        model = sparseJson(CommonQiniutokenData.class);
        detailAssert();
    }

    private void detailAssert() {
        Map<String, Object> mapData = TraverseConfig.traverseObj(model);
        for (Map.Entry<String, Object> entry:
             mapData.entrySet()) {
            assertNotNull(entry.getKey(), entry.getValue());
        }
    }
}
