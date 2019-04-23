package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 * 回文数 9009 or 1005001
 */
class PE_4 {

    fun isPalindrome(value: Int): Boolean {
        val string = value.toString()
        var splitIndex = string.length / 2
        val header = string.substring(0, splitIndex)
        val tail = string.reversed().substring(0, splitIndex)
//        println("header : $header")
//        println("tail : $tail")
        return header == tail
    }
}

fun main(args: Array<String>) {
    val solution = PE_4()
    println(solution.isPalindrome(90109))

    var max = 1
    for (i in 999 downTo 500) {
        for (j in 999 downTo 500) {
            if (solution.isPalindrome(i * j)) {
                if (i * j > max) {
                    max = i * j
                }
                println("i=${i} * j=${j} =" + i * j)
            }
        }
    }
    println("The max is $max")

}