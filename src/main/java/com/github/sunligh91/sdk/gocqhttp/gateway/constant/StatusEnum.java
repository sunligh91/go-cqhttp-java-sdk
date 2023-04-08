package com.github.sunligh91.sdk.gocqhttp.gateway.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 */
@AllArgsConstructor
@Getter
public enum StatusEnum {
    /**
     * api 调用成功
     */
    OK("ok"),

    /**
     * api 调用已经提交异步处理, 此时 retcode 为 1, 具体 api 调用是否成功无法得知
     */
    ASYNC("async"),

    /**
     * api 调用失败
     */
    FAILED("failed"),
    ;

    private final String code;

    public static StatusEnum getEnumByCode(String code){
        StatusEnum[] values = StatusEnum.values();
        for (StatusEnum value : values) {
            if (value.code.equals(code)){
                return value;
            }
        }
        return null;
    }


}
