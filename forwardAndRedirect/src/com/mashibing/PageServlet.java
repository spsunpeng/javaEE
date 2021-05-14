package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author sunpeng
 * @Date 2021-05-11 8:18
 */
public class PageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式（解决中文乱码问题）
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("gbk");

        System.out.println("接受到客户端的请求，返回响应的登录页面");
        String loginFalseKey = req.getAttribute("loginFalseKey") == null ? "" : (String)req.getAttribute("loginFalseKey");

        //设置响应编码
        resp.setContentType("text/html");
        //获取响应的输出流对象
        PrintWriter out = resp.getWriter();
        out.write("<html>");
        out.write("<head>");
        out.write("</head>");
        out.write("<body>");
        out.write("<font color='red' size='20px'>"+loginFalseKey+"</font>");
        out.write("<form action='login' method='get'>");
        out.write("name:<input type='text' name='name' value='' ><br/>");
        out.write("pwd:<input type='text' name='pwd' value=''><br/>");
        out.write("<input type='submit' value='login'>");
        out.write("</form>");
        out.write("</body>");
        out.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is POST");
        this.doGet(req, resp);
    }
}
