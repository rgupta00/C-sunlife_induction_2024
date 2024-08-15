package demo.java8.session1.ex0;

import java.util.stream.LongStream;

//calculating prime no bw 1 to 1_000_00
class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class MotivationJava8 {
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		
		long start=System.currentTimeMillis();

		long counter=LongStream
				.rangeClosed(1, 1_000_00)
				.parallel()
				.filter(Prime::isPrime)
				.count();
	
		
		long end=System.currentTimeMillis();
		
		System.out.println("counter: "+ counter);
		System.out.println("time taken: "+ (end-start)+" ms");








		//Fork and join framework

		//Thread pool
		//


		/*
		 *
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8

		 */
	}

}
