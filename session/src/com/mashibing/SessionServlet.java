package com.mashibing;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-13 16:18
 */
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("gbk");

        HttpSession session = request.getSession();
        System.out.println(session.getId());
        //生成的session：Set-Cookie: JSESSIONID=00134762B4551AFC08FC4ECFFF56CD17; Path=/session; HttpOnly
        session.setAttribute("111", "sunpeng");

        response.getWriter().write("学习session之写入数据");
    }
}
