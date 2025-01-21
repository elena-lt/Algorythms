package arrays

import kotlin.math.max

/**
 * You are given an m x n integer grid accounts where `accounts[i][j]` is the amount
 * of money the iTH customer has in the jTH bank. Return the wealth that the richest customer has.
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 *
 * Example: Input: accounts = [[1,2,3],[3,2,1]], Output: 6
 *
 * Constraints:
 *
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 *
 * Source: https://leetcode.com/problems/richest-customer-wealth/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val input = listOf(
        arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)), //6
        arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)), //10
    )
}

/**
 * Time complexity: O(n*m)
 */
private fun maximumWealthv2(accounts: Array<IntArray>): Int {
    var max = 0
    for (i in accounts.indices) {
        var sum = 0
        for (j in 0 until accounts[i].size) {
            sum += accounts[i][j]
        }
        max = max(max, sum)
    }
    return max
}

/**
 * Time complexity: O(n*m)
 */
private fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
    accounts.forEach {
        val summed = it.sum()
        if (summed > max) max = summed
    }
    return max
}