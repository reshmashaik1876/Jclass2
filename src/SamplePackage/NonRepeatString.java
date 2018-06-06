package SamplePackage;

import java.util.Scanner;

public class NonRepeatString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String x = sc.nextLine();
		String[] parts = x.split(" ");
		for(int i = 0; i  < parts.length; i++) {
			for(int j = i+1; j < parts.length-1; j++) {
				System.out.println("j loop");
				if(parts[i].equals(parts[j])) {
					System.out.println("entered");
					parts[j] = null;
					parts[i] = null;
				}
			}
		}
		String val="";
		for(int i = 0; i < parts.length; i++) {
			if(parts[i]!=null) {
				val = val+" "+parts[i];
				System.out.print(parts[i]+" ");
			}
		}
		String fin = val.trim();
		String[] tem = fin.split(" ");
		System.out.println("final :"+tem[0]);
//		String[] f = val.split(" ");
//		System.out.println("final value is: "+f[0]);
		
		
	}
}
