package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE25 {
    fun fibonacci(num: Int): Long {
        return when (num) {
            1,2 -> {
                1
            }
            else -> {
                fibonacci(num - 1) + fibonacci(num - 2)
            }
        }
    }

}

fun main(args: Array<String>) {
    val solution = PE25()
    for (i in 1..400) {
            println(solution.fibonacci(i))
    }
}