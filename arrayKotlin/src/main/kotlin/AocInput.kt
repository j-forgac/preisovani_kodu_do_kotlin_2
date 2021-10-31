class AocInput {
    val input: String =""
    fun getInput(): Array<Array<String>> {
        val input2: Array<String> = input.split("\n").toTypedArray()
        val output = Array(input2.size) { Array(3) { "" } }
        for (x in input2.indices) {
            output[x] = input2[x].split("x").toTypedArray()
        }
        return output
    }
}