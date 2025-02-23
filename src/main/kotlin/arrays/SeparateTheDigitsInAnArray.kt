package arrays

/**
 * Given an array of positive integers nums, return an array answer that consists of the digits
 * of each integer in nums after separating them in the same order they appear in nums.
 * To separate the digits of an integer is to get all the digits it has in the same order.
 * For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
 *
 * Example: Input: nums = [13,25,83,77]. Output: [1,3,2,5,8,3,7,7]
 *
 * Constraints:
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 105
 *
 * Source: https://leetcode.com/problems/separate-the-digits-in-an-array/description/?envType=problem-list-v2&envId=array
 */
fun separateDigits(nums: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    for (num in nums) {
        for (n in num.toString()) {
            answer.add(n.digitToInt())
        }
    }

    return answer.toIntArray()
}