package com.thilaka.a.introduction.to.array.a.find.pivot.index;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.pivotIndex(new int[]{-2,-1,1}));


    }

    public int pivotIndex(int[] nums) {
        if (null == nums || 0 == nums.length)
            return -1;
        int inputLength = nums.length;
        int[] leftSum = new int[inputLength];
        int leftAggregate = 0;
        int[] rightSum = new int[inputLength];
        int rightAggregate = 0;
        for (int i = 0; i < inputLength; i++) {
            leftSum[i] = leftAggregate;
            leftAggregate += nums[i];
            rightSum[inputLength - 1 - i] = rightAggregate;
            rightAggregate += nums[inputLength - 1 - i];
        }
        for (int i = 0; i < inputLength; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }
        return -1;
    }
}
