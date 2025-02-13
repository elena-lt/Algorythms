package arrays

/**
 * There is a hidden integer array arr that consists of n non-negative integers.
 * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1].
 * For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 *
 * You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
 *
 * Return the original array arr. It can be proved that the answer exists and is unique.
 *
 * Source: https://leetcode.com/problems/decode-xored-array/description/?envType=problem-list-v2&envId=array
 */
//XOR has the property that:
//A⊕B=C ⇒ C⊕A=B
fun decode(encoded: IntArray, first: Int): IntArray {
    val arr = IntArray(encoded.size + 1)
    arr[0] = first

    for (i in 0 until encoded.size) {
        val a = arr[i]
        val b = encoded[i]
        arr[i + 1] = b xor a
    }
    return arr
}