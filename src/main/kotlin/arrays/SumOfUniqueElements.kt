package arrays

/**
 * You are given an integer array nums. The unique elements of an array are the elements that appear
 * exactly once in the array. Return the sum of all the unique elements of nums.
 *
 * Example: Input: nums = [1,2,3,2]. Output: 4
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 *
 * Source: https://leetcode.com/problems/sum-of-unique-elements/description/?envType=problem-list-v2&envId=array
 */
fun sumOfUnique(nums: IntArray): Int {
    val frequency = HashMap<Int, Int>()
    nums.forEach { num -> frequency[num] = frequency.getOrDefault(num, 0) + 1 }

    return frequency.filter { it.value == 1 }.keys.sum()
}