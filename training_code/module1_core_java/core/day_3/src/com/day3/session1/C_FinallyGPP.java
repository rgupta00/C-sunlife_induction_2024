package com.day3.session1;


class AEx extends RuntimeException{}
class BEx extends RuntimeException{}
public class C_FinallyGPP {

	public static void main(String[] args) {
		try{
			foo();
		}catch(Exception e) {
			System.out.println(e.getClass());
		}
		
	}

	private static int foo() {
		try {
			if(1==1)
				throw new AEx();
		}finally {
			throw new BEx();
		}
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int c=foo();
//		System.out.println(c);
//	}
//
//	private static int foo() {
//		try {
//			if(1==1)
//				return 2;
//		}finally {
//			return 3;
//		}
	}
}
