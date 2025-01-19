package arrays

/**
 * There is a programming language with only four operations and one variable X:
 *
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 *
 * Constraints:
 * 1 <= operations.length <= 100
 * operations[i] will be either "++X", "X++", "--X", or "X--".
 *
 * Source: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=problem-list-v2&envId=array
 */
fun main() {
    val inputs = listOf(
        arrayOf("--X", "X++", "X++"), //1
        arrayOf("X++", "++X", "--X", "X--"), //0
    )

    inputs.forEach { println(finalValueAfterOperations(it)) }
}

/**
 * Time complexity: O(n)
 * Space: O(1)
 */
fun finalValueAfterOperations(operations: Array<String>): Int {
    var result = 0
    operations.forEach {
      if (it[0] == '+' || it[2] == '+') result++ else result--
    }
    return result
}