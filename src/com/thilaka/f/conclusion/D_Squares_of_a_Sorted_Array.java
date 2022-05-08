package com.thilaka.f.conclusion;

import java.util.Arrays;

public class D_Squares_of_a_Sorted_Array {

    public int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0, numLength = nums.length; i < numLength; i++) {
            newArray[i] = nums[i] * nums[i];
        }
        return Arrays.stream(newArray).sorted().toArray();
    }

    public static void main(String[] args) {
        D_Squares_of_a_Sorted_Array c = new D_Squares_of_a_Sorted_Array();
        System.out.println(Arrays.toString(c.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    /**
     * Winning solution:
     */
    public int[] sortedSquares_1(int[] nums) {
        int start = 0, end = nums.length - 1;
        int[] squaredNums = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int startSqr = nums[start] * nums[start];
            int endSqr = nums[end] * nums[end];
            if (endSqr >= startSqr) {
                end--;
                squaredNums[i] = endSqr;
            } else {
                start++;
                squaredNums[i] = startSqr;
            }
        }
        return squaredNums;
    }

    public int[] sortedSquares_2(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int element;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                element = nums[right];
                right--;
            } else {
                element = nums[left];
                left++;
            }
            result[i] = element * element;
        }
        return result;
    }
}
