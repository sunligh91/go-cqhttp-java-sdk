package com.github.sunligh91.sdk.gocqhttp.gateway.req.bot;

import com.github.sunligh91.sdk.gocqhttp.gateway.req.BaseGatewayReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author : sunligh91
 * @date : 2023/4/9 7:17
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetOnlineClientsReq extends BaseGatewayReq {

    /**
     * 是否无视缓存
     */
    private boolean no_cache;
}
