package com.doubts.ex_handling;

//Ex wrapper 
class DivideByZeroException extends RuntimeException {
	private static final long serialVersionUID = -2661047216534115338L;

	public DivideByZeroException(Throwable cause) {
		super(cause);
	}
}

class Cal {
	public int divide(int a, int b) {
		int result = 0;
		try {
			result = a / b;

		} catch (ArithmeticException e) {
			throw new DivideByZeroException(e);
		}

		return result;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Cal cal = new Cal();

		try {
			int result = cal.divide(3, 0);
			System.out.println(result);
		} catch (DivideByZeroException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
