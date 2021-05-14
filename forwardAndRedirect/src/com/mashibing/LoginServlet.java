package com.mashibing;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-11 8:25
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是登录");

        if(req.getParameter("pwd").equals("610527")){
/*            //(请求)转发，请求的方法，服务器返将请求转发到另一个。
            req.getRequestDispatcher("hello").forward(req, resp);*/

            HttpSession session = req.getSession();
            session.setAttribute("name", req.getParameter("name"));
            //(返回)重定向，返回的方法，服务器将重定向的地址返回给前端，让前端去访问
            resp.sendRedirect("hello");
        }else{
            //请求转发
            //请求转发间传递其他字段
            req.setAttribute("loginFalseKey", "账户和密码不匹配");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("page");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
