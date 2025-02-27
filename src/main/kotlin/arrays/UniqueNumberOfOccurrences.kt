package arrays

/**
 * Given an array of integers arr, return true if the number of occurrences of each
 * value in the array is unique or false otherwise.
 */
fun uniqueOccurrences(arr: IntArray): Boolean {
    val freq = mutableMapOf<Int, Int>()

    for (i in arr.indices) {
        freq[arr[i]] = freq.getOrDefault(arr[i], 0) + 1
    }

    return freq.values.toSet().size == freq.size
}