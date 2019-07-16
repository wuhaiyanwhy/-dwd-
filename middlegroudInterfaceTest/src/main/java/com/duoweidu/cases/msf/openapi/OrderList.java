package com.duoweidu.cases.msf.openapi;

import com.duoweidu.cases.interfaces.InterfaceTest;
import com.duoweidu.cases.interfaces.MsfInterfaceTest;
import org.testng.annotations.Test;

public class OrderList extends MsfInterfaceTest {

    @Test(dependsOnGroups = "loginTrue",description = "订单列表接口")
    public void orderList() {
        setUrl("order.list.uri");
        param = "page_num=1&page_limit=20";
        process(true,true);
    }
}