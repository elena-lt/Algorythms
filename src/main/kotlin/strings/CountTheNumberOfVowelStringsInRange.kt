package strings

/**
 * You are given a 0-indexed array of string words and two integers 'left' and 'right'.
 * A string is called a vowel string if it starts with a vowel character and ends with a vowel character
 * where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
 *
 * Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
 */
fun main() {
    val inputs = listOf(
        Triple(arrayOf("are", "amy", "u"), 0, 2),
        Triple(arrayOf("hey", "aeo", "mu", "ooo", "artro"), 1, 4)
    )

    inputs.forEach { println(vowelStrings(it.first, it.second, it.third)) }
}

fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
    var count = 0
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    for (ind in left until right + 1) {
        if (words[ind].first() in vowels && words[ind].last() in vowels) count++
    }
    return count
}