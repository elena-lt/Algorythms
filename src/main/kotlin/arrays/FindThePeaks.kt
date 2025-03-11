package arrays

/**
 * You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.
 * Return an array that consists of indices of peaks in the given array in any order.
 *
 * Notes:
 * A peak is defined as an element that is strictly greater than its neighboring elements.
 * The first and last elements of the array are not a peak.
 *
 * Example: Input: mountain = [2,4,4]. Output: []
 *
 * Constraints:
 * 3 <= mountain.length <= 100
 * 1 <= mountain[i] <= 100
 *
 * Source: https://leetcode.com/problems/find-the-peaks/description/?envType=problem-list-v2&envId=array
 */
fun findPeaks(mountain: IntArray): List<Int> {
    val ans = mutableListOf<Int>()
    for (i in 1 until mountain.size - 1) {
        if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) ans.add(i)
    }
    return ans
}