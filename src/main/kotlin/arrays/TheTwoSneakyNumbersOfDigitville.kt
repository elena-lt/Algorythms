package arrays

/**
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
 * Each number was supposed to appear exactly once in the list, however,
 * two mischievous numbers sneaked in an additional time, making the list longer than usual.
 *
 * As the town detective, your task is to find these two sneaky numbers.
 * Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
 *
 * Example:
 * Input: nums = [0,1,1,0], Output: [0,1]
 *
 * Constraints:
 *
 * 2 <= n <= 100
 * nums.length == n + 2
 * 0 <= nums[i] < n
 * The input is generated such that nums contains exactly two repeated elements.
 *
 * Source: https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val input = listOf(
        intArrayOf(0, 1, 1, 0), //[]0,1
        intArrayOf(0, 3, 2, 1, 3, 2), //[2,3]
        intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2), //[4,5]
    )
    input.forEach { println(getSneakyNumbersV2(it).toList()) }
}

fun getSneakyNumbersV2(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    var count = 0
    val res = mutableListOf<Int>()

    for (i in nums.indices) {
        val num = nums[i]
        val occurrence = map[num] ?: 0
        if (occurrence == 1 && count < 2) {
            res.add(num)
            count++
        }
        map[num] = occurrence + 1

        if(count == 2) break
    }
    return res.toIntArray()
}

/**
 * O(n)
 */
fun getSneakyNumbers(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val res = mutableListOf<Int>()
    nums.forEach { num ->
        map[num] = (map.get(num) ?: 0) + 1
    }
    map.forEach {
        if (it.value > 1) res.add(it.key)
    }
    return res.toIntArray()
}