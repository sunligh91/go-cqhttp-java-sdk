package com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : sunligh91
 * @date : 2023/4/9 7:18
 */
@Data
public class Device implements Serializable{

    /**
     * 客户端ID
     */
    @JSONField( name = "app_id")
    private Long appId;

    /**
     * 设备名称
     */
    @JSONField( name = "device_name")
    private String deviceName;

    /**
     * 设备类型
     */
    @JSONField( name = "device_kind")
    private String deviceKind;

}
