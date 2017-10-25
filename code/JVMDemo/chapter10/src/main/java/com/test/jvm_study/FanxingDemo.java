package com.test.jvm_study;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/26
 */
public class FanxingDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("a","aa");
        map.put("b","bb");
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
    }
}
