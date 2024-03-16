package strings

/**
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * Return names sorted in descending order by the people's heights.
 *
 * Example:
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 * Output: ["Mary","Emma","John"]
 *
 * Source: https://leetcode.com/problems/sort-the-people/description/
 */
fun main() {

    val input = listOf(
        arrayOf("Mary", "John", "Emma") to intArrayOf(180, 165, 170),
        arrayOf("Alice", "Bob", "Bob") to intArrayOf(155, 185, 150)
    )

    input.forEach { println(sortPeople(it.first, it.second).map { name -> name }) }
}

fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    return names.mapIndexed { ind, name -> name to heights[ind] }
        .sortedByDescending { it.second }
        .map { it.first }
        .toTypedArray()
}

fun sortPeopleV2(names: Array<String>, heights: IntArray): Array<String> {
    return names.withIndex()
        .sortedByDescending { heights[it.index] }
        .map { it.value }
        .toTypedArray()
}