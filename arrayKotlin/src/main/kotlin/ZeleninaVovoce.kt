import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    println("zadejte počet ovoce")
    val n = sc.nextInt()
    val fruit = Array<String>(n){""}

    for (x in fruit.indices) {
        println("zadejte ${x+1}. ovoce")
        var prosteProcBuffer = sc.nextLine()
        fruit[x] = sc.nextLine()
    }
    println("zadejte počet zeleniny")
    val m = sc.nextInt()
    val vegetable = Array<String>(m) {""}
    for (x in vegetable.indices) {
        println("Zadejte ${x+1}. zeleninu")
        val prosteProcBuffer = sc.nextLine()
        vegetable[x] = (sc.nextLine())
    }
    println("zadávejte rostlinné druhy")
    var plant = ""
    while (sc.hasNext() && plant != "END") {
        plant = sc.nextLine()
        if (fruit.contains(plant)) {
            println("ovoce")
        }
        if (vegetable.contains(plant)) {
            println("zelenina")
        }
        if (!fruit.contains(plant) && !vegetable.contains(plant) && plant != "END") {
            println("ostatní")
        }
    }
}