package SamplePackage;

import java.util.Scanner;

public class NumbertoOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = sc.nextInt();
		int temp =0, i = 0;
		int[] oct = new int[100];
		temp = x;
		while(temp!=0) {
			oct[i] = temp%8;
			temp = temp/8;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(oct[j]);
		}
	}
}
