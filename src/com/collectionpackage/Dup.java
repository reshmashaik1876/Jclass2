package com.collectionpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup {
	public static void main(String[] args) {
		String stringWithDuplicates = "a a a";
		char[] characters = stringWithDuplicates.toCharArray();
		Set set=new HashSet();
		String sb = "";
		String sb1 = "";
		
		for (char c : characters) {
			if (!set.contains(c)) {
			    set.add(c);
			    sb +=c;
			    
			}else {
				sb1+=c;
				//set.remove(c);
			}
			
		}
		//System.out.println("duplicates removed : " + sb.toString());
		Dup d = new Dup();
		d.remove1(sb,sb1);
		
		
	}
	public void remove1(String s1,String s2) {
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
}
