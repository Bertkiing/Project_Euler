package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE_6 {
    fun sum4squares(value: Int): Int {
        var sum = 0
        for (i in 1..value) {
            sum += Math.pow(i.toDouble(), 2.toDouble()).toInt()
        }
        return sum
    }

    fun sumSquare(value: Int): Int {
        var sum = (value + 1) * value / 2
        return Math.pow(sum.toDouble(), 2.toDouble()).toInt()
    }
}

fun main(args: Array<String>) {
    val pe6 = PE_6()
    println("1至100的平方的和:" + pe6.sum4squares(100))
    println("1..100和的平方:" + pe6.sumSquare(100))
    println("两者的差值:${pe6.sumSquare(100) - pe6.sum4squares(100)}")
}