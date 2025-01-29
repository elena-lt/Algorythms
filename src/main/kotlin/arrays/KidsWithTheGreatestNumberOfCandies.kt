package arrays

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i]
 * represents the number of candies the ith kid has, and an integer extraCandies,
 * denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 *
 * Constraints:
 * n == candies.length
 * 2 <= n <= 100
 * 1 <= candies[i] <= 100
 * 1 <= extraCandies <= 50
 *
 * Source: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=problem-list-v2&envId=array
 *
 */
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val biggest = candies.max()
    val res = mutableListOf<Boolean>()
    for (i in candies.indices) {
        res.add(candies[i] + extraCandies >= biggest)
    }
    return res
}

fun main() {
    println(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3))
}
