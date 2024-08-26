package q1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintWordsWithTheFrequncyUsingMap {

	public static void main(String[] args) {
		//1. will create a set
		Map<String, Integer> words=new TreeMap<>();
	
		//TODO 2. Write logic to get token of each line and then put token to set
		//(set only allow unique data)
	
		//3. print the set
		 Set<Entry<String, Integer>> entrySet = words.entrySet();
		 for(Entry<String, Integer> entry: entrySet) {
			 System.out.println(entry.getKey() + " : "+ entry.getValue());
		 }
		
	}
}
