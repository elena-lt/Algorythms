package strings

/**
 * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.
 * date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.
 * Return the binary representation of date.
 *
 * Example: Input: date = "2080-02-29". Output: "100000100000-10-11101"
 *
 * Constraints:
 * date.length == 10
 * date[4] == date[7] == '-', and all other date[i]'s are digits.
 * The input is generated such that date represents a valid Gregorian calendar date between Jan 1st, 1900 and Dec 31st, 2100 (both inclusive).
 *
 * Source: https://leetcode.com/problems/convert-date-to-binary/description/?envType=problem-list-v2&envId=string
 */
//Time complexity: O(n)
fun convertDateToBinary(date: String): String {
    val y = date.substring(0, 4)
    val m = date.substring(5, 7)
    val d = date.substring(8, 10)

    return "${y.toInt().toString(2)}-${m.toInt().toString(2)}-${d.toInt().toString(2)}"
}