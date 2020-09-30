package com.ioana;

public class Main {

    public static void main(String[] args) {

        System.out.println(isValidPalindrome("race a car"));

    }

    public static boolean isValidPalindrome(String s) {


        int pointerOne = 0;
        int pointerTwo = s.length() - 1;

        while(pointerOne < pointerTwo) {

            while(!Character.isLetterOrDigit(s.charAt(pointerOne))) {

                pointerOne++;
            }

            while(!Character.isLetterOrDigit(s.charAt(pointerTwo))) {

                pointerTwo--;
            }

            if(Character.toLowerCase(s.charAt(pointerOne)) != Character.toLowerCase(s.charAt(pointerTwo))) {

                return false;
            }

            pointerOne++;
            pointerTwo--;
        }


        return true;


    }
}
