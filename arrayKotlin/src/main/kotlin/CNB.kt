import kotlin.math.round

fun main(){
    val  cnb = CNBInput()
    val input = cnb.getInput()
    for (s in input) {
        val num = (1 / s[4].toDouble()).round(5)
        println("${s[1]} = $num CZK")
        println("30 CZK = ${(30 * num).round(5)} ${s[1]}")
    }
}

//funkce z: https://discuss.kotlinlang.org/t/how-do-you-round-a-number-to-n-decimal-places/8843
fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}