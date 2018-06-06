package SamplePackage;

public class PrimeNumber {
	public static void main(String[] args) {
	int i,j=0,count=0;      
	  int n=6;
	  j=n/2;      
	  if(n==0||n==1){  
	   System.out.println("It is not a prime number");      
	  }else{  
	   for(i=2;i<=j;i++){      
	    if(n%i==0){      
	     System.out.println("It is not prime number");      
	       count++;   
	    }      
	   }      
	   if(count==0)  {
		   System.out.println(n+" is prime number"); }  
	  } 
}
}
