package arrays

/**
 * Given an integer n, return any array containing n unique integers such that they add up to 0
 *
 * Example: Input: n = 5. Output: [-7,-1,1,3,4]
 *
 * Constraints:
 * 1 <= n <= 1000
 *
 * Source: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=problem-list-v2&envId=array
 */
fun sumZero(n: Int): IntArray {
    val res = IntArray(n)

    var ind = 0
    for (i in 0..n / 2) {
        if (i == 0) {
            if (n % 2 > 0) {
                res[ind] = i
                ind++
            }
        } else {
            res[ind] = i
            res[ind + 1] = -i
            ind += 2
        }
    }
    return res
}