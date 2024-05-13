package com.example.solution.leetcode.string;

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting
 * with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 */
public class MergeStringAlternatively {
    public static class Solution {
        public String mergeAlternately(String word1, String word2) {
            final int word1Len = word1.length();
            final int word2Len = word2.length();
            final char[] merged = new char[word1Len + word2Len];
            final int minLength = Math.min(word1Len, word2Len);

            int i = 0;
            int j = 0;

            for (;i < minLength; i++) {
                merged[j++] = word1.charAt(i);
                merged[j++] = word2.charAt(i);
            }

            for (;i < word1Len; i++) {
                merged[j++] = word1.charAt(i);
            }

            for (;i < word2Len; i++) {
                merged[j++] = word2.charAt(i);
            }

            return new String(merged);
        }
    }
}
