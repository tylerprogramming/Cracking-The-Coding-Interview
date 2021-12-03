package com.tyler.ctci;

import com.tyler.ctci.arraysandstrings.IsUnique;

public class Main {

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        System.out.println(isUnique.isUniqueCharacters("unique"));
        System.out.println(isUnique.isUniqueCharacters("racecar"));
    }
}
