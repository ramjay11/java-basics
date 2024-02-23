package com.ramjava.java.basique.test3;

import java.util.Arrays;

public class Solution2 {
    //    public int[] solution(String R, int[] V) {
//        // Implement your solution here
//        int[] initialBalances = new int[2]; // [bank A, bank B]
//        int[] currentBalances = new int[2]; // [bank A, bank B]
//        for (int i = 0; i < R.length(); i++) {
//            int bankIndex = R.charAt(i) == 'A' ? 0 : 1;
//            currentBalances[bankIndex] += V[i];
//            initialBalances[0] = Math.max(initialBalances[0], currentBalances[0]);
//            initialBalances[1] = Math.max(initialBalances[1], currentBalances[1]);
//            currentBalances[bankIndex] -= V[i];
//        }
//        return initialBalances;
//    }
//
//    public static void main(String[] args) {
//        var sol = new Solution2();
//        System.out.println(Arrays.toString(sol.solution("BAABA", new int[]{2, 4, 1, 1, 2}))); // should return [2, 4]
//        System.out.println(Arrays.toString(sol.solution("ABAB", new int[]{10, 5, 10, 15}))); // should return [0, 15]
//        System.out.println(Arrays.toString(sol.solution("B", new int[]{100}))); // should return [100, 0]
//    }
    public int[] solution(String R, int[] V) {
        int balanceA = 0;
        int balanceB = 0;
        int minBalanceA = 0;
        int minBalanceB = 0;

        for (int i = 0; i < R.length(); i++) {
            if (R.charAt(i) == 'A') {
                balanceA += V[i];
                minBalanceA = Math.max(minBalanceA, balanceA);
                balanceB -= V[i];
                if (balanceB < 0) {
                    minBalanceB = Math.max(minBalanceB, -balanceB);
                    balanceB = 0;
                }
            } else {
                balanceB += V[i];
                minBalanceB = Math.max(minBalanceB, balanceB);
                balanceA -= V[i];
                if (balanceA < 0) {
                    minBalanceA = Math.max(minBalanceA, -balanceA);
                    balanceA = 0;
                }
            }
        }

        return new int[]{minBalanceA, minBalanceB};
    }

    public static void main(String[] args) {
        var sol = new Solution2();
        System.out.println(Arrays.toString(sol.solution("BAABA", new int[]{2, 4, 1, 1, 2}))); // should return [2, 4]
        System.out.println(Arrays.toString(sol.solution("ABAB", new int[]{10, 5, 10, 15}))); // should return [0, 15]
        System.out.println(Arrays.toString(sol.solution("B", new int[]{100}))); // should return [100, 0]
    }
}
