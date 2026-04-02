package org.solve.april;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class April2 {

    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"()[]{}\") = " + isValid("()[]{}"));
        System.out.println("isValid(\"([)]\") = " + isValid("([)]"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> pattern = Map.of('(', ')', '[', ']', '{', '}');

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            //is open brackets
            if (pattern.containsKey(bracket)) {
                stack.push(bracket);
            }else {
                if (stack.isEmpty() || !pattern.get(stack.peek()).equals(bracket))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
