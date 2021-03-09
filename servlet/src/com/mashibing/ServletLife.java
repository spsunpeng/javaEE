package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-03-09 16:15
 */

/*
生命周期：从第一次请求开始被创建，直到程序结束
当在web.xml文件中配置了<load-on-startup>1</load-on-startup>,在开启tomcat的时候就会创建servlet对象，中间的数值表示优先级的意思
 */
public class ServletLife extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("servlet life");
        System.out.println("servlet life");
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}
