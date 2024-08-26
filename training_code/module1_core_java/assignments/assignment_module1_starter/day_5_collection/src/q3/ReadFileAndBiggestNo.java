package q3;
import java.util.*;

import q2.Book;

import java.io.*;
public class ReadFileAndBiggestNo {

	public static void main(String[] args) {
		//read file and make a list of double nos
		List<Double> doubles=readAndGetList();
		
		//revese sorting: we want biggest no
		Collections.sort(doubles, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(doubles.get(0));
		
	}

	private static List<Double> readAndGetList() {
		//TODO : read the file nos.txt and covert into Double add to list and return
		return null;
	}
}
