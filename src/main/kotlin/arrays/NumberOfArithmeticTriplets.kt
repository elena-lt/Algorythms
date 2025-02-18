package arrays

/**
 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
 * i < j < k,
 * nums[j] - nums[i] == diff, and
 * nums[k] - nums[j] == diff.
 * Return the number of unique arithmetic triplets.
 *
 * Constraints:
 * 3 <= nums.length <= 200
 * 0 <= nums[i] <= 200
 * 1 <= diff <= 50
 * nums is strictly increasing.
 *
 * Source: https://leetcode.com/problems/number-of-arithmetic-triplets/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(n^3)
fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
    var res = 0

    for (i in 0 until nums.size - 2) {
        for (n in i + 1 until nums.size - 1) {
            if (nums[n] - nums[i] > diff) continue

            for (m in i + 2 until nums.size) {
                if (nums[m] - nums[n] > diff) continue

                if (nums[n] - nums[i] == diff && nums[m] - nums[n] == diff) {
                    res++
                }
            }
        }
    }
    return res
}

//Time complexity: O(n)
fun arithmeticTripletsV2(nums: IntArray, diff: Int): Int {
    var res = 0

    val numsSet = nums.toHashSet()
    for (num in nums) {
        if (num + diff in numsSet && num + 2 * diff in numsSet) {
            res++
        }
    }
    return res
}

fun main() {
    println(arithmeticTriplets(intArrayOf(0, 1, 4, 6, 7, 10), 3))
}