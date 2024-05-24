package com.study.java_study.cho6_배열;

public class ArrayMain01 {
    public static void main(String[] args) {
        int[] nums = new int[100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        for(int num : nums) { // nums배열의 값을 하나씩 num에 저장 (index사용 x)
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
