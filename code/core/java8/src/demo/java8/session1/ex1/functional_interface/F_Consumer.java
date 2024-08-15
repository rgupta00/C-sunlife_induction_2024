package demo.java8.session1.ex1.functional_interface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class F_Consumer {
    public static void main(String[] args) {
    
    	
//    	Consumer<String>c1=name-> System.out.println(name);
//    	c1.accept("amit");
    	
    
        Map<Integer, String>s=new HashMap<>();
        s.put(1,"raj");
        s.put(4,"sumit");
        s.put(13,"kapil");

       s.forEach((k, v)-> System.out.println(k+": "+ v));



    }
}
