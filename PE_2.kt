package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/18
 */
class PE_2 {
    fun fibonacci(num: Int): Int {
        return when (num) {
            0, 1 -> {
                1
            }
            else -> {
                fibonacci(num - 1) + fibonacci(num - 2)
            }
        }
    }



}

fun main(args: Array<String>) {
    val solution = PE_2()
    var sum = 0
//    for (i in 0..4000000) {
//        if (solution.fibonacci(i) % 2 == 0) {
//            sum += i
//        }
//    }



    Thread{
        run {
            println("------------")
            var sum = 0
            for(i in 0.. 34){
                if (solution.fibonacci(i) % 2 == 0) {
                    println(solution.fibonacci(i))
                    sum += solution.fibonacci(i)
                }
            }
            println("Sum = $sum")
        }
    }.start()
}