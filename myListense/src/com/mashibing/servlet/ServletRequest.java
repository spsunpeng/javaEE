package com.mashibing.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-21 15:18
 */
public class ServletRequest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is servlet1 start ==========");

        request.setAttribute("name", "sunpeng");
        request.setAttribute("name", "sunyue");
        request.removeAttribute("name");

        System.out.println("this is servlet1 end ==============");
        response.getWriter().write("this is servlet1");
    }
}
