package sorting

/**
 * You are given a 0-indexed integer array nums of even length and there is also an empty array arr.
 * Alice and Bob decided to play a game where in every round Alice and Bob will do one move.
 * The rules of the game are as follows:
 *
 * Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
 * Now, first Bob will append the removed element in the array arr, and then Alice does the same.
 * The game continues until nums becomes empty.
 * Return the resulting array arr.
 *
 * Constraints:
 * 2 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * nums.length % 2 == 0
 *
 * Source: https://leetcode.com/problems/minimum-number-game/description/?envType=problem-list-v2&envId=sorting
 */
fun numberGame(nums: IntArray): IntArray {
    val sortedArr = nums.sorted()
    val arr = IntArray(sortedArr.size )
    var num = 0
    while (num < sortedArr.size - 1) {
        arr[num] = sortedArr[num + 1]
        arr[num + 1] = sortedArr[num]
        num += 2
    }
    return arr
}