package kotlin_practice

import java.math.BigDecimal

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE25 {
    /**
     * 根据序号来求斐波那契数列
     */
    fun fibonacci(num: Long): Long {
        return when (num) {
            1L, 2L -> {
                1
            }
            else -> {
                fibonacci(num - 1) + fibonacci(num - 2)
            }
        }
    }


    companion object {
        val param = Math.sqrt(5.0) / 5

        val p1 = (1 + Math.sqrt(5.0)) / 2

        val p2 = (1 - Math.sqrt(5.0)) / 2
    }

    fun fibonacci2(n: Long): String {
        return (BigDecimal(param.toString()).multiply(BigDecimal(Math.pow(p1, n.toDouble()).toString())).subtract( BigDecimal(Math.pow(p2, n.toDouble())))).toString()
    }


}

fun main(args: Array<String>) {
    val solution = PE25()

//    println(solution.fibonacci(139583862445, 225851433717))


//    println(solution.fibonacci2(56)) //225851433717

    println(solution.fibonacci2(1500))

    val bigDecimal = BigDecimal(solution.fibonacci2(1500))
    println(bigDecimal.toPlainString().length)


//    var n = 56L
//    while (solution.fibonacci2(n).toString().length<1000){
//        println(solution.fibonacci2(n))
//        n ++
//    }
//    var len = 1000
//    for (i in 1000..100000000000L) {
//        if (solution.fibonacci2(i).length == 1000) {
//            print(" i = $i")
//        }
//    }
}