package strings

/**
 * You are given a 0-indexed string 's' consisting of only lowercase English letters,
 * where each letter in 's' appears exactly twice. You are also given a 0-indexed integer
 * array 'distance' of length 26.
 * Each letter in the alphabet is numbered from 0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).
 *
 * In a well-spaced string, the number of letters between the two occurrences of the ith letter
 * is distance[i]. If the ith letter does not appear in s, then distance[i] can be ignored.
 * Return true if s is a well-spaced string, otherwise return false.
 *
 * Example:
 * Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * Output: true
 *
 * Source: https://leetcode.com/problems/check-distances-between-same-letters/description/
 */
fun main(){
    val inputs = listOf(
        "abaccb" to intArrayOf(1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0), //true
        "aa" to intArrayOf(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0), //false
    )
    inputs.forEach {
        println(checkDistances(it.first, it.second))
    }
}

fun checkDistances(s: String, distance: IntArray): Boolean {
    val indexes = Array(26) { IntArray(2) { -1 } }
    var result = true

    for (index in s.indices) {
        if (indexes[s[index] - 'a'][0] < 0) {
            indexes[s[index] - 'a'][0] = index
        } else {
            indexes[s[index] - 'a'][1] = index
            val dist = indexes[s[index] - 'a'][1] - indexes[s[index] - 'a'][0] -1
            if (dist != distance[s[index] - 'a']) {
                result = false
                break
            }
        }
    }

    return result
}