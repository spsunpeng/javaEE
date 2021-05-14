package com.mashibing;

/**
 * @author sunpeng
 * @Date 2021-03-05 13:15
 */
public class MyServlet extends MyHttpServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) {
        response.write("get tomcat");
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {
        response.write("post tomcat");
    }
}
