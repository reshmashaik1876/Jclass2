package SamplePackage;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bsort = new int[] {5, 2, 4, 1, 6};
		int n = bsort.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (bsort[j] > bsort[j+1])
                {
                    int temp = bsort[j];
                    bsort[j] = bsort[j+1];
                    bsort[j+1] = temp;
                }
		for(int i = 0; i < n; i++) {
			System.out.println(bsort[i]);
		}
	}
}
