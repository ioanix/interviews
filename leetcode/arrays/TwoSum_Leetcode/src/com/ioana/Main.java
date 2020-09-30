package com.ioana;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 13, 7, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {

            myMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {

            int complement = target - nums[i];

            if (myMap.containsKey(complement) && myMap.get(complement) != i) {

                return new int[]{i, myMap.get(complement)};
            }

        }

        throw new IllegalArgumentException("no two sum");
    }
}
