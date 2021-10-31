import java.io.File

fun main() {
    val vals = arrayOf<Int>(5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    var cash = File("src/main/kotlin/bankovkyInput.txt").readText().toInt()
    var c = 0
    while (cash > 0) {
        var x = 0
        while (cash < vals[x]) {
            x++
        }
        println(vals[x])
        cash -= vals[x]
        c++
    }
    println("$c bankovek/mincí")
}