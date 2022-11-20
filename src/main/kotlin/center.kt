import java.util.*

/**
 * Средняя (3 балла)
 *
 * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
 * Если список пуст, не делать ничего. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
fun main() {
    var numbers: MutableList<Double> = mutableListOf(5.0, 6.0, 7.0, 8.0, 9.0)

    println(center(numbers))
}
fun center(mutlist: MutableList<Double>): MutableList<Double> {
    val newList = when {
        mutlist.isEmpty() -> mutlist
        else -> {
            val averageSum = mutlist.average()
            mutlist.replaceAll { it - averageSum}

            mutlist
        }
    }
    return newList
}

