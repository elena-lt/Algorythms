package arrays

/**
 * Given two integer arrays startTime and endTime and given an integer queryTime.
 * The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
 * Return the number of students doing their homework at time queryTime.
 * More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 *
 * Example: Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4. Output: 1
 *
 * Constraints:
 *
 * startTime.length == endTime.length
 * 1 <= startTime.length <= 100
 * 1 <= startTime[i] <= endTime[i] <= 1000
 * 1 <= queryTime <= 1000
 *
 * Source: https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/description/?envType=problem-list-v2&envId=array
 */
fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
    var count = 0

    for (i in startTime.indices) {
        if ((startTime[i] <= queryTime && endTime[i] >= queryTime)) count++
    }

    return count
}

fun main() {
    println(
        busyStudent(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 7),
            4
        )
    )
}
