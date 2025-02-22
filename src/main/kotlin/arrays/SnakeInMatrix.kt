package arrays

/**
 * There is a snake in an n x n matrix grid and can move in four possible directions.
 * Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.
 * The snake starts at cell 0 and follows a sequence of commands.
 *
 * You are given an integer n representing the size of the grid and an array of strings commands
 * where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT".
 * It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
 * Return the position of the final cell where the snake ends up after executing commands.
 */
fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
    var y = 0
    var x = 0

    for (command in commands) {
        when (command) {
            "UP" -> y--
            "RIGHT" -> x++
            "DOWN" -> y++
            "LEFT" -> x--
        }
    }

    return (y * n) + x
}