package com.test.jvm_study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiYan on 2017/11/14.
 */
public class FillHeapDemo {
    static class OOMObject{
        public byte[] placeholder=new byte[64*1024];
    }

    public static void fillHeap(int num)throws InterruptedException{
        List<OOMObject> list=new ArrayList<OOMObject>();
        for(int i=0;i<num;i++){
            Thread.sleep(500);
            list.add(new OOMObject());
        }

        System.gc();
    }

    public static void main(String[] args) throws Exception{
        fillHeap(1000);
    }
}


