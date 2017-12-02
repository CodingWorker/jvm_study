package com.test.jvm_study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiYan on 2017/12/2.
 */
public class HeapDemo {
    //-XX:NewSize 设置新生代的初始大小
    //-XX:MaxNewSize 设置新生代的最大大小
    //-XX:NewRatio 设置新生代与老生代的比例大小，从而能够
    // 随着heap的变化而动态变化
    //-XX:SurviorRatio 设置新生代中Eden和Survior的比例

    //-XX:+PrintTenuringDistribution 使得每次Minor GC时打印
    //Survior的空间分布
    //-XX:InitialTenuringThreshold 设置对象被移到老年代的年龄阈值初始值
    //-XX:MaxTenuringThreshold  设置对象被移到老年代的年龄阈值的最大值
    //-TargetSurvivorRatio Minor GC结束了Survior区域中占用空间的期望比例

    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>(10000);
        String a="a";
        String b="b";
        String init="";
        System.out.println("start");
        for(int i=0;i<10000;i++){
            init+=i+", ";
            String str=i+"";
            new String("hello");
            stringList.add(new String(init));
        }
        System.out.println("end");
    }
}
