package arrays

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 * Example: Input: nums = [8,1,2,2,3]. Output: [4,0,1,1,3]
 *
 * Source: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/?envType=problem-list-v2&envId=array
 */
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var hash = mutableListOf<IntArray>()
    val res = IntArray(nums.size)
    for (i in 0 until nums.size) {
        hash.add(intArrayOf(nums[i], i))
    }

    hash.sortBy { it[0] }

    for (n in 0 until hash.size) {
        if (n != 0) {
            if (hash[n][0] == hash[n - 1][0]) {
                res[hash[n][1]] = res[ hash[n - 1][1]]
            } else res[hash[n][1]] = n
        } else {
            res[hash[n][1]] = 0
        }
    }

    return res
}

fun main() {
//    val nums = intArrayOf(8, 1, 2, 2, 3)
    val nums = intArrayOf(7,7,7,7)
    println(smallerNumbersThanCurrent(nums).toList())
}