package com.day3.session1;

class FinallyEx extends RuntimeException {
}

class TryEx extends RuntimeException {
}

public class F_Ex_Suppresed {
	public static void main(String[] args) {
		try {
			foo();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void foo() {
		Exception t = null;
		try {
			throw new TryEx();
		} catch (Exception ex) {
			t = ex;
		} finally {
			FinallyEx e = new FinallyEx();
			if (t != null) {
				e.addSuppressed(t);
			}
			throw e;
		}
	}
}
