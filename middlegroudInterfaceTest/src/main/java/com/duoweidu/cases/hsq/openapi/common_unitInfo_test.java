package com.duoweidu.cases.hsq.openapi;

import com.duoweidu.cases.interfaces.HsqInterfaceTest;
import org.testng.annotations.Test;

public class common_unitInfo_test extends HsqInterfaceTest {


    @Test(dependsOnGroups = "loginTrue",description = "检测组件包更新")
    public void common_unitInfo_true() {
        setUrl("common.unitInfo.uri");
        process(true,false);
    }
}
