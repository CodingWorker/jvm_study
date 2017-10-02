package com.test.jvm_study.classloading;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class ClInitTest {
    static class Parent{
        public static int A=1;
        static{
            A=2;
        }
    }

    static class SubClass extends Parent{
        public static int B=A;
    }

    public static void main(String[] args) {
        System.out.println(SubClass.B);//2
    }
}
