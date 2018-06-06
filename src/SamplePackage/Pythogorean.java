package SamplePackage;

import java.util.Scanner;

public class Pythogorean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		if(a>0&&b>0&&c>0) {
		int x = (int) Math.pow(a, 2);
		int y = (int) Math.pow(b, 2);
		int z = (int) Math.pow(c, 2);
		if(x==(y+z)||y==(x+z)||z==(x+y)) {
			System.out.println("True");
		}else {
			System.out.println("False");
			}
		}
	}
}
