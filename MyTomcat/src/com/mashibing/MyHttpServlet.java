package com.mashibing;

/**
 * @author sunpeng
 * @Date 2021-03-05 11:24
 */
public abstract class MyHttpServlet {

    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";

    public abstract void doGet(MyRequest request, MyResponse response);
    public abstract void doPost(MyRequest request, MyResponse response);

    public void service(MyRequest request, MyResponse response){
        if(METHOD_GET.equals(request.getMethod())){
            doGet(request, response);
        }else if(METHOD_POST.equals(request.getMethod())){
            doPost(request, response);
        }
    }
}
