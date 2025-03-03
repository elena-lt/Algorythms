package arrays

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 *
 * Example: Input: nums = [3,1,2,4]. Output: [2,4,3,1]
 *
 * Constraints:
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 *
 * Source: https://leetcode.com/problems/sort-array-by-parity/description/?envType=problem-list-v2&envId=array
 */
fun sortArrayByParity(nums: IntArray): IntArray {
    val res = IntArray(nums.size)

    var ind = 0
    var oddInd = nums.size - 1

    for (i in nums.indices) {
        if (nums[i] % 2 == 0) {
            res[ind] = nums[i]
            ind++
        } else {
            res[oddInd] = nums[i]
            oddInd--
        }
    }
    return res
}