/**
 * Средняя (3 балла)
 *
 * Найти скалярное произведение двух векторов равной размерности,
 * представленные в виде списков a и b. Скалярное произведение считать по формуле:
 * C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.
 */
fun main() {
    val list1: List<Int> = listOf(5, 6, 7, 8, 9)
    val list2: List<Int> = listOf(1, 2, 0, 3, 9)

    println(times(list1, list2))
}
fun times(list1: List<Int>, list2: List<Int>): Int =
    when {

        list1.isEmpty() || list2.isEmpty() -> 0
        else -> {
            var total = 0
            list1.indices.forEach { i ->
                total += list1[i] * list2[i]
            }
           total
        }
    }