package SamplePackage;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		String[] parts = input.split(" ");
		for(int i =0; i<parts.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
