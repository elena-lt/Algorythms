package arrays

/**
 * Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values
 * that are present in at least two out of the three arrays. You may return the values in any order.
 *
 * Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]. Output: [3,2]
 *
 * Constraints:
 * 1 <= nums1.length, nums2.length, nums3.length <= 100
 * 1 <= nums1[i], nums2[j], nums3[k] <= 100
 *
 * Source: https://leetcode.com/problems/two-out-of-three/description/?envType=problem-list-v2&envId=array
 */
fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
    val freq = HashMap<Int, Int>()
    for (num in nums1.toSet()) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }

    for (num in nums3.toSet()) {
        val value = freq.getOrDefault(num, 0)
        freq[num] = value + 1
    }
    for (num in nums2.toSet()) {
        val value = freq.getOrDefault(num, 0)
        freq[num] = value + 1
    }

    val res = mutableListOf<Int>()
    for ((value, frequency) in freq) {
        if (frequency >= 2) {
            res.add(value)
        }
    }

    return res
}

fun twoOutOfThreeV2(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {

    val nums1Set = nums1.toSet()
    val nums2Set = nums2.toSet()
    val res = mutableSetOf<Int>()

    for (num in nums1Set) {
        if (num in nums2 || num in nums3) {
            res.add(num)
        }
    }

    for (num in nums2Set) {
        if (num in nums3 && num !in res) {
            res.add(num)
        }
    }
    return res.toList()
}
