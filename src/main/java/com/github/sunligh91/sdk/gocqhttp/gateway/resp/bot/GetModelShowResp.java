package com.github.sunligh91.sdk.gocqhttp.gateway.resp.bot;

import java.io.Serializable;
import java.util.List;

/**
 * @author : sunligh91
 * @date : 2023/4/9 7:03
 */
public class GetModelShowResp implements Serializable {

    /**
     * 机型列表
     */
    private List<Driver> variants;
}
