package com.github.sunligh91.sdk.gocqhttp.gateway.req.bot;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.BaseGatewayReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : sunligh91
 * @date : 2023/4/9 7:03
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SetModelShowReq extends BaseGatewayReq {

    /**
     * 机型名称
     */
    private String model;

    /**
     * --
     */
    private String modelShow;
}
