package com.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class B_ReadingAPhoto {
    public static void main(String[] args) throws Exception{
        //time taken: 807 ms
        FileInputStream fis=new FileInputStream("/home/raj/Desktop/photo/god.jpeg");
        FileOutputStream fos=new FileOutputStream("/home/raj/Desktop/photo/god.jpeg");

        long start=System.nanoTime();

        int byteRead=1;
        while ((byteRead=fis.read())!=-1){
            fos.write(byteRead);
        }
        fis.close();
        fos.close();
        long end=System.nanoTime();
        System.out.println("time taken: "+ (end-start)+" ns");

    }
}
