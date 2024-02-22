package strings

/**
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret:
 *  - "G" as the string "G"
 *  - "()" as the string "o"
 *  - "(al)" as the string "al".
 *
 * The interpreted strings are then concatenated in the original order.
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 *
 * Source: https://leetcode.com/problems/goal-parser-interpretation/description/
 */
fun main() {
    val result = interpret("G()(al)")
    println(result)
}

fun interpret(command: String): String {
    var result = ""
    var index = 0
    while (index < command.length) {
        when {
            command[index] == 'G' -> {
                result += "G"
                index++
            }
            command[index] == '(' && command[index + 1] == ')' -> {
                result += "o"
                index += 2
            }

            else -> {
                result += "al"
                index += 4
            }
        }
    }

    return result
}
