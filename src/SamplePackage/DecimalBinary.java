package SamplePackage;

import java.util.Scanner;

public class DecimalBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int dec = sc.nextInt();
		int[] bin = new int[50];
		int index = 0;
		while(dec>0) {
			bin[index++] = dec%2;
			dec = dec/2;
		}
		for(int i = index-1; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
