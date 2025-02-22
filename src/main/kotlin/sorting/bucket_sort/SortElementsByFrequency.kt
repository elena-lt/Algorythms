package sorting.bucket_sort

/**
 * Given an array, sort it based on frequency. If multiple elements have the same frequency,
 * sort them in ascending order instead of descending.
 *
 * Example: intArrayOf(4, 4, 1, 1, 1, 2, 2, 3). Output: [3, 2, 2, 4, 4, 1, 1, 1]
 */
fun sort(nums: IntArray): IntArray {
    val sorted = mutableListOf<Int>()

    val freq = mutableMapOf<Int, Int>()
    nums.forEach {
        freq[it] = freq.getOrElse(it) { 0 } + 1
    }

    val bucket = Array<MutableList<Int>>(freq.size) { mutableListOf() }
    for ((value, count) in freq) {
        bucket[count].add(value)
    }

    for (i in bucket.indices) {
        if (bucket[i].isNotEmpty()) {
            bucket[i].sort()
            for (num in bucket[i]) {
                repeat(i) { sorted.add(num) }
            }
        }
    }
    return sorted.toIntArray()
}

fun main() {
    println(sort(intArrayOf(4, 4, 1, 1, 1, 2, 2, 3)).toList())
}