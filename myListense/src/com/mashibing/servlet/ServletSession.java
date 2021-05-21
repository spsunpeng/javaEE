package com.mashibing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-21 15:33
 */
public class ServletSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is servlet2 start ==========");

        HttpSession session = request.getSession();
        session.setAttribute("age", "25");
        session.setAttribute("age", "30");
        session.removeAttribute("age");

        System.out.println("this is servlet2 end ==============");
        response.getWriter().write("this is servlet2");
    }
}
