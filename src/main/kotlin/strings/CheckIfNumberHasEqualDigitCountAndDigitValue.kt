package strings

/**
 * You are given a 0-indexed string 'num' of length 'n' consisting of digits.
 *
 * Return true if for every index 'i' in the range 0 <= i < n, the digit i occurs num[i] times in num,
 * otherwise return false.
 *
 * Example:
 * Input: num = "1210"
 * Output: true
 * Explanation:
 * num[0] = '1'. The digit 0 occurs once in num.
 * num[1] = '2'. The digit 1 occurs twice in num.
 * num[2] = '1'. The digit 2 occurs once in num.
 * num[3] = '0'. The digit 3 occurs zero times in num.
 * The condition holds true for every index in "1210", so return true.
 *
 * Source: https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
 */
fun main() {
    val inputs = listOf(
        "1210",
        "030"
    )
    inputs.forEach { println(digitCount(it)) }
}

fun digitCount(num: String): Boolean {
    val nums = IntArray(10) { 0 }
    val res = BooleanArray(num.length) { false }
    num.forEach { nums[it - '0']++ }
    num.forEachIndexed { ind, c ->
        res[ind] = nums[ind] == c - '0'
    }
    return res.all { it }
}