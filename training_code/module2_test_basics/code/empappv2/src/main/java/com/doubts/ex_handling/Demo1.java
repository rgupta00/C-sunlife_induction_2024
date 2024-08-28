package com.doubts.ex_handling;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * 1. why to apply proper ex hierarcy
		 */
		try {
			String line = null;
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		} catch (IOException e) {
			//
			e.printStackTrace();
		} catch (Exception e) {
			//
			e.printStackTrace();
		}
	}

}
