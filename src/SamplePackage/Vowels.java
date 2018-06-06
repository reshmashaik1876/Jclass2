package SamplePackage;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		
		 System.out.println("Enter some text");
		    Scanner sc=new Scanner(System.in);
		    String input = sc.nextLine().toLowerCase();
		    char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'};
		    int[] countVowel = new int[5];
		    for (int j = 0; j < input.length(); j++) {
		        char c =input.charAt(j);
		        if(c=='a')
		            countVowel[0]++;
		        else if(c=='e')
		            countVowel[1]++;
		        else if(c=='i')
		            countVowel[2]++;
		        else if(c=='o')
		            countVowel[3]++;
		        else if(c=='u')
		            countVowel[4]++;
	}
		     for (int i = 0; i <countVowel.length; i++) {
		            System.out.println("Count of vowel " + vowel[i] + "=" + countVowel[i]);
		        }


	}
}
