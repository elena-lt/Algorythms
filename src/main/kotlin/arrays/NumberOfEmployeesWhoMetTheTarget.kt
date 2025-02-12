package arrays

/**
 * There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
 * The company requires each employee to work for at least target hours.
 * You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
 * Return the integer denoting the number of employees who worked at least target hours.
 *
 * Example: Input: hours = [0,1,2,3,4], target = 2. Output: 3
 *
 * Constraints:
 * 1 <= n == hours.length <= 50
 * 0 <= hours[i], target <= 105
 *
 * Source: https://leetcode.com/problems/number-of-employees-who-met-the-target/description/?envType=problem-list-v2&envId=array
 */
fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
//    var res = 0
//    hours.forEach { h -> if (h >= target) res++ }
//    return res
//Time complexity: O(n)
    return hours.count { it >= target }
}