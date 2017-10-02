package com.test.jvm_study.running;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class ReuseSlot {
    public static void main(String[] args) {
//        byte[] bytes=new byte[64*1024*1024];
        {
            byte[] bytes=new byte[64*1024*1024];
        }
        int a=0;
        System.gc();
    }
}
