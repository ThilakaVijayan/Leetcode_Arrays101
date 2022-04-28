package com.thilaka.introduction;

public class B_Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int numOfEvenDigit = 0;
        for (int num : nums) {
            //if (String.valueOf(num).length() % 2 == 0) { // 51.78% rating in runtim and 890.58% rating in memory.
            if(findDigits(num) % 2 == 0){// 99.03% rating in runtime and 23.35% rating in memory
                numOfEvenDigit++;
            }
        }
        return numOfEvenDigit;
    }

    private int findDigits(int num){
        int counter = 1;
        num /= 10;
        while(num > 0){
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        B_Find_Numbers_with_Even_Number_of_Digits b = new B_Find_Numbers_with_Even_Number_of_Digits();
        System.out.println(b.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    //Winning solution: NOTE: read the question and the contraints properly and take advantage of it.
    // Don't always design a solution of fits all.
    //min number is 1 and max number is 100000
    public int findNumbers_1(int[] nums){
        int numOfEvenDigit = 0;
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            int num = nums[i];
            if (num == 100000) {
                numOfEvenDigit++;
            } else if (999 < num && num < 10000) {
                numOfEvenDigit++;
            } else if (9 < num && num < 100) {
                numOfEvenDigit++;
            }
        }
        return numOfEvenDigit;
    }
}
