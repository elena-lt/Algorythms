package strings

/**
 * A sentence is a list of words that are separated by a single space
 * with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 *
 * A sentence can be shuffled by appending the 1-indexed word position to each word
 * then rearranging the words in the sentence.
 *
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 *
 * Source: https://leetcode.com/problems/sorting-the-sentence/
 */
fun main() {
    val result = sortSentenceV2("is2 sentence4 This1 a3")
    println(result)
}

fun sortSentence(s: String): String {
    val wordsWithInd = s.split(" ")
    val array = arrayOfNulls<String>(wordsWithInd.size)

    wordsWithInd.forEach { wordWithInd ->
        val ind = wordWithInd.last()
        array[ind.digitToInt() - 1] = wordWithInd.takeWhile { it != ind }
    }
    return array.joinToString(" ")
}

fun sortSentenceV2(s: String): String {
    return s.split(" ")
        .map { it.last() to it.dropLast(1) }
        .sortedBy { it.first }
        .joinToString(" ") { it.second }
}