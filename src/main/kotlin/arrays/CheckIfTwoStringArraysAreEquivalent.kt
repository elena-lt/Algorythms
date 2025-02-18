package arrays

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 * Example: Input: word1 = ["ab", "c"], word2 = ["a", "bc"]. Output: true
 *
 * Constraints:
 * 1 <= word1.length, word2.length <= 103
 * 1 <= word1[i].length, word2[i].length <= 103
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 103
 * word1[i] and word2[i] consist of lowercase letters.
 *
 * Source: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/1546696362/?envType=problem-list-v2&envId=array
 */
fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    var str1 = ""
    for(i in 0 until word1.size){
        str1+= word1[i]
    }

    var str2 = ""
    for(i in 0 until word2.size){
        str2 += word2[i]
    }

    return str1.equals(str2)
}