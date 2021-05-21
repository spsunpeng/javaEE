package com.mashibing.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author sunpeng
 * @Date 2021-05-18 8:37
 */
public class EncodeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("这是编码过滤器的init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("这是编码过滤器的执行");
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        //执行下一个过滤器(根据配置文件中过滤器的顺序)或者servlet
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("这是编码过滤器的执行完成");
    }

    @Override
    public void destroy() {
        System.out.println("这是编码过滤器的销毁");
    }
}
