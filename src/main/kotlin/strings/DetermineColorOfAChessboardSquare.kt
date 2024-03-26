package strings

/**
 * You are given coordinates, a string that represents the coordinates of a square of the chessboard.
 *
 * Return true if the square is white, and false if the square is black.
 *
 * The coordinate will always represent a valid chessboard square.
 * The coordinate will always have the letter first, and the number second.
 *
 * Example: coordinates = "a1" -> false
 *
 * Source: https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/
 */
fun main() {
    val inputs = listOf(
        "a1", //false
        "a2", //true,
        "h3", //true
    )

    inputs.forEach { println(squareIsWhiteV2(it)) }
}

fun squareIsWhite(coordinates: String): Boolean {
    val firstLine = (0..7)
        .map { ind -> ind.mod(2) != 0 }
    val columnsInd = ('a'..'h').toList()
    val map = columnsInd.indices.associateBy { columnsInd[it] }

    val chessboard = buildList {
        add(firstLine)
        var reverse = true
        repeat(7) {
            val list = if (reverse) {
                reverse = false
                firstLine.reversed()
            } else {
                reverse = true
                firstLine
            }
            add(list)

        }
    }

    val line = coordinates.last().toString().toInt() - 1
    val column = map[coordinates.first()]

    return column?.let { chessboard[line][it] } ?: false
}

fun squareIsWhiteV2(coordinates: String): Boolean {
    val mapToInt = ('a'..'h')
        .mapIndexed { index, c ->
            c to index + 1
        }.toMap()

    val line = coordinates.last().toString().toInt()
    val column = mapToInt[coordinates.first()]

    val lineEqual = line.mod(2) == 0
    val columnEqual = column?.mod(2) == 0

    return when {
        !lineEqual && !columnEqual -> false
        else -> lineEqual != columnEqual
    }
}
