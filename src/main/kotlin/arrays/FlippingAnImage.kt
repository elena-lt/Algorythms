package arrays

/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 * Constraints:
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 *
 * Source: https://leetcode.com/problems/flipping-an-image/submissions/1552066102/?envType=problem-list-v2&envId=array
 */
//Time complexity: O(nm) = n == image.size; m == max size of each image.
fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val res = Array(image.size) { intArrayOf() }

    for (i in image.indices) {
        val temp = IntArray(image[i].size)
        for (n in image[i].size - 1 downTo 0) {
            val ind = (image[i].size - 1) - n
            temp[ind] = if (image[i][n] == 1) 0 else 1
        }
        res[i] = temp
    }
    return res
}

fun main() {
    println(
        flipAndInvertImage(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 0, 1),
                intArrayOf(0, 0, 0)
            )
        )
            .map { it.toList() }
    )
}