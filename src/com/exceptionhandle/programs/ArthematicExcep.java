package com.exceptionhandle.programs;

public class ArthematicExcep {
	public static void main(String[] args) {
		int a = 2;
		try {
			System.out.println("1");
			a = a/0;
			System.out.println("2");
			
		}catch(ArithmeticException ex) {
			System.out.println("Arithematic Exception: divide by zero"+ex.getMessage());
		}
		System.out.println("3");
	}
}
