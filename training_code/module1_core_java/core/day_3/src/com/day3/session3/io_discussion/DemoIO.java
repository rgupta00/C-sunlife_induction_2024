package com.day3.session3.io_discussion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoIO {
	public static void main(String[] args) throws IOException {
		// to copy a photo from one place to another
//		long start=System.currentTimeMillis();
//		
//		FileInputStream fs=new FileInputStream
//				(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali.jpg"));
//		FileOutputStream os=new FileOutputStream
//				(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali2.jpg"));
//		int data=0;
//		while((data=fs.read())!=-1) {
//			os.write(data);
//		}
//		long end=System.currentTimeMillis();
//		
//		System.out.println("time taken: "+(end-start)+" ms");

//		long start = System.currentTimeMillis();
//
//		BufferedInputStream fs = new BufferedInputStream(
//				new FileInputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali.jpg")));
//
//		BufferedOutputStream os = new BufferedOutputStream(
//				new FileOutputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali2.jpg")));
//		int data = 0;
//		while ((data = fs.read()) != -1) {
//			os.write(data);
//		}
//		long end = System.currentTimeMillis();
//
//		System.out.println("time taken: " + (end - start) + " ms");
		
		long start = System.currentTimeMillis();

//		 
//		BufferedInputStream fs = new BufferedInputStream(
//				new FileInputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali.jpg")));
//
//		BufferedOutputStream os = new BufferedOutputStream(
//				new FileOutputStream(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali2.jpg")));
//		int data = 0;
//		while ((data = fs.read()) != -1) {
//			os.write(data);
//		}
//		long end = System.currentTimeMillis();
//
//		System.out.println("time taken: " + (end - start) + " ms");
		
		BufferedReader br=new BufferedReader
				(new FileReader(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali.jpg")));
		
		BufferedWriter bw=new BufferedWriter
				(new FileWriter(new File("C:\\Users\\busyc\\OneDrive\\Desktop\\photo\\m_ali1.jpg")));
		int data;
		while((data=br.read())!=-1) {
			bw.write(data);
		}
		br.close();
		bw.close();
		
		System.out.println("done");

	}

}
