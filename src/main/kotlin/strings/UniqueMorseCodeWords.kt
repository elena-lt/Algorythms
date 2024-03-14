package strings

/**
 * International Morse Code defines a standard encoding where each letter is mapped
 * to a series of dots and dashes, as follows:
 *
 * 'a' maps to ".-",
 * 'b' maps to "-...",
 * 'c' maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
 * We will call such a concatenation the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 */
fun main() {
    val inputs = arrayOf(
        arrayOf("gin", "zen", "gig", "msg"),
        arrayOf("a")
    )

    inputs.forEach {
        println(uniqueMorseRepresentations(it))
    }
}

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val CODE = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    val alphabet = ('a' ..  'z').toList()

    val combinations = mutableSetOf<String>()
    words.forEach { word ->
        val combination = buildString {
            word.forEachIndexed { _, c ->
                val indexInAlphabet = alphabet.indexOf(c)
                append(CODE[indexInAlphabet])
            }
        }

        combinations.add(combination)
    }

    return combinations.size
}