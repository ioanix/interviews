package com.ioana;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println(isValid("([{}])"));


    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {

            if(c == '(' || c == '[' || c == '{') {

                stack.push(c);

            } else if((c == ')' && !stack.isEmpty() && stack.peek() == '(') ||
                      (c == ']' && !stack.isEmpty() && stack.peek() == '[') ||
                      (c == '}' && !stack.isEmpty() && stack.peek() == '{')) {

                stack.pop();

            } else {

                return false;
            }
        }

        return stack.isEmpty();
    }
}
