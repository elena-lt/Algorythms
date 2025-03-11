package arrays

fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
    val bucket = LinkedHashMap<Int, MutableList<Int>>(arr2.size + 1)

    for (i in arr2.indices) {
        bucket[arr2[i]] = mutableListOf()
    }

    for (i in arr1.indices) {
        if (arr1[i] in bucket) {
            bucket[arr1[i]]!!.add(arr1[i])
        } else {
            val otherNums = bucket[1001]

            if (otherNums == null) {
                bucket[1001] = mutableListOf(arr1[i])
            } else {
                bucket[1001]!!.add(arr1[i])
            }
        }
    }

    var ans = IntArray(arr1.size)
    var ind = 0
    for ((num, value) in bucket) {
        if (num == 1001) {
            val sorted = value.sorted()
            for (n in sorted.indices) {
                ans[ind + n] = sorted[n]
            }
            continue
        }

        for (n in 0 until value.size) {
            ans[ind + n] = num
        }
        ind += value.size
    }
    return ans
}

fun relativeSortArrayV2(arr1: IntArray, arr2: IntArray): IntArray {
    val freq = IntArray(1001)

    for (num in arr1) {
        freq[num] = freq[num] + 1
    }

    val res = IntArray(arr1.size)
    var ind = 0
    for (i in arr2.indices) {
        val repeatTimes = freq[arr2[i]]
        repeat(repeatTimes) { res[ind + it] = arr2[i] }
        ind += repeatTimes
        freq[arr2[i]] = 0
    }

    for (i in freq.indices) {
        repeat(freq[i]) { res[ind + it] = i }
        ind += freq[i]
    }

    return res
}