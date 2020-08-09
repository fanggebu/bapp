package com.qiuhen.bapp.po;

/**
 * @ProjectName: interfaces
 * @Package: com.qiuhen.interfaces.pojo
 * @ClassName: ApiResponse
 * @Author: qiuhen
 * @Description: 返回封装实体类
 * @Date: 2020/5/7 18:47
 * @Version: 1.0
 */
public class APIResponse<T> {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";

    private static final String NOT_FOUND = "404";

    private static final String NOT_AUTHORITY = "403";

    private static final String SERVER_ERROR = "500";


    private String code;
    private T data;
    private String msg;

    public APIResponse(){

    }

    public APIResponse(String code){
        this.code = code;
    }

    public APIResponse(String code, T data){
        this.code = code;
        this.data = data;
    }

    public APIResponse(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static APIResponse success(){
        return new APIResponse(CODE_SUCCESS);
    }

    public static APIResponse success(Object data){
        return new APIResponse(CODE_SUCCESS, data);
    }

    public static APIResponse fail(String msg){
        return new APIResponse(CODE_FAIL, msg);
    }

    public static APIResponse widthCode(String errorCode) {
        return new APIResponse(errorCode);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}


