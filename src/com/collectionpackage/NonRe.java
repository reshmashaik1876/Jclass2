package com.collectionpackage;

public class NonRe {
	private String name;
	
public NonRe(String name) {
		super();
		this.name = name;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public static void main(String[] args) {
	final NonRe st = new NonRe("res");
	System.out.println(st.getName());
	st.setName("REshma");
	System.out.println(st.getName());
	st.setName("abhi");
	System.out.println(st.getName());
	NonRe hk = new NonRe("Hello");
	
}
}