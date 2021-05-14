package com.mashibing;

import java.io.OutputStream;

/**
 * @author sunpeng
 * @Date 2021-03-05 11:00
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String str) {
        try{
            StringBuilder builder = new StringBuilder();
            builder.append("HTTP/1.1 200 OK\n")
                    .append("Content-Type:text/html\n")
                    .append("\r\n")
                    .append("<html>")
                    .append("<body>")
                    .append("<h1>"+str+"</h1>")
                    .append("</body>")
                    .append("</html>");
            outputStream.write(builder.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            System.out.println("写错误");
        }
    }
}
