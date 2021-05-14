package com.mashibing;

import java.util.HashMap;

/**
 * @author sunpeng
 * @Date 2021-03-05 11:07
 */
public class MyMapping {

    private static HashMap<String, String> mapping = new HashMap<>();

    static {
        mapping.put("/mytomcat", "com.mashibing.MyServlet");
    }

    public HashMap<String, String> getMapping() {
        return mapping;
    }

}
