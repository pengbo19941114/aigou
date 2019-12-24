package com.example.aigou;

public class AjaxResult {
    private Boolean success = true;
    private String msg = "SUCCESSFUL";
    private Object data;//data is returned

    public static AjaxResult me(){
        return new AjaxResult();
    }
    public AjaxResult() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
