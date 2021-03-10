package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        System.out.println(request.getMethod());
        System.out.println(request.getRequestURL());
        System.out.println(request.getRequestURI());
        System.out.println(request.getScheme());

        //请求头
        System.out.println("请求头：");
        System.out.println(request.getHeader("Accept"));

        //请求体
        System.out.println("请求体：");
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("pwd"));
    }
}
