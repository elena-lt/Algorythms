package strings

import jdk.internal.org.jline.utils.Colors.s
import java.math.BigInteger

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Constraints:
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 *
 * Source: https://leetcode.com/problems/add-binary/description/?envType=problem-list-v2&envId=string&difficulty=EASY
 */
fun main() {
    val input = arrayOf(
        Pair("11", "1"),
        Pair(
            "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
            "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        )
    )

    input.forEach { println(addBinary(it.first, it.second)) }
}

fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}

