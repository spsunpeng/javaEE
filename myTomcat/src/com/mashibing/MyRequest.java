package com.mashibing;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author sunpeng
 * @Date 2021-03-05 8:50
 */
public class MyRequest {

    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        //读取数据
        byte[] buffer = new byte[1024];
        int len = 0;
        String str = null;
        if((len=inputStream.read(buffer))>0){
            str= new String(buffer, 0, len);
        }
        //获取数据
        String data = str.split("\n")[0];
        String[] params = data.split(" ");
        method = params[0];
        url = params[1];
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
