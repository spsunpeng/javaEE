package com.mashibing;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author sunpeng
 * @Date 2021-05-14 15:01
 */
public class ServletConfigServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();

        //获取自己单独的属性配置
        String str = servletConfig.getInitParameter("shanxi");
        System.out.println(str);

        //获取自己单独的所有属性配置
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String key = initParameterNames.nextElement();
            String value = servletConfig.getInitParameter(key);
            System.out.println(key+":"+value);
        }

        resp.getWriter().write("Study ServletConfig");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
