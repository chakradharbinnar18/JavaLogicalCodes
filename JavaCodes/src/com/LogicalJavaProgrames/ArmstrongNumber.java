package com.LogicalJavaProgrames;

import java.util.Iterator;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num = 1634;
		
		int numLength = Integer.toString(num).length();
		
		Integer armstrongNum = getArmstrongNum(num, numLength);
		
		if (armstrongNum==num) {
			System.out.println(num + "is armstrong num");
		}else {
			System.out.println(num + "is not armstrong num");
		}

	}
	
	public static Integer getArmstrongNum(int num, int numLength) {
		
		int armstrongNum=0;
		
		for (int i = 1; i <= numLength; i++) {

			int multiplication=1;
			int rem=num%10;
			
			for(int j=1; j<=numLength; j++) {
				multiplication = multiplication*rem;
			}
			num = num/10;
			armstrongNum = armstrongNum+multiplication;
			
		}
		return armstrongNum;
		
	}


}
