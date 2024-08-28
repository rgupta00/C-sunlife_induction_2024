package com.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class E_ReadingAPhotoBufferSol2 {
    public static void main(String[] args) throws Exception{
        //time taken: 807 ms
        //time taken: 1 ms

        //time taken: 19 ms

        BufferedInputStream fis=new BufferedInputStream(new FileInputStream("/home/raj/Desktop/photo/god.jpeg"));
        BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("/home/raj/Desktop/photo/god.jpeg"));

        long start=System.nanoTime();
        
        int byteRead=1;
        while ((byteRead=fis.read())!=-1){
            fos.write(byteRead);
        }
        fis.close();
        fos.close();
        
        long end=System.nanoTime();
        
        System.out.println("time taken: "+ (end-start)+" ms");

    }
}
