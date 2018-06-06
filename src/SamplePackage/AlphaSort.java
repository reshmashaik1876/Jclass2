package SamplePackage;

import java.util.Scanner;

public class AlphaSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();

		char[] chars = input.toCharArray();

		  for (int i = 0; i <chars.length; i++) {
			  for ( int j = 0; j < chars.length; j++) {
				  if(chars[j]>chars[i]){
					  char temp = chars[i];
					  chars[i]=chars[j];
					  chars[j]=temp;

		       }

		   }  

		}

		 for(int k=0;k<chars.length;k++){

		System.out.println(chars[k]);
	}
		 sc.close();
	}

}
