package arrays

/**
 * You are given an array nums consisting of positive integers.
 * Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
 * The frequency of an element is the number of occurrences of that element in the array.
 *
 * Example: Input: nums = [1,2,2,3,1,4]. Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=problem-list-v2&envId=array
 */
fun maxFrequencyElements(nums: IntArray): Int {
    val freg = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        freg[nums[i]] = freg.getOrDefault(nums[i], 0) + 1
    }

    var count = 0
    var max = 0
    for ((num, frequency) in freg) {
        when {
            frequency > max -> {
                max = frequency
                count = frequency
            }
            frequency == max -> count += frequency
            else -> Unit
        }

    }
    return count
}

fun main() {
    println(maxFrequencyElements(intArrayOf(10, 12, 11, 9, 6, 19, 11)))
}