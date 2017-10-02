package com.test.jvm_study.classloading;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.internal.dynalink.beans.StaticClass;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class Test {
    static{
        i=1;//定义在之后的静态变量可以赋值
        //System.out.println(i);//但是不能访问
    }

    private static int i=0;

    public static void main(String[] args) {

    }
}
