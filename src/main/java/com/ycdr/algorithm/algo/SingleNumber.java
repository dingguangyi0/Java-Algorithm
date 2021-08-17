package com.ycdr.algorithm.algo;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    // 2 2 1
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int t = 0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]==nums[j]&&j!=i) {
                    t++;
                }
            }
            if (t==0) {
                return nums[i];
            }
        }
        return -1;
    }
    // 2 2 1
    public int singleNumber1(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue()==1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    // 2 2 1
    public int singleNumber2(int[] nums) {
        int ans = 0;
        for(int num: nums) {
            ans ^= num;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] n=new int[]{2,2,1,3};
        SingleNumber number =new SingleNumber();
        System.out.println(number.singleNumber(n));
        System.out.println(number.singleNumber1(n));
        System.out.println(number.singleNumber2(n));
    }
}
