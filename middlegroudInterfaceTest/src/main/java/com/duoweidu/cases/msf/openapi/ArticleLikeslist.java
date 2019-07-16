package com.duoweidu.cases.msf.openapi;

import com.duoweidu.cases.interfaces.MsfInterfaceTest;
import com.duoweidu.config.sql.SqlDetail;
import org.testng.annotations.Test;

public class ArticleLikeslist extends MsfInterfaceTest {

    @Test(dependsOnGroups = "loginTrue",description = "点赞列表")
    public void articleLikeslist() {
        setUrl("article.likeslist.uri");
        param = "id=" + SqlDetail.getInstance().getParamValue("article_id");
        process(true,true);
    }
}