package com.exceptionhandle.programs;

public class ERR {
	public static void main(String[] args) {
		try{
			try {
				try {
					int a = 9/1;
					System.out.println(a);
				}finally {
					
				}
			}finally {
				
			}
		}finally {
			System.out.println("hello");
		}
		
	}
}
