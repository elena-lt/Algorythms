package arrays

import kotlin.math.max

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 *
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude
 * between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 *
 * Example: Input: gain = [-5,1,5,0,-7]. Output: 1
 *
 * Constraints:
 * n == gain.length
 * 1 <= n <= 100
 * -100 <= gain[i] <= 100
 *
 * Source: https://leetcode.com/problems/find-the-highest-altitude/description/?envType=problem-list-v2&envId=array
 */
fun largestAltitude(gain: IntArray): Int {
    var max = max(0, gain[0])
    var prev = 0

    for (i in gain.indices) {
        prev += gain[i]
        max = max(max, prev)
    }

    return max
}

fun main() {
    println(largestAltitude(intArrayOf(-4,-3,-2,-1,4,3,2)))
}