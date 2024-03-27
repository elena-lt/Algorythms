package strings

import java.lang.StringBuilder

/**
 * Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
 *
 * Example:
 * Input: "51230100" -> output: "512301"
 * Input: "123" -> output: "123"
 */
fun main() {
    val inputs = listOf(
        "51230100",
        "123"
    )

    inputs.forEach { println(removeTrailingZerosV2(it)) }
}

fun removeTrailingZeros(num: String): String {
    return num.reversed()
        .dropWhile { it.toString().toInt() == 0 }
        .reversed()
}

fun removeTrailingZerosV2(num: String): String {
    return buildString {
        for (i in num.lastIndex downTo 0) {
            if (num[i].toString().toInt() == 0) {
                continue
            } else {
                append(num.substring(0, i + 1))
                break
            }
        }
    }
}