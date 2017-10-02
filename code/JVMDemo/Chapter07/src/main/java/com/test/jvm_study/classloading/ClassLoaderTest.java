package com.test.jvm_study.classloading;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.ref.SoftReference;

/**
 * Created by IntelliJ IDEA
 * Project: JVMDemo
 * User: DaiYan
 * Date: 2017/10/2
 */
public class ClassLoaderTest {
    private static int A=1;
    public static void main(String[] args) throws Exception{
        ClassLoader classLoader=new ClassLoader() {
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{
                    String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
                    InputStream is=getClass().getResourceAsStream(fileName);
                    if(null==is){
                        return super.loadClass(name);
                    }

                    byte[] b=new byte[is.available()];
                    is.read(b);

                    return defineClass(name,b,0,b.length);
                }catch(IOException ex){
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj=classLoader.loadClass("com.test.jvm_study.classloading.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof com.test.jvm_study.classloading.ClassLoaderTest);
    }
}
