package com.ioana;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[] {7, 8, 4, 3, 3, 2, 2, 1};

        List<Integer> missing = findDisappearedNumbers(nums);

        for(int i : missing) {

            System.out.println(i);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missing = new ArrayList<>();

        HashSet<Integer> numbers = new HashSet<>();

        for(int i : nums) {

            numbers.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {

            if(!numbers.contains(i)) {

                missing.add(i);
            }
        }

        return missing;
    }
}
