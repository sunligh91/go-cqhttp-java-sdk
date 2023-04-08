package com.github.sunligh91.sdk.gocqhttp.gateway.exception;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:28
 */
public class GoCqHttpException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private int errorCode = -1;

    public GoCqHttpException(String message) {
        super("GoCqHttp请求失败，错误信息：" + message);
    }

    public GoCqHttpException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public GoCqHttpException(int errorCode, String msg, Throwable cause) {
        super(msg, cause);
        this.errorCode = errorCode;
    }

    public GoCqHttpException(Throwable cause) {
        super(cause);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
