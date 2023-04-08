package com.github.sunligh91.sdk.gocqhttp.gateway.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 */
@AllArgsConstructor
@Getter
public enum RetCodeEnum {

    /**
     * api 调用成功
     */
    SUCCESS(0),

    /**
     * api 调用已经提交异步处理, 此时 retcode 为 1, 具体 api 调用是否成功无法得知
     */
    ASYNC(1),

    /**
     * api 调用失败
     */
    FAILED(-1),
    ;

    private final Integer code;

    public static RetCodeEnum getEnumByCode(Integer code){
        RetCodeEnum[] values = RetCodeEnum.values();
        for (RetCodeEnum value : values) {
            if (value.code.equals(code)){
                return value;
            }
        }
        return RetCodeEnum.FAILED;
    }
}
