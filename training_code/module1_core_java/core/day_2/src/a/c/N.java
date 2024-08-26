package a.c;

import a.b.*;

public class N extends A{

	public static void main(String[] args) {
		A a=new A();
//		System.out.println(a.i);
//		System.out.println(a.j);
//		System.out.println(a.k);

		N n=new N();
		System.out.println(n.k);
		n.fooProtected();
	}
}
