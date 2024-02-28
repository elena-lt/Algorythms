package strings

/**
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item.
 * You are also given a rule represented by two strings, ruleKey and ruleValue.
 *
 * The i(th) item is said to match the rule if one of the following is true:
 *
 * ruleKey == "type" and ruleValue == type(i).
 * ruleKey == "color" and ruleValue == color(i).
 * ruleKey == "name" and ruleValue == name(i).
 * Return the number of items that match the given rule.
 *
 * Example:
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
 * ruleKey = "color",
 * ruleValue = "silver"
 * Result: 1
 * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 *
 * Source: https://leetcode.com/problems/count-items-matching-a-rule/description/
 */
fun main() {
    val result1 =
        countMatches(
            items = listOf(
                listOf("phone", "blue", "pixel"),
                listOf("computer", "silver", "lenovo"),
                listOf("phone", "gold", "iphone")
            ),
            ruleKey = "color",
            ruleValue = "silver"
        )

    println(result1)
}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var result = 0
    val ind = when (ruleKey) {
        "type" -> 0
        "color" -> 1
        else -> 2
    }

    items.forEach { item -> if (item[ind] == ruleValue) result++ }

    return result
}