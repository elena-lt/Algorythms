package strings

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 *
 * Return the maximum number of words that appear in a single sentence.
 *
 * Constraints:
 * - 1 <= sentences.length <= 100
 * - 1 <= sentences[i].length <= 100
 * - sentences[i] consists only of lowercase English letters and ' ' only.
 * - sentences[i] does not have leading or trailing spaces.
 * - All the words in sentences[i] are separated by a single space.
 */
fun main() {
    val maxNum3 = mostWordsFound(arrayOf("please wait", "continue to fight", "continue to win"))
    val maxNum6 = mostWordsFoundV2(
        arrayOf(
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        )
    )
    println(maxNum6)
}

fun mostWordsFound(sentences: Array<String>): Int {
    var maxNum = 0
    sentences.forEach { sentence ->
        val wordsNum = sentence.split(" ").count()
        maxNum = if (maxNum <= wordsNum) wordsNum else maxNum
    }

    return maxNum
}

fun mostWordsFoundV2(sentences: Array<String>): Int {
    return sentences.maxOfOrNull { sentence -> sentence.split(" ").count() } ?: 0
}