package arrays

import kotlin.math.min

/**
 * You are given an integer array prices where prices[i] is the price of the ith item in a shop.
 * There is a special discount for items in the shop. If you buy the ith item, then you will receive
 * a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i].
 * Otherwise, you will not receive any discount at all.
 * Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop,
 * considering the special discount.
 *
 * Example: Input: prices = [8,4,6,2,3]. Output: [4,2,4,2,3]
 *
 * Constraints:
 * 1 <= prices.length <= 500
 * 1 <= prices[i] <= 1000
 */
//Time complexity: O(n^2)
fun finalPrices(prices: IntArray): IntArray {
    val answer = IntArray(prices.size)

    for (i in prices.indices) {
        answer[i] = prices[i]
        for (n in i + 1 until prices.size) {
            if (prices[i] >= prices[n]) {
                answer[i] = prices[i] - prices[n]
                break
            }
        }
    }
    return answer
}