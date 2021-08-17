package com.ycdr.algorithm.algo;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        int key=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()>max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    /**
     * 摩尔投票法思路
     * 候选人(cand_num)初始化为nums[0]，票数count初始化为1。
     * 当遇到与cand_num相同的数，则票数count = count + 1，
     * 否则票数count = count - 1。 当票数count为0时，更换候选人，
     * 并将票数count重置为1。 遍历完数组后，cand_num即为最终答案。
     * @param nums
     * @return
     */
    public int majorityElement2(int[] nums) {
        int votes = nums[0];
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (votes==nums[i]&&ans!=0){
                ans+=1;
            }else {
                if (ans==0){
                    votes=nums[i];
                    ans=1;
                } else {
                    ans-=1;
                }
            }
        }
        return votes;
    }

    public static void main(String[] args) {
        MajorityElement element = new MajorityElement();
        int[] i = new int[]{3,2,3};
        System.out.println(element.majorityElement(i));
        System.out.println(element.majorityElement2(i));
    }
}
