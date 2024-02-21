package strings

/**
 * You are given a 0-indexed array of strings words and a character x.
 * Return an array of indices representing the words that contain the character x.
 *
 * Note that the returned array may be in any order.
 *
 * - 1 <= words.length <= 50
 * - 1 <= words[i].length <= 50
 * - x is a lowercase English letter.
 * - words[i] consists only of lowercase English letters.
 */
fun main() {
    val result = findWordsContaining(words = arrayOf("abc", "bcd", "aaaa", "cbc"), x = 'a')
    println(result)
}

/**
 * Time complexity: O(n * m):
 *
 * Iterating through each word in the words array using forEachIndexed takes O(n), where n is the number of words in the array.
 * Checking if a word contains the character x using contains method generally takes O(m), where m is the length of the word.
 *
 * Space complexity: O(n) - in the worst case, the size of result will be equal to the number of words in the input array words.
 */
fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val result = mutableListOf<Int>()
    words.forEachIndexed { index, word -> if (word.contains(x)) result.add(index) }

    return result
}

fun findWordsContainingV2(words: Array<String>, x: Char): List<Int> {
    return (0 until words.size).filter {
        x in words[it]
    }
}