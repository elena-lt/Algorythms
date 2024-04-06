package strings

/**
 * Given two string arrays 'words1' and 'words2', return the number of strings that appear
 * exactly once in each of the two arrays.
 *
 * Example:
 * Input: words1 = ["leetcode","is","amazing","as","is"], words2 = ["amazing","leetcode","is"]
 * Output: 2
 *
 * Source: https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
 */
fun main() {
    val inputs = listOf(
        arrayOf("leetcode", "is", "amazing", "as", "is") to arrayOf(
            "amazing",
            "leetcode",
            "is"
        ), //2
        arrayOf("b", "bb", "bbb") to arrayOf("a", "aa", "aaa"), //0
        arrayOf("a", "ab") to arrayOf("a", "a", "a", "ab"), //1
    )
    inputs.forEach { println(countWordsV2(it.first, it.second)) }
}

fun countWords(words1: Array<String>, words2: Array<String>): Int {
    val distinctWords1 = words1
        .groupingBy { it }
        .eachCount()
        .filterValues { it == 1 }
        .keys

    val distinctWords2 = words2
        .groupingBy { it }
        .eachCount()
        .filterValues { it == 1 }
        .keys

    return distinctWords1.count { distinctWords2.contains(it) }
}

fun countWordsV2(words1: Array<String>, words2: Array<String>): Int {
    val seenOnceA = hashSetOf<String>()
    val seenOnceAB = hashSetOf<String>()
    val usedMoreThanOnce = hashSetOf<String>()

    for (word in words1) {
        if (seenOnceA.contains(word)) {
            seenOnceA.remove(word)
            usedMoreThanOnce.add(word)
        }
        if (!usedMoreThanOnce.contains(word)) {
            seenOnceA.add(word)
        }
    }

    for (word in words2) {
        if (seenOnceA.contains(word)) {
            if (seenOnceAB.contains(word)) {
                seenOnceAB.remove(word)
                usedMoreThanOnce.add(word)
            }

            if (!usedMoreThanOnce.contains(word)) {
                seenOnceAB.add(word)
            }
        }
    }

    return seenOnceAB.size
}

