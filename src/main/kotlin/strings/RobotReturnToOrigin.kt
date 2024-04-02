package strings

/**
 * There is a robot starting at the position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 *
 * You are given a string moves that represents the move sequence of the robot
 * where moves[i] represents its ith move.
 * Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
 *
 * Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
 *
 * Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot
 * move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude
 * of the robot's movement is the same for each move.
 *
 * Example:
 * Input: moves = "UD" -> Output: true
 * Input: moves = "LL" -> Output: false
 *
 * Constraints:
 * - 1 <= moves.length <= 2 * 104
 * - moves only contains the characters 'U', 'D', 'L' and 'R'.
 *
 * Source: https://leetcode.com/problems/robot-return-to-origin/description/
 */
fun main() {
    val input = listOf("UD", "LL")
    input.forEach { println(judgeCircle(it)) }
}

fun judgeCircle(moves: String): Boolean {
    var x = 0
    var y = 0

    moves.toCharArray().forEach {
        when (it) {
            'U' -> x++
            'D' -> x--
            'L' -> y--
            'R' -> y++
        }
    }

    return x == 0 && y == 0
}