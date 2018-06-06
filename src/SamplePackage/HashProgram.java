package SamplePackage;

import java.util.Comparator;
import java.util.HashSet;

public class HashProgram implements Comparator<HashProgram> {
	private String firstname;
	private String lastname;
	
	public HashProgram() {
		super();
	}
	public HashProgram(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "HashProgram [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	@Override
	public int compare(HashProgram h, HashProgram h1) {
		return h.getFirstname().compareTo(h1.getFirstname());
	}
	
	
	
}
