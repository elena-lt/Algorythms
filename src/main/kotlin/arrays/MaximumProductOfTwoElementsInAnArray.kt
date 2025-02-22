package arrays

fun maxProduct(nums: IntArray): Int {
    var maxInd1 = 0 //1
    var maxInd2 = 1 //3

    for (i in 2 until nums.size) {
        if (nums[i] > nums[maxInd2] || nums[i] > nums[maxInd1]) {
            when {
                nums[i] > nums[maxInd2] && nums[maxInd2] >= nums[maxInd1] -> {
                    maxInd1 = maxInd2
                    maxInd2 = i
                }

                nums[i] > nums[maxInd2] && nums[maxInd2] < nums[maxInd1] -> {
                    maxInd2 = i
                }

                nums[i] > nums[maxInd1] && nums[i] > nums[maxInd1] -> {
                    maxInd1 = maxInd2
                    maxInd2 = i
                }
            }
        }
    }
    return (nums[maxInd1] - 1) * (nums[maxInd2] - 1)
}

fun maxProductv2(nums: IntArray): Int {
    var max1 = 0
    var max2 = 0

    for (num in nums) {
        if (num > max1) {
            max2 = max1
            max1 = num
        } else if (num > max2) {
            max2 = num
        }
    }
    return (max1 - 1) * (max2 - 1)
}

fun main() {
    println(maxProductv2(intArrayOf(2, 2, 1, 8, 1, 5, 4, 5, 2, 10, 3, 6, 5, 2, 3)))
    println(maxProduct(intArrayOf(1, 5, 4, 5)))
}