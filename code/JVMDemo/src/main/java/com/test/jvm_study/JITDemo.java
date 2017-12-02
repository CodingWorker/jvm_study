package com.test.jvm_study;

/**
 * Created by DaiYan on 2017/12/2.
 */
public class JITDemo {
    public static void main(String[] args) {
        //只使用jit：-Xcomp，比较选择最优的
        //只使用解释执行：-Xint
        //让vm根据运行状态决定：-Xmixed
        String init="";
        long start= System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            init+=(char)(i/127);
        }
        long end= System.currentTimeMillis();

        System.out.println((end-start));
    }
}
