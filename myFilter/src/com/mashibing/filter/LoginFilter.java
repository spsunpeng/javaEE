package com.mashibing.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-18 8:45
 */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("这是登录过滤器的init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这是登录过滤器的执行");
        if(servletRequest.getAttribute("user") == null){
            servletResponse.getWriter().write("没有登录");
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
        System.out.println("这是登录过滤器的执行完成");
    }

    @Override
    public void destroy() {
        System.out.println("这是登录过滤器的销毁");
    }
}
