package strings

/**
 * You are given a 0-indexed array words consisting of distinct strings.
 * The string words[i] can be paired with the string words[j] if:
 * The string words[i] is equal to the reversed string of words[j].
 * 0 <= i < j < words.length.
 * Return the maximum number of pairs that can be formed from the array words.
 *
 * Note that each string can belong in at most one pair.
 *
 * Constraints:
 * 1 <= words.length <= 50
 * words[i].length == 2
 * words consists of distinct strings.
 * words[i] contains only lowercase English letters.
 *
 * Source: https://leetcode.com/problems/find-maximum-number-of-string-pairs/submissions/1549851123/?envType=problem-list-v2&envId=string
 */
fun maximumNumberOfStringPairs(words: Array<String>): Int {
    var count = 0
    for (i in 0 until words.size - 1) {
        for (j in i + 1 until words.size) {
            if (words[i][0] == words[j][1] && words[i][1] == words[j][0]) {
                count++
            }
        }
    }
    return count
}