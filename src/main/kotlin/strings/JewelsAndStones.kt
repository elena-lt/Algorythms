package strings

/**
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * - 1 <= jewels.length, stones.length <= 50
 * - jewels and stones consist of only English letters.
 * - All the characters of jewels are unique.
 *
 * Source: https://leetcode.com/problems/jewels-and-stones/description/
 */
fun main() {
    val jewelsInStonesNum = numJewelsInStones(jewels = "aA", stones = "aAAbbbb")
    println(jewelsInStonesNum)
}

fun numJewelsInStones(jewels: String, stones: String): Int {
    val jewelsTypes = jewels.toCharArray()
    return stones.count { jewelsTypes.contains(it) }
}