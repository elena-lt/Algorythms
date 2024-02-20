package strings

/**
 * There is a programming language with only four operations and one variable X:
 *
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 *
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 *
 * Source: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 */
fun main() {
    println(finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
}

/**
 * Complexity: O(n)
 */
fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0

    operations.forEach { operation ->
        if (operation.contains("+")) x++ else x--
    }
    return x
}