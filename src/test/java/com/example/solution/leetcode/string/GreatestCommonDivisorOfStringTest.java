package com.example.solution.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringTest {
    private final GreatestCommonDivisorOfString.Solution solution = new GreatestCommonDivisorOfString.Solution();

    @Test
    public void case1() {
        String gcd = solution.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC", gcd);
    }

    @Test
    public void case2() {
        String gcd = solution.gcdOfStrings("ABABAB", "ABAB");
        assertEquals("AB", gcd);
    }

    @Test
    public void case3() {
        String gcd = solution.gcdOfStrings("LEET", "CODE");
        assertEquals("", gcd);
    }

    @Test
    public void case4() {
        String gcd = solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
        assertEquals("TAUXX", gcd);
    }

    @Test
    public void case5() {
        String gcd = solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXX");
        assertEquals("TAUXX", gcd);
    }

    @Test
    public void case6() {
        String gcd = solution.gcdOfStrings("AABB", "AB");
        assertEquals("", gcd);
    }

    @Test
    public void case7() {
        String gcd = solution.gcdOfStrings("ABABB", "AB");
        assertEquals("", gcd);
    }

    @Test
    public void case8() {
        String gcd = solution.gcdOfStrings("BABA", "ABAB");
        assertEquals("", gcd);
    }
}