package strings

/**
 * Given a date string in the form Day Month Year, where:
 *
 * Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
 * Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
 * Year is in the range [1900, 2100].
 * Convert the date string to the format YYYY-MM-DD, where:
 *
 * YYYY denotes the 4 digit year.
 * MM denotes the 2 digit month.
 * DD denotes the 2 digit day.
 *
 * Example: Input: date = "20th Oct 2052". Output: "2052-10-20"
 *
 * Constraints:
 * The given dates are guaranteed to be valid, so no error handling is necessary.
 *
 * Source: https://leetcode.com/problems/reformat-date/description/?envType=problem-list-v2&envId=string
 */
fun reformatDate(date: String): String {
    val months =
        arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")

    val splited = date.split(" ")
    val year = splited[2]
    val monthInd = months.indexOf(splited[1])
    val month: String = if (monthInd + 1 < 10) "0${monthInd + 1}" else (monthInd + 1).toString()
    val day = if (splited[0][1].isDigit()) "${splited[0][0]}${splited[0][1]}" else "0${splited[0][0]}"

    return "$year-$month-$day"
}