package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-06 17:38
 */
public class ServletResponse extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is get");

        //相同key，后面的会覆盖
        resp.setHeader("name", "sunpeng");
        resp.setHeader("name", "sunyue");
        //key可以重复
        resp.addHeader("like", "nv");
        resp.addHeader("like", "neinv");

        //响应体和响应体的格式
        resp.setHeader("Content-Type","text/plain");
        //resp.sendError(404, "not found");
        resp.getWriter().write("<b>java is easy</b>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is post");
        this.doGet(req, resp);
    }
}
