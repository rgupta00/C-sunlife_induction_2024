package com.day3.session1;

interface Greet{
	public String greet();
}
class BasicGreet implements Greet{
	@Override
	public String greet() {
		return "GM";
	}	
}
class SpGreet implements Greet{
	private Greet greet;

	public SpGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "Sp " + greet.greet();
	}
}
class VerySpGreet implements Greet{
	private Greet greet;

	public VerySpGreet(Greet greet) {
		this.greet = greet;
	}

	@Override
	public String greet() {
		return "Very " + greet.greet();
	}
}
public class E_Demo_Decorator {
	
	public static void main(String[] args) {
		
		Greet greet=new VerySpGreet(new SpGreet(new BasicGreet()));
		System.out.println(greet.greet());
	}

}
