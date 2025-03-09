package arrays

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * Example: Input: nums1 = [1,2,2,1], nums2 = [2,2]. Output: [2]
 *
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 *
 * Source: https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=array
 */

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val nums2Set = nums2.toSet()
    val res = mutableSetOf<Int>()
    for (i in nums1.indices) {
        if (nums1[i] in nums2Set && nums1[i] !in res) {
            res.add(nums1[i])
        }
    }
    return res.toIntArray()
}