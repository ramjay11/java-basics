package com.ramjava.java.basique.test;

import java.util.*;

public class TestGenpact {
        /* DO NOT MODIFY THIS PART */
        public static void main(String args[] ) throws Exception {
            List<String> input = Arrays.asList("John", "MayA", "Mary", "   ", "Anne", " d", "   anne   ", "michael", null, "Anthony", "Maya", "mary", "", "john");
            List<String> output = formatDedupSort(input);
            output.forEach(System.out::println);
            //System.out.println("Format:1 " + output.toString());
        }
        /* DO NOT MODIFY THIS PART */

        /**
         * @param input - List<String> representing a list of first names, with no consistent formatting,
         *                likely duplicates, possible blanks and nulls, unsorted
         * @return List<String> - list, where:
         * 1) names formatted with uppercase first letter, and the rest of letters in lowercase
         * 2) no duplicates
         * 3) no empty/blank strings
         * 4) names sorted alphabetically
         */
        public static List<String> formatDedupSort(final List<String> input) {
            // Remove duplicates by converting the list to a set and back to a list
            Set<String> uniqueNamesSet = new HashSet<>(input);
            List<String> uniqueNamesList = new ArrayList<>(uniqueNamesSet);

            // Remove empty and null strings
            uniqueNamesList.removeIf(name -> name == null || name.trim().isEmpty());

            // Format names to have the first letter uppercase and the rest lowercase
            for (int i = 0; i < uniqueNamesList.size(); i++) {
                String name = uniqueNamesList.get(i);
                uniqueNamesList.set(i, formatName(name));
            }

            // Sort the names alphabetically
            Collections.sort(uniqueNamesList);

            return uniqueNamesList;
        }

        private static String formatName(String name) {
            if (name == null || name.isEmpty()) {
                return name;
            }
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }

}
