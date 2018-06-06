package SamplePackage;

import java.util.Arrays;
import java.util.Scanner;

public class AnotherDuplicate {
	 public void removeCommonCharacter(String s1, String s2){
	       
	        String commonChars = "";

	        for (int i = 0; i < s1.length(); i++) {
	            for (int j = 0; j < s2.length(); j++) {
	                if (s1.charAt(i) == s2.charAt(j)) {
	                    commonChars += s1.charAt(i);
	                }
	            }
	        }

	        for(int i = 0; i < commonChars.length(); i ++) {
	            String charToRemove = commonChars.charAt(i)+"";
	            s1 = s1.replace(charToRemove, "");
	            s2 = s2.replace(charToRemove, "");
	        }
	        System.out.println( s1);
	        System.out.println(s2);
	    }

	    public static void main(String[] args){
	        AnotherDuplicate commonCharacter = new AnotherDuplicate();
	        commonCharacter.removeCommonCharacter("a b c", "a b");
	    }
}
