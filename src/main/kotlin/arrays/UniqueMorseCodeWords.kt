package arrays

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
 *
 * 'a' maps to ".-",
 * 'b' maps to "-...",
 * 'c' maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 *
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 *
 * Example: Input: words = ["gin","zen","gig","msg"]. Output: 2
 *
 * Constraints:
 *
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 12
 * words[i] consists of lowercase English letters.
 *
 * Source: https://leetcode.com/problems/unique-morse-code-words/description/?envType=problem-list-v2&envId=array
 */
fun uniqueMorseRepresentations(words: Array<String>): Int {
    val answer = mutableSetOf<String>()
    val map = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    for (word in words) {
        var encoded = ""
        for (c in word) {
            encoded += map[25 - ('z' - c)]
        }
        answer.add(encoded)
    }
    return answer.size
}