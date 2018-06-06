package SamplePackage;

import java.util.Scanner;

public class Noncommon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String x = sc.nextLine();
		System.out.println("Enter String2: ");
		String y = sc.nextLine();
		String var = x+" "+y;
		String[] parts = var.split(" ");
		
		for(int i = 0; i< parts.length; i++) {
			for(int j = i+1; j<parts.length;j++) {
				if(parts[i].equals(parts[j])) {
					parts[j] = " ";
					parts[i] = " ";
				}
			}
		}
		String first = "";
		String second = "";
		for(int k = 0; k<parts.length;k++) {
			if(parts[k]!=" ") {
				
				System.out.println(parts[k]);
				if(x.contains(parts[k])) {
					first=first+parts[k];
					System.out.println("first"+parts[k]);
					
				}if(y.contains(parts[k])) {
					second=second+parts[k];
					System.out.println("second"+parts[k]);
				}
			}
			
		for(int i =0;i<first.length();i++) {
			for(int j=0;j<second.length();j++) {
				if(first.charAt(i)!=second.charAt(j)) {
					System.out.println("**********");
					System.out.print(second.charAt(j));
				}
			}
		}
			
			
		}
		
		
	}
}
