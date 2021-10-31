import java.util.*

fun main (){
    val sc = Scanner(System.`in`);
    println("Kolik čísel budete zadávat?")
    val count = sc.nextInt()
    val arr = Array<Int>(count){0}
    val duplicityArr = Array<Int>(count){0}
    println("Zadejte $count čísel")
    for(x in 0 until count){
        arr[x] = sc.nextInt()
    }
    for(x in arr.indices){
        for(duplicityIndex in x+1 until arr.size){
            if(arr[x] == arr[duplicityIndex] && !duplicityArr.contains(arr[x])){
                println("Duplicta: " + arr[x])
                duplicityArr[x] = arr[x]
            }
        }
    }
}