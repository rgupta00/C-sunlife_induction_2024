package com.day5.ex2.set_examples;

import java.io.*;
import java.util.*;

public class D_PrintingAllUniqueWords {
	public static void main(String[] args) {
		/*
		 * 1. open and read the fill till it not finished 2. make token of each line 3.
		 * put tokens into TreeSet ( dont allow duplicate) 4. print it
		 */

		Set<String> set = new TreeSet<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("story.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					set.add(token.toLowerCase());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//just want to print it
		for(String val: set) {
			System.out.println(val);
		}

	}

}
