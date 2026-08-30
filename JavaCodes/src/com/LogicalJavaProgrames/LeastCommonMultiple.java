package com.LogicalJavaProgrames;

public class LeastCommonMultiple {
	
	public static void main(String[] args) {
		  int a = 12;
	      int b = 18;
	      
	      int x = a;
	      int y=b;
	      
	      while(y !=0) {
	    	  int rem = x%y;
	    	  x=y;
	    	  y=rem;
	      }
	      //GCD = Greatest Common Divisor
	      int GCD = x;
	      
	      int LCM = (a*b)/GCD;
	      
	      System.out.println("LCM : "+LCM);
	      
	}

}
