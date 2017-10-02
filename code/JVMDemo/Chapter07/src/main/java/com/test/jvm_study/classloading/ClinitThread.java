package com.test.jvm_study.classloading;

import java.rmi.server.ExportException;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class ClinitThread {
    static class DeadLoopClass{
        static {//jvm保证只有一个线程进入到这块代码执行；且当次喜爱城执行完毕后，其他的线程不户籍在计入到这块执行
            if(true){
                System.out.println(Thread.currentThread()+" init DeepLoopClass");
                while(true){
                    System.out.println(Thread.currentThread());//线程总是一个
                    try{
                        Thread.sleep(1000);
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable script=new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread()+" start");
                DeadLoopClass dlc=new DeadLoopClass();
                System.out.println(Thread.currentThread()+" run over");
            }
        };

        Thread thread1=new Thread(script);
        Thread thread2=new Thread(script);
        thread1.start();
        thread2.start();
    }

}
