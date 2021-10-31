fun main() {
    val aocInp = AocInput()
    val input: Array<Array<String>> = aocInp.getInput()
    var res = 0
    var res2 = 0
    for (s in input) {
        println(s)
        res += aoc1(s[0].toInt(), s[1].toInt(), s[2].toInt())
        res2 += aoc2(s[0].toInt(), s[1].toInt(), s[2].toInt())
    }
    println(res)
    println(res2)
}

fun aoc1(l: Int,w: Int, h: Int):Int{
    val arr = arrayOf(l,w,h)
    arr.sort()
    return 2*l*w + 2*w*h + 2*h*l + arr[0]*arr[1];
}

fun aoc2(l: Int,w: Int, h: Int):Int{
    val arr = arrayOf(l,w,h)
    arr.sort()
    return l*w*h + 2*(arr[0]+arr[1]);
}