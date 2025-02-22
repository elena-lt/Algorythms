package sorting.bucket_sort

/**
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. I
 * f multiple values have the same frequency, sort them in decreasing order.
 * Return the sorted array.
 *
 * Example: Input: nums = [1,1,2,2,2,3]. Output: [3,1,1,2,2,2].
 */
fun frequencySort(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (num in nums) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    val maxFreq = nums.size
    val buckets = Array<MutableList<Int>>(maxFreq + 1) { mutableListOf() }

    for ((num, freq) in map) {
        buckets[freq].add(num)
    }
    println(buckets.toList())

    val result = mutableListOf<Int>()
    for (freq in buckets.indices) {
        if (buckets[freq].isNotEmpty()) {
            buckets[freq].sortDescending()
            for (num in buckets[freq]) {
                repeat(freq) { result.add(num) }
            }
        }
    }
    return result.toIntArray()
}

fun frequencySortV2(nums: IntArray): IntArray {
    val freqMap = mutableMapOf<Int, Int>()
    for (num in nums) {
        freqMap[num] = freqMap.getOrDefault(num, 0) + 1
    }
    return nums.sortedWith(compareBy({ freqMap[it] }, { -it })).toIntArray()
}

fun main() {
    println(frequencySort(intArrayOf(1, 1, 2, 2, 2, 3)))
}