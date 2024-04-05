package strings

/**
 * The value of an alphanumeric string can be defined as:
 * - The numeric representation of the string in base 10, if it comprises of digits only.
 * - The length of the string, otherwise.
 * Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
 *
 * Example:
 * Input: strs = ["alic3","bob","3","4","00000"] -> Output: 5
 *
 * Source: https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/description/
 */
fun main() {
    val inputs = listOf(
        arrayOf("alic3", "bob", "3", "4", "00000"),
        arrayOf("1", "01", "001", "0001")
    )
    inputs.forEach { println(maximumValue(it)) }
}

private fun maximumValue(strs: Array<String>): Int {
    var result = 0
    strs.forEach { str ->
        val value = if (str.all { it.isDigit() }) str.toInt() else str.length
        if (result < value) result = value
    }
    return result
}