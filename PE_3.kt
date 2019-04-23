package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE_3 {
    fun isPrime(value: Long): Boolean {
        for (i in 2..Math.sqrt(value.toDouble()).toLong()) {
            if (value % i == 0L) {
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = PE_3()
    val value = 600851475143

    var primeIn100 = arrayListOf<Long>()
    for (i in 2L..Math.sqrt(value.toDouble()).toLong()) {
        if (solution.isPrime(i)) {
            primeIn100.add(i)
            println(("The id is$i:${solution.isPrime(i)}"))
        }
    }

    println("---------------------")

    println("The 600851475143 is Prime? " + solution.isPrime(600851475143))

    primeIn100.reversed().forEach { it ->
        if (value % it == 0L) {
            println(it)
        }
    }
}