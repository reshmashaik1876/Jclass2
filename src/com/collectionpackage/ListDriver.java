package com.collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class ListDriver {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<Item>();
		list.add(new Item("Biryani",6,"Chicken"));
		list.add(new Item("Biryani",7,"Mutton"));
		//System.out.println(list.get(0).toString());
		for(Item i :list) {
			System.out.println(i.toString());
		}
		
		
	}
}
