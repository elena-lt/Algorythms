package strings

import kotlin.math.min

/**
 * Given a string 's' and a character 'c' that occurs in 's', return an array of integers 'answer'
 * where 'answer.length' == 's.length' and answer[i] is the distance from index i to the closest
 * occurrence of character 'c' in 's'.
 *
 * Example:
 * Input: s = "loveleetcode", c = "e" -> Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 */
fun main() {
    val inputs = listOf(
//        "loveleetcode" to 'e', //[3,2,1,0,1,0,0,1,2,2,1,0]
//        "aaab" to 'b', //[3,2,1,0]
        "aaba" to 'b', //[2,1,0,1]
    )
    inputs.forEach {
        println(shortestToCharV2(it.first, it.second).toList())
    }
}

fun shortestToChar(s: String, c: Char): IntArray {
    val result = IntArray(s.length)
    val indOfOccurrence = s.indices.filter { s[it] == c }

    s.indices.forEach { ind ->
        val distances = mutableListOf<Int>()
        indOfOccurrence.forEach {
            val distance = if (it > ind) it - ind else ind - it
            distances.add(distance)
        }
        result[ind] = distances.min()
    }
    return result
}


fun shortestToCharV2(s: String, c: Char): IntArray {
    val result = IntArray(s.length) { -1 }
    var prevOcc = -1

    for (i in s.indices) {
        if (s[i] == c) prevOcc = i
        if (prevOcc != -1) {
            result[i] = i - prevOcc
        }
    }
    prevOcc = -1

    for (i in s.length - 1 downTo 0) {
        if (s[i] == c) prevOcc = i
        if (prevOcc != -1) {
            result[i] = if (result[i] == -1) prevOcc - i else min(result[i], prevOcc - i)
        }
    }
    return result
}