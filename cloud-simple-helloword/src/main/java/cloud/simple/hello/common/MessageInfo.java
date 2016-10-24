package cloud.simple.hello.common;

import java.io.Serializable;

public class MessageInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String message;
    private int code;
    private Object result;

    public MessageInfo() {
        this.message = "SUCCESS";
        this.code = 0;
    }

    public MessageInfo(Object result) {
        this.message = "SUCCESS";
        this.code = 0;
        this.result = result;
    }

    public MessageInfo(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public MessageInfo(String message, int code, Object result) {
        this.message = message;
        this.code = code;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
