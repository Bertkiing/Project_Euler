package kotlin_practice

/**
 * @author bertking
 * @date 2019/4/23
 */
class PE44 {

    companion object {

        fun pentagonalNumber(n: Int): Int {
            return n * (3 * n - 1) / 2
        }

        fun getP(): ArrayList<Int> {
            var list = ArrayList<Int>()
            for (i in 1..5000) {
                list.add(pentagonalNumber(i))
            }
            return list
        }

        fun checkP() {
            getP().reversed().forEach { big ->
                getP().forEach {
                    var sub = big - it
                    var sum = big + it
                    if (getP().contains(sub) && getP().contains(sum)) {
                        println("big:$big,it=$it")
                        println("sub : ${big-it}")
                    }
                }
            }


        }

    }

}

/**
 * 20min
 */
fun main(args: Array<String>) {
    PE44.checkP()

    println(7042750-1560090) // 5482660
}