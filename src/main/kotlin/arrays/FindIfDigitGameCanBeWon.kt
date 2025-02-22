package arrays

/**
 * You are given an array of positive integers nums.
 * Alice and Bob are playing a game. In the game, Alice can choose either all single-digit
 * numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob.
 * Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.
 *
 * Return true if Alice can win this game, otherwise, return false.
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 99
 *
 * Source: https://leetcode.com/problems/find-if-digit-game-can-be-won/description/?envType=problem-list-v2&envId=array
 */
fun canAliceWin(nums: IntArray): Boolean {
    var sumSDigit = 0
    var sumDDigit = 0

    for (num in nums) {
        if (num < 10) sumSDigit += num else sumDDigit += num
    }

    return sumDDigit != sumSDigit
}