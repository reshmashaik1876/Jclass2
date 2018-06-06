package SamplePackage;

import java.util.Scanner;

public class Duplicates {
	public static void main(String[] args) {
		int[] x = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String x1 = sc.nextLine();
		String[] parts = x1.split(" ");
		for(int i = 0; i  < parts.length; i++) {
			for(int j = i+1; j < parts.length-1; j++) {
				System.out.println("j loop");
				if(parts[i].equals(parts[j])) {
					System.out.println("entered");
					parts[j] = "";
					parts[i]= "";
				}
			}
		}
		for(int i = 0; i < parts.length; i++) {
			if(parts[i]!="")
			System.out.print(parts[i]+" ");
		}
	}
}
