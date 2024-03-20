package com.ramjava.java.basique.test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution4 {
    public static int getMaxTrafficTime(List<Integer> start, List<Integer> end) {
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < start.size(); i++) {
            events.add(new int[]{start.get(i), 1}); // 1 represents the start of an interval
            events.add(new int[]{end.get(i), -1});  // -1 represents the end of an interval
        }

        Collections.sort(events, (a, b) -> a[0] - b[0]); // Sort events based on time

        int maxTrafficTime = 0;
        int currentTraffic = 0;
        int prevTime = -1;

        for (int[] event : events) {
            int time = event[0];
            int type = event[1];
            if (prevTime != -1) {
                maxTrafficTime = Math.max(maxTrafficTime, currentTraffic);
            }
            currentTraffic += type;
            prevTime = time;
        }

        return maxTrafficTime;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> start = Arrays.asList(1, 2, 3);
        List<Integer> end = Arrays.asList(5, 4, 6);
        int result = getMaxTrafficTime(start, end);
        System.out.println(result); // Output should be 1 (since all intervals overlap at time 3)
    }
}
