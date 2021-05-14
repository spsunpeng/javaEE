package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-13 11:19
 */
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("gbk");

        Cookie cookie1 = new Cookie("001", "beijing");
        Cookie cookie2 = new Cookie("002", "xian");
        cookie2.setPath("/cookie/getCookie");
        cookie2.setMaxAge(7*24*3600);

        response.addCookie(cookie1);
        response.addCookie(cookie2);

        response.getWriter().write("学习cookie");
    }
}
