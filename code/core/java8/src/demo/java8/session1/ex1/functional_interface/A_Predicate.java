package demo.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class A_Predicate {
    public static void main(String[] args) {

       //What is predicate? data -> true/false
    	
    	//filter operation
    	
    	Predicate<Integer> p1= n-> n%2==0;
    	System.out.println(p1.test(110));
    	
    	Predicate<String> p2=name->name.contains("raj");
    	System.out.println(p2.test("anil"));
    	
    	BiPredicate<Integer, Integer> p3=( x,  y) ->x>y;
    	System.out.println(p3.test(2, 11));
		
		
		
    }
}
