package com.thilaka.f.conclusion;

import java.util.Arrays;

public class A_Height_Checker {
    public int heightChecker(int[] heights) {
        int[] expectedArr = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expectedArr[i]=heights[i];
        }
        Arrays.sort(expectedArr);
        int count = 0;
        for(int i=0;i<heights.length;i++){
            if(expectedArr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        A_Height_Checker a = new A_Height_Checker();
        System.out.println(a.winning_sol(new int[]{1,1,4,2,1,3}));

    }

    /**
     * Here we can take advantage of the fact that, the input set is very limited, only up till 100 numbers.
     * so, instead we can have a frequency array
     * noting down the number of occurrence of any number.
     */

    public int winning_sol(int[] heights) {
        int[] freq = new int[101];
        for (int i = 0; i < heights.length; i++) {
            freq[heights[i]]++;
        }

        int j = 0;
        int mismatchCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0)
                continue;
            int count = freq[i];
            for (int counter = 0; counter < count; counter++, j++) {
                if (heights[j] != i) {
                    mismatchCount++;
                }
            }
        }
        return mismatchCount;
    }
}
