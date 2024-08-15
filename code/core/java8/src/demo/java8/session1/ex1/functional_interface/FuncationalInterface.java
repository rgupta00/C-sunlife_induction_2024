package demo.java8.session1.ex1.functional_interface;

public class FuncationalInterface {
	
	public static void main(String[] args) {
		Runnable runnable=()-> System.out.println("it is job of threads");
			
		//passing a lamabda in a method call => higher order funcation
		Thread t=new Thread(()-> System.out.println("it is job of threads"));

		//declaritive data processing collection -> stream
	}
	
	

}
