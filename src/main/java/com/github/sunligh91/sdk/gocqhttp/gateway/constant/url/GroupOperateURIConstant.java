package com.github.sunligh91.sdk.gocqhttp.gateway.constant.url;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 * 群操作
 * 接口请求枚举
 */
public interface GroupOperateURIConstant {

    /**
     * 群单人禁言
     */
    String SET_GROUP_BAN = "set_group_ban";

    /**
     * 群全员禁言
     */
    String SET_GROUP_WHOLE_BAN = "set_group_whole_ban";

    /**
     * 群匿名用户禁言
     */
    String SET_GROUP_ANONYMOUS_BAN = "set_group_anonymous_ban";

    /**
     * 设置精华消息
     */
    String SET_ESSENCE_MSG = "set_essence_msg";

    /**
     * 移出精华消息
     */
    String DELETE_ESSENCE_MSG = "delete_essence_msg";

    /**
     * 群打卡
     */
    String SEND_GROUP_SIGN = "send_group_sign";

    /**
     * 群设置匿名
     */
    String SET_GROUP_ANONYMOUS = "set_group_anonymous";

    /**
     * 发送群公告
     */
    String SEND_GROUP_NOTICE = "_send_group_notice";

    /**
     * 获取群公告
     */
    String GET_GROUP_NOTICE = "_get_group_notice";

    /**
     * 群组踢人
     */
    String SET_GROUP_KICK = "set_group_kick";

    /**
     * 退出群组
     */
    String SET_GROUP_LEAVE = "set_group_leave";


}
