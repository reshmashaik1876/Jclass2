package com.collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Comparable<Bank>{
	private String firstname;
	private String secondname;
	
	public Bank(String firstname, String secondname) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
	}
	

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getSecondname() {
		return secondname;
	}


	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	
	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		if(getFirstname().equals(o.getFirstname()))
	    {
	        return 0;
	    }
	    else if(getFirstname()!=getFirstname())
	    {
	        return -1;
	    }
	    else
	    {
	        return 1;
	    }
	}
	public static void main(String[] args) {
		Bank b = new Bank("reshma", "shaik");
		Bank b1 = new Bank("Asha","Shaik");
		List<Bank> list = new ArrayList<Bank>();
		list.add(b);
		list.add(b1);
		System.out.println(b.getFirstname().compareTo(b1.firstname));
//        for(Bank b4 : list) {
//        System.out.println(b4.getFirstname()); 
//	}


	}	
}
