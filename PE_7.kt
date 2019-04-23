package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE_7 {
    fun isPrime(value: Long): Boolean {
        for (i in 2..Math.sqrt(value.toDouble()).toLong()) {
            if (value % i == 0L) {
                return false
            }
        }
        return true
    }

    fun primeInRange(length: Int) {
        var list = arrayListOf<Int>()
        var range = 100
        var start = 2

        while (list.size < length){
            for (i in start..range) {
                if (isPrime(i.toLong())) {
                    println("prime number:$i")
                    if (list.size < length) {
                        list.add(i)
                    } else {
                        break
                    }
                }
            }
            start = range
            range *= 10
            println("range == $range")
        }
        println(list.last())
    }
}

fun main(args: Array<String>) {
    val pe_7 = PE_7()
    pe_7.primeInRange(10001)


}