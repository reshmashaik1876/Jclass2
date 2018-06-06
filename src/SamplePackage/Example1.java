package SamplePackage;

public class Example1 {
	public static void main(String[] args) {
	int arr[] = {1,2,3,2,3,2,5,5};
	
	for(int i =0; i<arr.length; i++) {
		int count = 0;
		for(int j = i ; j<arr.length; j++) {
				
			if(arr[i] == arr[j]) {
				count++;
			}
		}
				System.out.println(arr[i]+" repeated "+count);
		}
	}
}
