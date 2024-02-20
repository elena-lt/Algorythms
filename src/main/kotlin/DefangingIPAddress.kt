package org.example

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 * LeetCode: https://leetcode.com/problems/defanging-an-ip-address/description/
 */
fun main() {
    println(defangIPaddr("1.1.1.1"))
}

fun defangIPaddr(address: String): String {
    return buildString {
        address.onEach {
            if (it == '.') this.append("[.]") else this.append(it.toString())
        }
    }
}

fun defangIPaddrV2(address: String): String {
    return address.replace(".", "[.]")
}
