package strings

/**
 * You are given a string num consisting of only digits. A string of digits is called balanced
 * if the sum of the digits at even indices is equal to the sum of digits at odd indices.
 * Return true if num is balanced, otherwise return false.
 *
 * Example: Input: num = "1234". Output: false
 *
 * Constraints:
 * 2 <= num.length <= 100
 * num consists of digits only
 *
 * Source: https://leetcode.com/problems/check-balanced-string/description/?envType=problem-list-v2&envId=string
 */
fun isBalanced(num: String): Boolean {
    var oddSum = 0
    var evenSum = 0

    for (i in num.indices) {
        if (i % 2 == 0) evenSum += num[i].digitToInt() else oddSum += num[i].digitToInt()
    }

    return oddSum == evenSum
}