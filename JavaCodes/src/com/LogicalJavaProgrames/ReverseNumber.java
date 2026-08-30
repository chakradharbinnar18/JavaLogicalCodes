package com.LogicalJavaProgrames;
public class ReverseNumber {
    
    public static void main(String[] args) {

        int num = 12345;

        int reverseNum = getReverseNum(num);
        System.out.println("reverseNum : "+reverseNum);
    }

    public static int getReverseNum(int num){
        int rev = 0;

        while (num>0) {
            int rem=num%10;
            rev = rev*10 +rem;
            num = num/10;
        }

        return rev;
    }
}
