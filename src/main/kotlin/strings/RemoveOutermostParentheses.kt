package strings

import java.lang.StringBuilder

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 *
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 *
 *
 */
fun main() {

    val inputs = listOf(
        "(()())(())" to "()()()",
        "(()())(())(()(()))" to "()()()()(())"
    )
    inputs.forEach { println(removeOuterParentheses(it.first)) }
}

fun removeOuterParentheses(s: String): String {
    var result = ""
    var openCount = 0
    var closedCount = 0
    var parentIndex = -1

    s.forEachIndexed { index, c ->
        if (c == '(') openCount++ else closedCount++

        if (parentIndex < 0) parentIndex = index

        if (openCount == closedCount) {
            result += s.substring(parentIndex + 1, index)
            parentIndex = -1
        }
    }

    return result
}

fun removeOuterParenthesesV2(s: String): String {
    var count = 0
    val result = StringBuilder()

    for (i in s.indices) {
        if (s[i] == '(') {
            count++
            if (count > 1) result.append(s[i])
        } else {
            count--
            if (count >= 1) result.append(s[i])
        }
    }
    return result.toString()
}
