package SamplePackage;

public class Square {
	public static void main(String[] args) {
		double x = 1;
		int n = 169;
		for(int i=0;i<n;i++){
			x = 0.5 * (x + n/x);
		}
		System.out.println(x);
	}
}
