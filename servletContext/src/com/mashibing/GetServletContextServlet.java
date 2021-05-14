package com.mashibing;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author sunpeng
 * @Date 2021-05-14 8:44
 */
public class GetServletContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("gbk");

        ServletContext servletContext = this.getServletContext();

        //获取服务端设置的key-value
        String str = (String)servletContext.getAttribute("101");
        System.out.println(str);

        //获取web,xml中配置的公共属性
        String str1 = servletContext.getInitParameter("shanxi");
        System.out.println(str1);

        //获取web,xml中配置的全部公共属性
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String key = initParameterNames.nextElement();
            String value = servletContext.getInitParameter(key);
            System.out.println(key+":"+value);
        }

        //获取某个文件的绝对路径
        String path = servletContext.getRealPath("web.xml");
        System.out.println(path);  // E:\IDEAProject\java\javaEE\out\artifacts\servletContext_war_exploded\web.xml

        //获取web项目的上下文路径（资源路径）
        String path2 = servletContext.getContextPath();
        System.out.println(path2);  // /servletContext

        response.getWriter().write("servletContext学习");
    }
}
