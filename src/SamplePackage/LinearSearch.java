package SamplePackage;

import java.time.Duration;
import java.time.Instant;

public class LinearSearch {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int x = 10;
		int y = 1;
		Instant first = Instant.now();
		for(int i = 0; i < arr.length; i++) {
			if(x==arr[i]) {
				System.out.println("matched");
			}
			
		}
		Instant second = Instant.now();
		Duration duration = Duration.between(first, second);
		System.out.println("first element: "+duration);
		
		Instant third = Instant.now();
		for(int i = 0; i < arr.length; i++) {
			if(y==arr[i]) {
				System.out.println("matched");
			}
		}
		Instant fourth = Instant.now();
		Duration duration1 = Duration.between(third, fourth);
		System.out.println("second element: "+duration1.getNano());
		
		
		//2nd approach
		long start = System.nanoTime();
		for(int i = 0; i < arr.length; i++) {
			if(x==arr[i]) {
				System.out.println("matched");
			}
			
		}
		long end = System.nanoTime();
		
		System.out.println("second approach1: "+(end-start));
	
		long start1 = System.nanoTime();
		for(int i = 0; i < arr.length; i++) {
			if(y==arr[i]) {
				System.out.println("matched");
			}
			
		}
		long end1 = System.nanoTime();
		
		System.out.println("second approach2: "+(end1-start1));
	
	}
}
