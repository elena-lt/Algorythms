package arrays

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
 *
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 */
//Time complexity: O(n log n)
fun heightChecker(heights: IntArray): Int {
    val sorted = heights.sortedArray()
    var count = 0
    for (i in heights.indices) {
        if (heights[i] != sorted[i]) count++
    }
    return count
}

fun heightCheckerV2(heights: IntArray): Int {
    val maxHeight = 100 // Given constraint: height range is [1, 100]
    val count = IntArray(maxHeight + 1)

    for (h in heights) {
        count[h]++
    }

    var mismatch = 0
    var currentHeight = 0

    for (h in heights) {
        while (count[currentHeight] == 0) {
            currentHeight++
        }

        if (h != currentHeight) {
            mismatch++
        }

        count[currentHeight]--
    }

    return mismatch
}