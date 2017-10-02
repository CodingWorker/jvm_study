package com.test.jvm_study.classloading;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class FieldResolution {
    interface interface0{
        int A=0;
    }

    interface interface1 extends interface0{
        int A=1;
    }

    interface interface2{
        int A=1;
    }

    static class Parent implements interface1{
        public static int A=3;
    }

    static class Sub extends Parent implements interface2{
//        public static int A=4;
    }

    public static void main(String[] args) {
        //System.out.println(Sub.A);//ambigures
    }
}
