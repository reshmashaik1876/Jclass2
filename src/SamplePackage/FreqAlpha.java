package SamplePackage;

import java.util.Scanner;

public class FreqAlpha {
		public int function(String input, String pattern) {
			int count=0 ;
			if(input.contains(input)) {
			String temp1 =input.substring(input.indexOf(pattern),input.lastIndexOf(pattern));
			if(input.indexOf(pattern)==input.lastIndexOf(pattern)) {
				count = 1;
			}else {
				count = count +1;
				function(temp1, pattern);
			}
			System.out.println(count);
			}else {
				System.out.println("no letters");
				return count;
			}
			return count;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		System.out.println("Enter pattern :");
		String pattern = sc.next();
		FreqAlpha f = new FreqAlpha();
		f.function(input, pattern);
	}
}
