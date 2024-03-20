package com.ramjava.java.basique.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Result4 {
    public static int getMaxTrafficTime(List<Integer> start, List<Integer> end) {
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < start.size(); i++) {
            events.add(new int[]{start.get(i), 1}); // 1 represents the start of an interval
            events.add(new int[]{end.get(i), -1});  // -1 represents the end of an interval
        }

        Collections.sort(events, Comparator.comparingInt(a -> a[0])); // Sort events based on time

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
}
