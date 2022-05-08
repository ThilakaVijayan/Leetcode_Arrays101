package com.thilaka.f.conclusion;

public class B_Third_Maximum_Number {

    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (int num : nums) {
            if (null == firstMax || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num == firstMax){
                continue;
            } else if (null == secondMax || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num == secondMax){
                continue;
            } else if (null == thirdMax || num > thirdMax) {
                thirdMax = num;
            }
        }
        if (null != thirdMax) {
            return thirdMax;
        }
        return firstMax!= null? firstMax:0;
    }

    public static void main(String[] args) {
        B_Third_Maximum_Number b = new B_Third_Maximum_Number();
        System.out.println(b.thirdMax(new int[]{2,2,3,1}));
    }
}
