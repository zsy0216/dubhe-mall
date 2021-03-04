package com.zhang.result;

/**
 * @author: zhangshuaiyin
 * @date: 2021/3/2 16:27
 */
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS("200", "操作成功"),

    /**
     * 失败
     */
    ERROR("500", "操作失败");

    /**
     * 响应代码
     */
    private String code;
    /**
     * 响应信息
     */
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
