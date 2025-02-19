package arrays

/**
 * You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
 *
 * answer1 : the number of indices i such that nums1[i] exists in nums2.
 * answer2 : the number of indices i such that nums2[i] exists in nums1.
 * Return [answer1,answer2].
 *
 * Example: Input: nums1 = [2,3,2], nums2 = [1,2]. Output: [2,1]
 *
 * Constraints:
 * n == nums1.length
 * m == nums2.length
 * 1 <= n, m <= 100
 * 1 <= nums1[i], nums2[i] <= 100
 *
 * Spurce: https://leetcode.com/problems/find-common-elements-between-two-arrays/description/?envType=problem-list-v2&envId=array
 */
fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
    var ans1 = 0
    var ans2 = 0
    for (num in nums1) {
        if (num in nums2) ans1++
    }

    for (num in nums2) {
        if (num in nums1) ans2++
    }
    return intArrayOf(ans1, ans2)
}