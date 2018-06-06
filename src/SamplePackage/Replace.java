package SamplePackage;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		System.out.println("1"=="1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String val = sc.nextLine();
		//String parts[] = val.split("");
		for(int i =0;i<val.length();i++) {
			//System.out.println(parts[i]);
			switch(val.charAt(i)) {
			case '1':
			val=val.replace("1", "one");
			}
			}
		System.out.println(val);
		}
		
	}

