package com.camila.ortiz.ortiz_final;

public class responseBody {

    boolean success;
    int status;

    data data;

    public responseBody() {
    }

    public boolean isSuccess() {
        return success;
    }

    public int getStatus() {
        return status;
    }

    public com.camila.ortiz.ortiz_final.data getData() {
        return data;
    }
}
