	package SamplePackage;

import java.util.Collections;
import java.util.HashSet;

public class HashSetProgram implements Comparable<Integer>{
	public static void main(String[] args) {
		HashSet<HashProgram> h = new HashSet<HashProgram>();
		h.add(new HashProgram("Reshma","Shaik"));
		h.add(new HashProgram("Karishma","Md"));
		h.add(new HashProgram("Shama","Sd"));
		for(HashProgram i : h) {
			System.out.println(i.toString());
		}
}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
