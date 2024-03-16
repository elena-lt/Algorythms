package strings

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi]
 * means there exists a direct path going from cityAi to cityBi.
 * Return the destination city, that is, the city without any path outgoing to another city.
 *
 * It is guaranteed that the graph of paths forms a line without any loop,
 * therefore, there will be exactly one destination city.
 *
 * Example:
 * paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] -> Output: "Sao Paulo"
 * paths = [["B","C"],["D","B"],["C","A"]] -> Output: "A"
 * paths = [["A","Z"]] -> Output: "Z"
 *
 * Source: https://leetcode.com/problems/destination-city/
 */
fun main() {
    val inputs = listOf(
        listOf(
            listOf("London", "New York"),
            listOf("New York", "Lima"),
            listOf("Lima", "Sao Paulo")
        ),
        listOf(listOf("B", "C"), listOf("D", "B"), listOf("C", "A")),
        listOf(listOf("A", "Z"))
    )

    inputs.forEach { println(destCity(it)) }
}

fun destCity(paths: List<List<String>>): String {
    val startCity = mutableListOf<String>()
    val dest = mutableListOf<String>()
    paths.map {
        startCity.add(it.first())
        dest.add(it.last())
    }

    return dest.find { it !in startCity } ?: ""
}