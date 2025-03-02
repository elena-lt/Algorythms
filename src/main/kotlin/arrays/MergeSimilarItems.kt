package arrays

/**
 * You are given two 2D integer arrays, items1 and items2, representing two sets of items.
 * Each array items has the following properties:
 *
 * items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
 * The value of each item in items is unique.
 * Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.
 *
 * Note: ret should be returned in ascending order by value.
 *
 * Example: Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]. Output: [[1,6],[3,9],[4,5]]
 *
 * Constraints:
 * 1 <= items1.length, items2.length <= 1000
 * items1[i].length == items2[i].length == 2
 * 1 <= valuei, weighti <= 1000
 * Each valuei in items1 is unique.
 * Each valuei in items2 is unique.
 *
 * Source: https://leetcode.com/problems/merge-similar-items/description/?envType=problem-list-v2&envId=array
 */
fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
    val map = HashMap<Int, Int>(items2.size)
    for (item in items2) {
        map[item[0]] = item[1]
    }

    for (item in items1) {
        map[item[0]] = map.getOrDefault(item[0], 0) + item[1]
    }

    return map
        .toSortedMap()
        .map { listOf(it.key, it.value) }
}

fun mergeSimilarItemsV2(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
    val buckets = IntArray(1001) { 0 }
    for (i in items1.indices) {
        buckets[items1[i][0]] = items1[i][1]
    }

    for (i in items2.indices) {
        buckets[items2[i][0]] = buckets.getOrElse(items2[i][0], { 0 }) + items2[i][1]
    }

    val res = mutableListOf<List<Int>>()
    for (i in buckets.indices) {
        if (buckets[i] != 0) {
            res.add(listOf(i, buckets[i]))
        }
    }
    return res
}