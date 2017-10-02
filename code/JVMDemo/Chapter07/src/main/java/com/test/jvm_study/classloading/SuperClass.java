package com.test.jvm_study.classloading;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
//VM Args: -XX:+TraceClassLoading
public class SuperClass {
    static{
        System.out.println("Super class init by static");
    }

    public static int value=123;
}

class SubClass extends SuperClass{
    static {
        System.out.println("Sub class init by static");
    }
}
class NotInitialization{
    public static void main(String[] args) {
        //System.out.println(SubClass.value);
        SuperClass[] sc=new SuperClass[10];
    }
}
