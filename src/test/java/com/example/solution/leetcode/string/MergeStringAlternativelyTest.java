package com.example.solution.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringAlternativelyTest {
    final MergeStringAlternatively.Solution solution = new MergeStringAlternatively.Solution();

    @Test
    void case1() {
        String merged = solution.mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", merged);
    }

    @Test
    void case2() {
        String merged = solution.mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", merged);
    }

    @Test
    void case3() {
        String merged = solution.mergeAlternately("abcd", "pq");
        assertEquals("apbqcd", merged);
    }
}