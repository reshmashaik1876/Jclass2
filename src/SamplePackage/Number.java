package SamplePackage;

public class Number {
	static int result = 0;
	int objectSum = 0;
	public static void sum(int a, int b) {
		result = a + b;
		System.out.println("Static method: "+result);
		
	}
	public void objectSum(int a, int b) {
		objectSum = a + b;
		result = a + b;
		System.out.println("Static: "+result);
		System.out.println("Result: "+objectSum);
	}
}
