package com.github.sunligh91.sdk.gocqhttp.gateway.req.bot;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.sunligh91.sdk.gocqhttp.gateway.req.BaseGatewayReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SetQQProfileReq extends BaseGatewayReq {

    /**
     * 名称
     */
    private String nickname;

    /**
     * 公司
     */
    private String company;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 学校
     */
    private String college;

    /**
     * 个人说明
     */
    @JSONField(name = "personal_note")
    private String personalNote;
}
