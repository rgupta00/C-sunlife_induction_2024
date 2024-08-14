package com.day3.session1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_ExHandingEx {
	
	public static void main(String[] args) {
//		Scanner scanner=null;
//		try {
//			int i,j,k;
//			 scanner=new Scanner(System.in);
//			i=scanner.nextInt();
//			j=scanner.nextInt();
//			
//			k=i/j;
//			System.out.println("k : "+k);
//			scanner.close();
//		}catch(ArithmeticException ex) {
//			System.out.println("dont divide by zero");
//			scanner.close();
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("InputMismatchException");
//			scanner.close();
//		}
//		catch(Exception ex) {
//			System.out.println("some other problem");
//			scanner.close();
//		}
		
	//	System.out.println("done");
		
		
		//Need of finally: cleanup code
		
//		Scanner scanner=null;
//		try {
//			int i,j,k;
//			 scanner=new Scanner(System.in);
//			i=scanner.nextInt();
//			j=scanner.nextInt();
//			
//			k=i/j;
//			System.out.println("k : "+k);
//			
//		}catch(ArithmeticException ex) {
//			System.out.println("dont divide by zero");
//			
//		}
//		catch(InputMismatchException ex) {
//			System.out.println("InputMismatchException");
//			
//		}
//		catch(Exception ex) {
//			System.out.println("some other problem");
//			
//		}finally {
//			scanner.close();
//		}
//		
		//java 7: ARM automatic res mgt: Authclosable*
	
		try(Scanner scanner=new Scanner(System.in)) {
			int i,j,k;
		
			i=scanner.nextInt();
			j=scanner.nextInt();
			
			k=i/j;
			System.out.println("k : "+k);
			
		}catch(ArithmeticException ex) {
			System.out.println("dont divide by zero");
			
		}
		catch(InputMismatchException ex) {
			System.out.println("InputMismatchException");
			
		}
		catch(Exception ex) {
			System.out.println("some other problem");
			
		}finally {
			
		}
		
		
	}

}












