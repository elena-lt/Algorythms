package strings

/**
 * Given an array of strings 'words' and a character 'separator', split each string in 'words' by 'separator'.
 * Return an array of strings containing the new strings formed after the splits, excluding empty strings.
 *
 * Notes:
 *
 * - separator is used to determine where the split should occur, but it is not included as part
 * of the resulting strings.
 * - A split may result in more than two strings.
 * - The resulting strings must maintain the same order as they were initially given.
 *
 * Example:
 * Input: words = ["one.two.three","four.five","six"], separator = "."
 * Output: ["one","two","three","four","five","six"]
 */
fun main() {
    val inputs = arrayOf(
        listOf("one.two.three", "four.five", "six") to '.',
        listOf("\$easy$", "\$problem$") to '$',
        listOf("|||") to '|' //[]
    )

    inputs.forEach { println(splitWordsBySeparatorV2(it.first, it.second)) }
}

fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
    return words.map {
        it.split(separator).filterNot { it.isEmpty() }
    }
        .flatten()
}

fun splitWordsBySeparatorV2(words: List<String>, separator: Char): List<String> {
    val result = mutableListOf<String>()

    for (word in words) {
        var startIndex = 0
        while (startIndex < word.length) {
            val separatorInd = word.indexOf(separator, startIndex)
            if (separatorInd == -1) {
                val subStr = word.substring(startIndex)
                if (subStr.isNotEmpty()) {
                    result.add(subStr)
                }
                break
            } else {
                val subStr = word.substring(startIndex, separatorInd)
                if (subStr.isNotBlank()) {
                    result.add(subStr)
                }
                startIndex = separatorInd + 1
            }
        }
    }

    return result
}