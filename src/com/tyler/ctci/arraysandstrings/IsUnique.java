package com.tyler.ctci.arraysandstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    // use with another data structure
    public boolean isUniqueCharacters(String string) {
        if (string.length() > 128) {
            return false;
        }

        boolean[] set = new boolean[128];

        for (int i = 0; i < string.length(); i++) {
            int value = string.charAt(i);
            System.out.println(value);
            if (set[value]) {
                return false;
            }

            set[value] = true;
        }

        return true;
    }

    // using another data structure
    public boolean isUniqueCheckSetSize(String s) {
        Set<Character> characterSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            characterSet.add(s.charAt(i));
        }

        if (characterSet.size() != s.length()) {
            return false;
        }

        return true;
    }

    // without another data structure using Brute Force - n^2
    public boolean isUniqueCharacterCompare(String string) {
        if (string.length() > 128) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    // sort first and then check adjacent characters in a linear fashion - n * log(n)
    public boolean isUniqueSortingString(String s) {
        if (s.length() > 128) {
            return false;
        }

        char[] content = s.toCharArray();
        Arrays.parallelSort(content);

        for (int i = 0; i < content.length - 1; i++) {
            if (content[i] == content[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
