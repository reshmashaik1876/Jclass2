package SamplePackage;

public class LCM {
	public static void main(String[] args) {
		 int x = 72, y = 120;
		 int lcm, gcd = 1;
		 for(int i = 1; i<=x&&i<=y; i++) {
			 if(x%i==0&&y%i==0) {
				 gcd = i;
			 }
		 }
		 System.out.println("GCD "+gcd);
		 lcm = (x * y)/gcd;
		 System.out.println("LCM "+lcm);
		
	}

}
