package arrays

/**
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 * A subarray is a contiguous subsequence of the array.
 *
 * Example: Input: arr = [1,4,2,5,3]. Output: 58
 *
 * Constraints:
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 1000
 *
 * Source: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/?envType=problem-list-v2&envId=array
 */
// To find the number of all subarrays: (i+1)×(n−i) 0+1 x 5-0 = 1x4
// Ind to appear in num subarrays = ((i+1)×(n−i)+1) / 2 x
//
fun sumOddLengthSubarrays(arr: IntArray): Int {
    var sum = 0

    for (i in 0 until arr.size) {
        var currSum = arr[i]
        var prevSum = arr[i]

        var startInd = i + 1

        while (startInd < arr.size - 1) {
            prevSum = prevSum + arr[startInd] + arr[startInd + 1]
            currSum += prevSum
            startInd += 2
        }

        sum += currSum
    }
    return sum
}

//Time complexity: O(n)
fun sumOddLengthSubarraysV2(arr: IntArray): Int {
    val freq = mutableMapOf<Int, Int>()

    for (i in 0 until arr.size) {
        freq[arr[i]] = freq.getOrDefault(arr[i], 0) + ((i + 1) * (arr.size - i) + 1) / 2
    }

    var sum = 0
    for ((value, count) in freq) {
        sum += value * count
    }
    return sum
}

fun main() {
    val res = sumOddLengthSubarraysV2(intArrayOf(7,6,8,6))
    println(res)
}