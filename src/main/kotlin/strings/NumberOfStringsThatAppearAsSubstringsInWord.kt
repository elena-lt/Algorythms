package strings

/**
 * Given an array of strings patterns and a string word,
 * return the number of strings in patterns that exist as a substring in word.
 * A substring is a contiguous sequence of characters within a string.
 *
 * Example:
 * patterns = ["a","abc","bc","d"], word = "abc" -> Output: 3
 * patterns = ["a","b","c"], word = "aaaaabbbbb" -> Output: 2
 * patterns = ["a","a","a"], word = "ab" -> Output: 2
 *
 * Source: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
 */
fun main() {
    val inputs = listOf(
//        arrayOf("a", "b", "c") to "aaaaabbbbb",
//        arrayOf("a", "abc", "bc", "d") to "abc",
//        arrayOf("a", "a", "a") to "ab",
        arrayOf(/*yes*/"dojsf", /*yes*/"v", /*yes*/"hetnovaoigv", /*yes*/"ksvqfdojsf",
            /*yes*/"hetnovaoig", "yskjs", /*yes*/"sfr", "msurztkvppptsluk", "ndxffbkkvejuakduhdcfsdbgbt",
            "znhdgtwzbnh", /*yes*/"h", "ocaualfiscmbpnfalypmtdppymw", "w", /*yes*/"o", /*yes*/"sfjksvqfdo",
            "odqvzuc", "bozawheajcmlewptgssueylcxhx", "bno", "jhmarzsphxduvdktzqjiz", /*yes*/"j",
            /*yes*/"sfrjhetnov", "vxv", /*yes*/"ksvqfd", "ognwvqtadalmav", "yqbspvfwmvhycmghabigl", "qyfaiazgdqaw",
            /*yes*/"ojsfrj", /*yes*/"ojsfrjhetn", /*yes*/"fdojs", /*yes*/"do", /*yes*/"ovaoig", /*yes*/"k", "vrh",
            /*yes*/"jsfrjhetnovaoigvgk") to "csfjksvqfdojsfrjhetnovaoigvgk"
    )

    inputs.forEach { (patterns, word) ->
        println(numOfStrings(patterns, word))
    }
}

fun numOfStrings(patterns: Array<String>, word: String): Int {
    return patterns.count { pattern -> word.contains(pattern) }
}

