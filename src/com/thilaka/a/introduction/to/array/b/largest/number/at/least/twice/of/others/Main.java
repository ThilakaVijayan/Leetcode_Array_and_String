package com.thilaka.a.introduction.to.array.b.largest.number.at.least.twice.of.others;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.dominantIndex(new int[]{3,6,1,0}));
    }

    public int dominantIndex(int[] nums) {
        int maxNum = -1;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[i] * 2 > maxNum)
                return -1;
        }
        return maxIndex;
    }
}
