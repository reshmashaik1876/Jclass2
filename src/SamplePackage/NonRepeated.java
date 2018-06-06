package SamplePackage;

import java.util.Scanner;

public class NonRepeated {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.next();
		
		
			StringBuilder s1 = new StringBuilder(input);
			StringBuilder s2 = new StringBuilder(input);
			String s;
			for(int i=0;i<s1.length();i++) {
				s = s1.deleteCharAt(i).toString();
				if(s.contains(Character.toString(s2.charAt(i)))) {
					s1 = new StringBuilder(s2);
				} else {
					System.out.println(Character.toString(s2.charAt(i)));
					break;
				}
		
			}
		}
	}

