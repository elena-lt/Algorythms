package arrays

/**
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 *
 * The ith item is said to match the rule if one of the following is true:
 *
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 *
 * Example:
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output: 1
 *
 * Constraints:
 * 1 <= items.length <= 104
 * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
 * ruleKey is equal to either "type", "color", or "name".
 * All strings consist only of lowercase letters.
 */

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0
    for (i in 0 until items.size) {
        val value = when (ruleKey) {
            "type" -> items[i][0]
            "color" -> items[i][1]
            "name" -> items[i][2]
            else -> Unit
        }
        if (value == ruleValue) count++
    }

    return count
}