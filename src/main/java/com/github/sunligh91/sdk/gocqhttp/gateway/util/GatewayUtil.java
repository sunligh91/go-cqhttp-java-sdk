package com.github.sunligh91.sdk.gocqhttp.gateway.util;

import com.alibaba.fastjson.JSON;
import com.github.sunligh91.sdk.gocqhttp.gateway.GoCqHttpHost;
import com.github.sunligh91.sdk.gocqhttp.gateway.constant.StatusEnum;
import com.github.sunligh91.sdk.gocqhttp.gateway.exception.GoCqHttpException;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.BaseGatewayReq;
import com.github.sunligh91.sdk.gocqhttp.gateway.resp.GatewayResp;
import org.apache.commons.lang3.StringUtils;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:20
 */
public class GatewayUtil {

    /**
     * 发送post请求
     * @return
     */
    public static <T> T doPost(String httpUrl) {
        return doPost(httpUrl, null, null);
    }

    /**
     * 发送post请求
     * @return
     */
    public static <T> T doPost(String httpUrl, BaseGatewayReq baseGatewayReq) {
        return doPost(httpUrl, baseGatewayReq, null);
    }

    /**
     * 发送post请求
     * @return
     */
    public static <T> T doPost(String httpUrl, Class<T> clazz) {
        return doPost(httpUrl, null, clazz);
    }

    /**
     * 发送post请求
     * @return
     */
    public static <T> T doPost(String httpUrl, BaseGatewayReq baseGatewayReq, Class<T> clazz) {
        String result;
        String hostUrl = GoCqHttpHost.getHostUrl();
        if (baseGatewayReq == null){
            result = HttpHelper.doPost(hostUrl + "/" + httpUrl);
        } else {
            result = HttpHelper.doPost(hostUrl + "/" + httpUrl, baseGatewayReq);
        }
        GatewayResp gatewayResp = JSON.parseObject(result, GatewayResp.class);
        if (StatusEnum.FAILED.getCode().equals(gatewayResp.getStatus())){
            throw new GoCqHttpException(gatewayResp.getMsg());
        }
        if (clazz == null){
            return null;
        }
        String dataString = gatewayResp.getData();
        if (StringUtils.isBlank(dataString)){
            return null;
        }
        return JSON.parseObject(dataString, clazz);
    }



}
