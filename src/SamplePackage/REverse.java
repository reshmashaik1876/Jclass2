package SamplePackage;

public class REverse {
	public static void main(String[] args) {
		String s = "reshma";
		if(s!=null) {
			String r[] = s.split("");
			for(int i=r.length-1;i>=0;i--) {
				System.out.print(r[i]);
			}
		}
	}

}
