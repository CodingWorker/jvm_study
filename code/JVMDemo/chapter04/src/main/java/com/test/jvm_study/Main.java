package com.test.jvm_study;

import java.util.Date;

/**
 * Created by DaiYan on 2017/11/14.
 */
public class Main {
    public static void main(String[] args) {
        while(true){
            try{
                System.out.println(new Date());
                Thread.sleep(1000);
            }catch(InterruptedException ex){

            }
        }

    }
}
