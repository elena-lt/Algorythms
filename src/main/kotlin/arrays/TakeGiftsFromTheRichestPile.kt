package arrays

import java.util.Comparator
import java.util.PriorityQueue
import kotlin.math.floor
import kotlin.math.sqrt

/**
 * You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:
 *
 * Choose the pile with the maximum number of gifts.
 * If there is more than one pile with the maximum number of gifts, choose any.
 * Reduce the number of gifts in the pile to the floor of the square root of the original number of gifts in the pile.
 * Return the number of gifts remaining after k seconds.
 *
 * Example: Input: gifts = [25,64,9,4,100], k = 4. Output: 29
 *
 * Constraints:
 *
 * 1 <= gifts.length <= 103
 * 1 <= gifts[i] <= 109
 * 1 <= k <= 103
 *
 * Source: https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/?envType=problem-list-v2&envId=array
 */
//Time complexity:
// Adding to queue -> O(n log n)
// Removing an adding -> O(k log n). K == seconds left
// Sum all elements -> O(n)
// Total -> O((n + k) + log n)
fun pickGifts(gifts: IntArray, k: Int): Long {
    val queue = PriorityQueue<Int>(Comparator.reverseOrder())
    for (i in gifts.indices) {
        queue.add(gifts[i])
    }

    var sec = 0

    while (sec < k) {
        val value = floor(sqrt(queue.remove() * 1.0)).toInt()
        queue.add(value)
        sec++
    }
    return queue.sumOf { it.toLong() }
}