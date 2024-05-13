package com.example.solution.leetcode.string;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class GreatestCommonDivisorOfString {
    public static class Solution {

        public String gcdOfStrings(String str1, String str2) {
            String tmp;

            if (str1.length() < str2.length()) {
                tmp = str1;
                str1 = str2;
                str2 = tmp;
            }

            while (!str2.isEmpty()) {
                tmp = str1;
                str1 = str2;

                if (!tmp.startsWith(str2)) {
                    return "";
                }

                str2 = deleteRepeatedPrefixes(tmp, str2);
            }

            return str1;
        }

        private String deleteRepeatedPrefixes(final String from, final String prefix) {
            final int divisorLen = prefix.length();
            int offset = divisorLen;

            while (from.startsWith(prefix, offset)) {
                offset += divisorLen;
            }

            return from.substring(offset);
        }
    }
}
