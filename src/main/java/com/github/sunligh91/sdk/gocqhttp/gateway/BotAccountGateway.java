package com.github.sunligh91.sdk.gocqhttp.gateway;

import com.github.sunligh91.sdk.gocqhttp.gateway.constant.url.BotAccountURIConstant;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.bot.GetModelShowReq;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.bot.GetOnlineClientsReq;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.bot.SetModelShowReq;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.bot.SetQQProfileReq;
import com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot.GetLoginInfoResp;
import com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot.GetModelShowResp;
import com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot.GetOnlineClientsResp;
import com.github.sunligh91.sdk.gocqhttp.gateway.util.GatewayUtil;

/**
 * Bot 账号
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 */
public class BotAccountGateway {

    /**
     * 获取登录号信息
     * @return
     */
    public static GetLoginInfoResp getLoginInfo(){
        return GatewayUtil.doPost(BotAccountURIConstant.GET_LOGIN_INFO, GetLoginInfoResp.class);
    }

    /**
     * 设置登录号资料
     * @param setQQProfileReq
     * @return
     */
    public static void setQQProfile(SetQQProfileReq setQQProfileReq){
        GatewayUtil.doPost(BotAccountURIConstant.SET_QQ_PROFILE, setQQProfileReq);
    }

    /**
     * 获取企点账号信息
     * @return
     */
    public static String qidianGetAccountInfo(){
        return GatewayUtil.doPost(BotAccountURIConstant.QIDIAN_GET_ACCOUNT_INFO, String.class);
    }

    /**
     * 获取在线机型
     * @return
     */
    public static GetModelShowResp getModelShow(GetModelShowReq getModelShowReq){
        return GatewayUtil.doPost(BotAccountURIConstant.GET_MODEL_SHOW, getModelShowReq, GetModelShowResp.class);
    }

    /**
     * 设置在线机型
     * @return
     */
    public static void setModelShow(SetModelShowReq setModelShowReq){
        GatewayUtil.doPost(BotAccountURIConstant.SET_MODEL_SHOW, setModelShowReq);
    }

    /**
     * 获取当前账号在线客户端列表
     * @param getOnlineClientsReq
     * @return
     */
    public static GetOnlineClientsResp getOnlineClients(GetOnlineClientsReq getOnlineClientsReq){
        return GatewayUtil.doPost(BotAccountURIConstant.GET_MODEL_SHOW, getOnlineClientsReq, GetOnlineClientsResp.class);

    }
}
