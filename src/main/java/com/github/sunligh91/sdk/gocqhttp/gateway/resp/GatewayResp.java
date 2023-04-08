package com.github.sunligh91.sdk.gocqhttp.gateway.resp;

import lombok.Data;

import java.util.Map;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 */
@Data
public class GatewayResp {

    /**
     * 状态, 表示 API 是否调用成功, 如果成功, 则是 OK, 其他的在下面会说明
     * ok	    api 调用成功
     * async	api 调用已经提交异步处理, 此时 retcode 为 1, 具体 api 调用是否成功无法得知
     * failed	api 调用失败
     */
    private String status;

    /**
     *
     */
    private Integer retcode;

    /**
     * 错误消息, 仅在 API 调用失败时有该字段
     */
    private String msg;

    /**
     * 对错误的详细解释(中文), 仅在 API 调用失败时有该字段
     */
    private String wording;

    /**
     * 相应的数据
     */
    private String data;

    /**
     * '回声', 如果请求时指定了 echo, 那么响应也会包含 echo
     */
    private String echo;
}
