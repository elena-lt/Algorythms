package arrays

/**
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 *
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * Return names sorted in descending order by the people's heights.
 *
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]. Output: ["Mary","Emma","John"]
 *
 * Constraints:
 * n == names.length == heights.length
 * 1 <= n <= 103
 * 1 <= names[i].length <= 20
 * 1 <= heights[i] <= 105
 * names[i] consists of lower and upper case English letters.
 * All the values of heights are distinct.
 */
//Time complexity:
fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val map = mutableMapOf<Int, String>()
    for (i in 0 until heights.size) {
        map[heights[i]] = names[i]
    }
    return map.toSortedMap(compareByDescending { it }).values.toTypedArray()
}

fun sortPeopleV2(names: Array<String>, heights: IntArray): Array<String> {
    return heights
        .zip(names)
        .sortedByDescending { it.first }
        .map { it.second }
        .toTypedArray()
}