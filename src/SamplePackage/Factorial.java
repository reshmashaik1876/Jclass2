package SamplePackage;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		while(n>0) {
			n = n%10;
			n++;
		}
		System.out.println(n);
	}
}
