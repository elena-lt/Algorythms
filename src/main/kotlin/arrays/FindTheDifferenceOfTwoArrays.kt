package arrays

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * - answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * - answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 *
 * Example: Input: nums1 = [1,2,3], nums2 = [2,4,6]. Output: [[1,3],[4,6]]
 *
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * -1000 <= nums1[i], nums2[i] <= 1000
 *
 * Source: https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(n)
fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val nums1Map = HashMap<Int, Int>()
    val nums2Map = HashMap<Int, Int>()

    nums1.forEach { num -> nums1Map[num] = num }
    nums2.forEach { num -> nums2Map[num] = num }

    val answer = List(2) { mutableListOf<Int>() }
    nums1Map.forEach { (key, _) ->
        if (key !in nums2Map) {
            answer[0].add(key)
        }
    }
    nums2Map.forEach { (key, _) ->
        if (key !in nums1Map) {
            answer[1].add(key)
        }
    }

    return answer
}