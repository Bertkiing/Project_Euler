package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/18
 */
class PE_1(var number: Int) {

    fun sum(): Int {
        var sum = 0
        for (i in 0 until number) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i
            }
        }
        return sum
    }

    /**
     * Good Solution
     */
    fun sumDiv(n: Int): Int {
        var p = (number - 1) / n
        return n * (p * (p + 1)) / 2
    }

}

fun main(args: Array<String>) {
    var solution = PE_1(16)
    println(solution.sum())
    println("-----------------------")
    println(solution.sumDiv(3) + solution.sumDiv(5) - solution.sumDiv(15))

}