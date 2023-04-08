package com.github.sunligh91.sdk.gocqhttp.gateway.constant.url;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 * bot账号
 * 接口请求枚举
 */
public interface BotAccountURIConstant {

    /**
     * 获取登录号信息
     */
    String GET_LOGIN_INFO = "get_login_info";

    /**
     * 设置登录号资料
     */
    String SET_QQ_PROFILE = "set_qq_profile";

    /**
     * 获取企点账号信息
     */
    String QIDIAN_GET_ACCOUNT_INFO = "qidian_get_account_info";

    /**
     * 获取在线机型
     */
    String GET_MODEL_SHOW = "_get_model_show";

    /**
     * 设置在线机型
     */
    String SET_MODEL_SHOW = "_set_model_show";

    /**
     * 获取当前账号在线客户端列表
     */
    String GET_ONLINE_CLIENTS = "get_online_clients";
}
