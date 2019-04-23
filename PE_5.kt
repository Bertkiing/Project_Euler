package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/19
 */
class PE_5 {
    /**
     * NO use
     */
    fun isPrime(value: Long): Boolean {
        for (i in 2..Math.sqrt(value.toDouble()).toLong()) {
            if (value % i == 0L) {
                return false
            }
        }
        return true
    }

    /**
     * NO use
     */
    fun primeInRange(value: Long): ArrayList<Long> {
        var list = arrayListOf<Long>()
        for (i in 2..value) {
            if (isPrime(i)) {
                list.add(i)
            }
        }
        return list
    }


    fun judgeValueDivideByList(list: ArrayList<Long>, value: Long): Boolean {
        var i = 0
        while (i < list.size) {
            if (value % list[i] == 0L) {
//            println("==="+i)
                i++
            } else {
                break
            }
        }
        return i == list.size
    }
}


fun main(args: Array<String>) {
    var solution = PE_5()
    /**
     * 选择这个除数很重要
     */
    val list = arrayListOf<Long>(12, 14, 11, 13, 17, 19, 15, 16, 20, 18)

    println(list)
    /**
     * 这里建议阶段性测试
     */
    for (i in 10000..232792560) {
        if (solution.judgeValueDivideByList(list, i.toLong())) {
            println(i)
        }
    }
}

