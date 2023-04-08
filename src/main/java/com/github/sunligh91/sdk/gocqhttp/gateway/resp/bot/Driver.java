package com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * 机型
 * @author : sunligh91
 * @date : 2023/4/9 7:09
 */
@Data
public class Driver implements Serializable {

    /**
     * --
     */
    @JSONField( name = "model_show")
    private String modelShow;

    /**
     * --
     */
    @JSONField( name = "need_pay")
    private String needPay;
}
