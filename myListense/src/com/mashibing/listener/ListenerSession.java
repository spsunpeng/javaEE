package com.mashibing.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author sunpeng
 * @Date 2021-05-21 15:57
 */
public class ListenerSession implements HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("Session作用域中数据添加");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("Session作用域中数据删除");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("Session作用域中数据修改");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session删除");
    }
}
