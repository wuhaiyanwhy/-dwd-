package com.duoweidu.cases.msf.openapi;

import com.duoweidu.cases.interfaces.MsfInterfaceTest;
import org.testng.annotations.Test;

public class UserArticlelist extends MsfInterfaceTest {

    @Test(dependsOnGroups = "loginTrue",description = "美食笔记列表")
    public void userArticlelist() {
        setUrl("user.articlelist.uri");
        param = "page_num=1&page_limit=20";
        process(true,false);
    }
}
