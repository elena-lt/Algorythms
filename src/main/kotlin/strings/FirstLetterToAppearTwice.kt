package strings

/**
 * Given a string 's' consisting of lowercase English letters, return the first letter to appear twice.
 * - A letter `a` appears twice before another letter `b` if the second occurrence of a is before the second occurrence of b.
 * - s will contain at least one letter that appears twice.
 *
 * Constraints:
 *
 * - 2 <= s.length <= 100
 * - s consists of lowercase English letters.
 * - s has at least one repeated letter.
 *
 * Source: https://leetcode.com/problems/first-letter-to-appear-twice/description/
 */
fun main() {
    val input = listOf(
        "abccbaacz", //c
        "abcdd", //d
        "nwcn", //n
        "abccbaacz", //c
        "abcbcaacz", //b
    )
    input.forEach { println(repeatedCharacterV2(it)) }
}

fun repeatedCharacter(s: String): Char {
    val elements = mutableSetOf<Char>()
    var result: Char = s.first()

    for (i in 0 until s.length) {
        if (s[i] in elements) {
            result = s[i]
            break
        }
        elements.add(s[i])
    }

    return result
}

fun repeatedCharacterV2(s: String): Char {
    val visited = BooleanArray(26){false }

    for (char in s){
        val index = char - 'a'
        if (visited[index]){
            return char
        }else {
            visited[index] = true
        }
    }

    return ' '
}