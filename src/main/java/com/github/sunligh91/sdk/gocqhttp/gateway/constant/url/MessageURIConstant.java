package com.github.sunligh91.sdk.gocqhttp.gateway.constant.url;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 * 消息
 * 接口请求枚举
 */
public interface MessageURIConstant {

    /**
     * 发送私聊消息
     */
    String SEND_PRIVATE_MSG = "send_private_msg";

    /**
     * 发送群聊消息
     */
    String SEND_GROUP_MSG = "send_group_msg";

    /**
     * 发送消息
     */
    String SEND_MSG = "send_msg";

    /**
     * 获取消息
     */
    String GET_MSG = "get_msg";

    /**
     * 撤回消息
     */
    String DELETE_MSG = "delete_msg";

    /**
     * 标记消息已读
     */
    String MARK_MSG_AS_READ = "mark_msg_as_read";

    /**
     * 获取合并转发内容
     */
    String GET_FORWARD_MSG = "get_forward_msg";

    /**
     * 发送合并转发 ( 群聊 )
     */
    String SEND_GROUP_FORWARD_MSG = "send_group_forward_msg";

    /**
     * 发送合并转发 ( 好友 )
     */
    String SEND_PRIVATE_FORWARD_MSG = "send_private_forward_msg";

    /**
     * 获取群消息历史记录
     */
    String GET_GROUP_MSG_HISTORY = "get_group_msg_history";
}
