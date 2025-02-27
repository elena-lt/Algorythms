package arrays

/**
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 *
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 *
 * - An integer x -> Record a new score of x.
 * '+' -> Record a new score that is the sum of the previous two scores.
 * 'D' -> Record a new score that is the double of the previous score.
 * 'C' -> Invalidate the previous score, removing it from the record.
 *
 * Return the sum of all the scores on the record after applying all the operations.
 *
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
 *
 * Example: Input: ops = ["5","2","C","D","+"]. Output: 30
 *
 * Constraints:
 * 1 <= operations.length <= 1000
 * operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
 * For operation "+", there will always be at least two previous scores on the record.
 * For operations "C" and "D", there will always be at least one previous score on the record.
 *
 * Source: https://leetcode.com/problems/baseball-game/description/?envType=problem-list-v2&envId=array
 */
fun calPoints(operations: Array<String>): Int {
    val res = IntArray(operations.size)

    var currInd = 0
    for (i in operations) {
        when (i) {
            "+" -> {
                res[currInd] = res[currInd - 1] + res[currInd - 2]
                currInd++
            }

            "C" -> {
                currInd--
                res[currInd] = 0
            }

            "D" -> {
                res[currInd] = res[currInd - 1] * 2
                currInd++
            }

            else -> {
                res[currInd] = i.toInt()
                currInd++
            }
        }
    }

    var count = 0
    for (i in res) {
        count += i
    }
    return count
}