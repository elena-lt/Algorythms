package strings

/**
 * Given an array of strings words, return the words that can be typed using letters of the alphabet
 * on only one row of American keyboard like the image:
 * https://assets.leetcode.com/uploads/2018/10/12/keyboard.png
 *
 * In the American keyboard:
 * - the first row consists of the characters "qwertyuiop",
 * - the second row consists of the characters "asdfghjkl", and
 * - the third row consists of the characters "zxcvbnm".
 *
 * Example:
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * Output: ["Alaska","Dad"]
 *
 * Source: https://leetcode.com/problems/keyboard-row/description/
 */
fun main() {
    val inputs = listOf(
        arrayOf("Hello", "Alaska", "Dad", "Peace"),
        arrayOf("omk"),
        arrayOf("adsdf", "sfd")
    )
    inputs.forEach { println(findWords(it) ) }
}

fun findWords(words: Array<String>): Array<String> {
    val fr = "qwertyuiop"
    val sr = "asdfghjkl"
    val tr = "zxcvbnm"
    val result = mutableListOf<String>()

    words.forEach { word ->
        val allInFirst = word.all { it.lowercase() in fr }
        val allInSecond = word.all { it.lowercase() in sr }
        val allInThird = word.all { it.lowercase() in tr }
        if (allInFirst || allInSecond || allInThird) result.add(word)
    }
    return result.toTypedArray()
}