package com.collectionpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String stringWithDuplicates = "a b c a b";
		char[] characters = stringWithDuplicates.toCharArray();
		Set set=new HashSet();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();
		
		for (char c : characters) {
			if (!set.contains(c)) {
			    set.add(c);
			    sb.append(c);
			    
			}else {
				sb1.append(c);
				//set.remove(c);
			}
			
		}
		System.out.println(sb);
		System.out.println(sb1);
		
	
	}
}
