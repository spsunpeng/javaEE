package com.mashibing.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author sunpeng
 * @Date 2021-05-21 15:35
 */
public class ListenerRequest implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request对象被销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request对象被创建");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String key = srae.getName();
        Object value = srae.getValue();
        Object source = srae.getSource();
        System.out.println("request作用域中添加数据："+"key="+key+", "+"value="+value+", "+"source="+source);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String key = srae.getName();
        Object value = srae.getValue();
        Object source = srae.getSource();
        System.out.println("request作用域中删除数据："+"key="+key+", "+"value="+value+", "+"source="+source);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String key = srae.getName();
        Object value = srae.getValue(); //修改前原有的值
        Object source = srae.getSource();
        System.out.println("request作用域中修改数据："+"key="+key+", "+"value="+value+", "+"source="+source);
    }

}
