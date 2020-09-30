package com.ioana;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = new String[]{"aa", "a"};

        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {

        String longest = "";

        if(strs.length == 0) {

            return longest;
        }

        String comparisonWord = strs[0];
        int comparisonIndex = 0;

        for(char comparisonLetter : comparisonWord.toCharArray()) {

            for(int i = 1; i < strs.length; i++) {

                String currentWord = strs[i];

                if(comparisonIndex >= currentWord.length()) {

                    return longest;
                }

                char currentLetter = currentWord.charAt(comparisonIndex);

                if(currentLetter != comparisonLetter) {

                    return longest;
                }

            }

            comparisonIndex++;
            longest += comparisonLetter;
        }


        return longest;
    }
}
