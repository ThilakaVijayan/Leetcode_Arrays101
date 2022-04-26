package com.thilaka.introduction;

public class A_Max_Consecutive_Ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxCounter = 0;
        // for (int a : nums) {//- 38.60% rating in runtime and 36.75% rating in memory - 1
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) { //85.35% rating in runtime and 88.45% rating in memory - 1
            if (nums[i] == 1) {
                counter++;// - 2
                //maxCounter = Math.max(maxCounter, ++counter); //85.35% rating in runtime and 88.45% rating in memory - 2

            } else {
                maxCounter = Math.max(maxCounter, counter);//100% rating in runtime and 81.71% rating in memory - 2
                counter = 0;
            }
        }
        maxCounter = Math.max(maxCounter, counter);// - 2
        return maxCounter;
    }

    public static void main(String[] args) {
        A_Max_Consecutive_Ones a = new A_Max_Consecutive_Ones();
        System.out.println(a.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    /**
     * NOTE: There is no proof that for performance is better than foreach.
     * But in this exercise, it just happened to perform better. Also the number above are arbitrary,
     * it changes in every run.
     */
}
