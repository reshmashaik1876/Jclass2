package SamplePackage;

public class Palindrome {
	public static void main(String[] args) {
		int n = 124;
		int temp = 0;
		int var = 0;
		while(n>0) {
			System.out.println("Inside");
			var = n%10;
			temp = (temp+10)*var;
			n = n/10;
			
		System.out.println(temp);
		}
		
	}
}
