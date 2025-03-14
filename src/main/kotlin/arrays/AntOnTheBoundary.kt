package arrays

/**
 * An ant is on a boundary. It sometimes goes left and sometimes right.
 * You are given an array of non-zero integers nums. The ant starts reading nums from the first element of it to its end.
 * At each step, it moves according to the value of the current element:
 *
 * If nums[i] < 0, it moves left by -nums[i] units.
 * If nums[i] > 0, it moves right by nums[i] units.
 * Return the number of times the ant returns to the boundary.
 *
 * Notes:
 * There is an infinite space on both sides of the boundary.
 * We check whether the ant is on the boundary only after it has moved |nums[i]| units.
 * In other words, if the ant crosses the boundary during its movement, it does not count.
 *
 * Example: Input: nums = [2,3,-5]. Output: 1
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * -10 <= nums[i] <= 10
 * nums[i] != 0
 *
 * Source: https://leetcode.com/problems/ant-on-the-boundary/description/?envType=problem-list-v2&envId=array
 */
fun returnToBoundaryCount(nums: IntArray): Int {
    var count = 0
    var currentPos = 0
    for (num in nums){
        currentPos += num
        if(currentPos == 0) count++
    }
    return count
}