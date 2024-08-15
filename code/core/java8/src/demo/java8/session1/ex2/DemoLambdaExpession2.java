package demo.java8.session1.ex2;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import static java.util.stream.Collectors.*;


public class DemoLambdaExpession2 {

 public static void printMe(String data){
	 System.out.println(data);
 }

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 540),
						new Book(121, "java advance", "gunika", 540),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));

		//find all the java books names
		//declartive code => opt is not ur job ==> jvm :)
		
		List<String> booksNames=books.stream()
				.filter(b->b.getTitle().contains("java"))
				.map(b->b.getTitle())
				.collect(toList());
		
		booksNames.forEach(title-> System.out.println(title));


	}
}
