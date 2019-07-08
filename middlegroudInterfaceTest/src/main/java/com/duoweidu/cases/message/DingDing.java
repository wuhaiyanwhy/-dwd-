package com.duoweidu.cases.message;

import com.duoweidu.utils.CallbackInterface;
import com.duoweidu.utils.ConfigFileUrl;

/**
 * 钉钉提醒
 */

public class DingDing {

    public static void push(String content, String mobile1, String mobile2, String mobile3) {
        String param = "{\"msgtype\": \"text\", \n" +
                "        \"text\": {\n" +
                "        \"content\": \"" + content + "\", \n" +
                "        },\n" +
                "      \"at\": {\n" +
                "        \"atMobiles\": [\n" +
                "            \"" + mobile1 + "\"\n" +
                "            \"" + mobile2 + "\"\n" +
                "            \"" + mobile3 + "\"\n" +
                "        ], \n" +
                "        \"isAtAll\": false\n" +
                "    }\n" +
                "}";
        String access_token = "46534ab567690b87fc5d5b57a5e2f12f0419ebbf98fcba665f1bbec724b3d733";
        //测试机器人
//        String access_token = "011d7f2e2d810d471150daaab456b34338a5a9fcd0a9769577a858c679273155";
        String url = ConfigFileUrl.getUrlByKey(8, 0, "robot.send.uri") +
                "?access_token=" + access_token;
        CallbackInterface.postStringResult(url, 3, param);

    }

}
