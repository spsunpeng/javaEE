package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author sunpeng
 * @Date 2021-03-10 17:58
 */

public class ServletRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //请求行
        System.out.println("请求行：");
        System.out.println(request.getMethod());      // 请求方式：GET
        System.out.println(request.getRequestURL());  // 完整地址：http://localhost:8090/servlet/request
        System.out.println(request.getRequestURI()); // 资源路径：/servlet/request
        System.out.println(request.getScheme());     // 请求协议：http

        //请求头
        System.out.println("请求头：");
        System.out.println(request.getHeader("Accept"));
        //text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key+":"+value);
        }


        //请求体
        System.out.println("请求体：");
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("pwd"));

        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String key = parameterNames.nextElement();
            String[] parameterValues = request.getParameterValues(key); //允许key重复
            for(String value : parameterValues){
                System.out.print(key+": "+value+ " ");
            }
            System.out.println();
        }

        //获取远程地址、ip、端口号
        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        System.out.println(remoteAddr+", "+remoteHost+", "+remotePort);
        //获取本地
        String localAddr = request.getLocalAddr();
        System.out.println(localAddr);

    }
}
