package SamplePackage;

import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary numer :");
		int binary = sc.nextInt();
		int temp = 0, var =0, power = 0;
		while(binary!=0) {
			temp = binary%10;
			var += temp*Math.pow(2,  power);
			binary = binary/10;
			power++;
		}
		System.out.println(var);
	}

}
