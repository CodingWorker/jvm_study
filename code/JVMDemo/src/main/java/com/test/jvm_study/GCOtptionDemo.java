package com.test.jvm_study;

/**
 * Created by DaiYan on 2017/12/2.
 */
public class GCOtptionDemo {
    //-XX:+UseParallelOldGC 表示新生代和老生代都使用并行收集器
    //-XX:+UseSerialGC使用串行回收器
    //-XX:ParallelGCThreads=n 表示配置多少线程来回收垃圾
    //-XX:UseAdaptiveSizePolicy 表示开启自适用策略
    //-XX:+DisableExplicitGC 禁止显示的调用GC
    //-XX:+PrintGC 打印简化的GC日志
    //-XX:+PrintGCDetails 打印详细的GC日志
    public static void main(String[] args) {
        String init="";
        for(int i=0;i<1000;i++){
            init+=(char)(i%127);
            init+=init;
            new String(init);
        }
        System.gc();
        System.out.println("hello world");
    }
}
