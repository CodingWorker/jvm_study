package com.test.jvm_study.classloading;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class ConstClass {
    static{
        System.out.println("Const class init by static");
    }

    public static final String HELLO_WORLD="hello world";
}

class NotInitialization2{
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLO_WORLD);
    }
}
