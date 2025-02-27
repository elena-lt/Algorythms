package arrays

/**
 * Given an integer array hours representing times in hours, return an integer denoting
 * the number of pairs i, j where i < j and hours[i] + hours[j] forms a complete day.
 * A complete day is defined as a time duration that is an exact multiple of 24 hours.
 * For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.
 *
 * Example: Input: hours = [12,12,30,24,24]. Output: 2
 *
 * Constraints:
 * 1 <= hours.length <= 100
 * 1 <= hours[i] <= 109
 *
 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/description/?envType=problem-list-v2&envId=array
 */
fun countCompleteDayPairs(hours: IntArray): Int {
    var count = 0

    for (i in 0 until hours.size - 1) {
        for (n in i + 1 until hours.size) {
            val res = (hours[i] + hours[n]) % 24
            if (res == 0) {
                count++
            }
        }
    }
    return count
}

fun countCompleteDayPairsV2(hours: IntArray): Int {
    val freq = mutableMapOf<Int, Int>()
    var count = 0

    for (hour in hours) {
        val rem = hour % 24 //0
        val complement = (24 - rem) % 24
        count += freq.getOrDefault(complement, 0)
        freq[rem] = freq.getOrDefault(rem, 0) + 1
    }

    return count
}