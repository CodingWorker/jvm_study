package com.test.jvm_study;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiYan on 2017/12/2.
 */
public class XDemo {
    private static List<String> strList=new ArrayList<String>(100);
    public static void main(String[] args) {
        //-Xms 设置初始堆的大小，也是最小堆的大小
        //-Xmx 设置最大堆的大小

        //-Xx:PermSize 设置永久区的初始大小
        //-XX:MaxPermSize 设置永久区的最大值

        //-Xss 设置线程栈的大小，影响到递归调用的深度和同时开启的线程的数量
//        String init="this is a number";
//        for(int i=0;i<1000;i++){
//            init+=i+", ";
//            String str= new String(init);
//            strList.add(str);
//        }
        int a=1;
        int b=1;
        System.out.print(a+", ");
        System.out.print(b+", ");
        outPut(1,1);
    }

    private static void outPut(int a,int b){
        if(b<1000){
            int c=a+b;
            System.out.print(c+", ");
            outPut(b,c);
        }
    }

}
