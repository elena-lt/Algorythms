package arrays

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Example:
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 *
 * Constraints:
 * 1 <= n <= 500
 * nums.length == 2n
 * 1 <= nums[i] <= 10^3
 *
 * Source: https://leetcode.com/problems/shuffle-the-array/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val input = listOf(
        Pair(intArrayOf(2, 5, 1, 3, 4, 7), 3), //[2,3,5,4,1,7]
        Pair(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4), //[1,4,2,3,3,2,4,1]
        Pair(intArrayOf(1, 1, 2, 2), 2), //[1,2,1,2]
    )
    input.forEach { println(shuffle(it.first, it.second).toList()) }
}

private fun shuffle(nums: IntArray, n: Int): IntArray {
    var arr = intArrayOf()

    for (i in 0 until n) {
        arr += nums[i]
        arr += nums[i + n]
    }
    return arr
}