package com.github.sunligh91.sdk.gocqhttp.gateway;

/**
 * go-cqhttp 地址
 * @author : sunligh91
 * @date : 2023/4/9 6:25
 */
public class GoCqHttpHost {

    private static String HOST_URL = "http://127.0.0.1";

    public static void setHostUrl(String hostUrl){
        HOST_URL = hostUrl;
    }

    public static String getHostUrl(){
        return HOST_URL;
    }

}
