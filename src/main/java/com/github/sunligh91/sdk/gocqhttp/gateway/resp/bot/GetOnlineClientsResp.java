package com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : sunligh91
 * @date : 2023/4/9 7:18
 */
@Data
public class GetOnlineClientsResp implements Serializable {

    /**
     * 在线客户端列表
     */
    private List<Device> clients;
}
