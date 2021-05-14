package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-13 16:30
 */
public class GetSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("gbk");

        HttpSession session = request.getSession();
        String str = (String)session.getAttribute("111");

        response.getWriter().write("学习session之读数据："+str);
    }
}
