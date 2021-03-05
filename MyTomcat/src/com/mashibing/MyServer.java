package com.mashibing;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author sunpeng
 * @Date 2021-03-05 13:29
 */
public class MyServer {

    public static void run(int port) throws Exception {
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = null;
        while (true){
            socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            MyRequest request = new MyRequest(inputStream);
            MyResponse response = new MyResponse(outputStream);
            String clazz = new MyMapping().getMapping().get(request.getUrl());
            if(clazz != null){
                Class<MyServlet> aClass = (Class<MyServlet>) Class.forName(clazz);
                MyServlet myServlet = aClass.newInstance();
                myServlet.service(request, response);
            }
        }
    }

    public static void main(String[] args){
        try {
            run(10084);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
