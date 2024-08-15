package demo.java8.session2.ex7;

import java.util.stream.LongStream;

public class SequenceStreams {
	
	public static void main(String[] args) {
		LongStream.rangeClosed(1, 100)
		.parallel()
		.forEach(i-> {
			System.out.print(i+": ");
			System.out.println(Thread.currentThread().getName());
		});
	}

}
