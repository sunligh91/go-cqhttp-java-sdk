package com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 */
@Data
public class GetLoginInfoResp implements Serializable {

    /**
     * QQ 号
     */
    @JSONField( name = "user_id")
    private Long userId;

    /**
     * QQ 昵称
     */
    private String nickname;
}
