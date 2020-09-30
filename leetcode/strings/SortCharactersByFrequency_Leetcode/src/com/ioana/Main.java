package com.ioana;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        String str = "tree";

        System.out.println(frequencySort(str));

    }

    public static String frequencySort(String s) {

        Map<Character, Integer> frequencies = new HashMap<>();

        for(char c : s.toCharArray()) {

            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencies.get(b) - frequencies.get(a));

        maxHeap.addAll(frequencies.keySet());

        StringBuilder result = new StringBuilder();

        while(!maxHeap.isEmpty()) {

            char current = maxHeap.remove();
            for (int i = 0; i < frequencies.get(current); i++) {

                result.append(current);
                
            }
        }

        return result.toString();
    }


}
