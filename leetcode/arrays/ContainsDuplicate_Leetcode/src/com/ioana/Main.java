package com.ioana;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {

            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() != 1) {

                return true;
            }
        }

        return false;
    }
}
