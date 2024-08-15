package demo.java8.session2.ex7;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class DemoPerllelStream {
    public static void main(String[] args) {
        //Let consider adding numbers from 1 to 1_000_000

        long start=System.currentTimeMillis();

//        long counter[]=new long[] {0L};
//        
//        LongStream
//        .rangeClosed(1, 1_000_000)
//        .parallel()
//        .forEach( x ->{
//        	synchronized (counter) {
//        		counter[0]+=x;
//			}
//        });
        
        
     AtomicLong counter=new AtomicLong(0);
        
        LongStream
        .rangeClosed(1, 1_000_000)
        .parallel()
        .forEach( x ->{
        	counter.addAndGet(x);
        });
        
        //AtomicLong
        //Coucurrency: syn(passimistic lock)		optimistic lock (CAS)	AtomicInteger/AtomicLong
        
//        long counter=LongStream.rangeClosed(1, 1_000_00000)
//        		.sequential()
//        		.reduce(0, (x,y)-> x+y);

        long end=System.currentTimeMillis();

        System.out.println(counter);
        System.out.println("time taken : "+(end - start)+" ms");

    }
}



//accumlation is not the way u should use : any stream seq/|| streams
//long[] result=new long[]{0L};

//volatile vs syn vs CAS
//AtomicLong counter=new AtomicLong(0);

//LongStream.rangeClosed(1,1_000_000)
//        .parallel()
//        .forEach(new LongConsumer() {
//            @Override
//            public void accept(long i) {
//              counter.addAndGet(i);
//            }
//        });


//LongStream.rangeClosed(1,1_000_000)
//        .parallel()
//        .forEach( i-> counter.addAndGet(i));


//under the hood it is using reduction
//long result2= LongStream.rangeClosed(1,1_000_000)
//        .parallel()
//        .sum();

//same

//long result2= LongStream.rangeClosed(1,1_000_000)
//        .parallel()
//        .reduce(0, (x,y)-> x+y);

//long result3= LongStream.rangeClosed(1,1_000_000)
//        .parallel()
//        .reduce(0, Long::sum);


//long result = LongStream
//        .rangeClosed(1, 1_000_000)
//        .parallel()
//        .reduce(0, ( x,  y) ->{
//           /* try{
//                Thread.sleep(1);
//            }catch (InterruptedException e){}*/
//           return  x+y;
//        });