package com.ramjava.java.basique.test3;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution1 {
    public String solution(String T) {
        // Implement your solution here
        double temperature = Double.parseDouble(T);
        if (temperature < 35.0) {
            return "hypothermia";
        } else if (temperature >= 35.0 && temperature <= 37.5) {
            return "normal";
        } else if (temperature > 37.5 && temperature <= 40.0) {
            return "fever";
        } else {
            return "hyperpyrexia";
        }
    }
    public static void main(String[] args) {
        var sol = new Solution1();
        System.out.println("Test 1, Input: \"34.5\", Output: " + sol.solution("34.5"));
        System.out.println("Test 2, Input: \"35.0\", Output: " + sol.solution("35.0"));
        System.out.println("Test 3, Input: \"37.6\", Output: " + sol.solution("37.6"));
        System.out.println("Test 4, Input: \"41.0\", Output: " + sol.solution("41.0"));
    }
}
