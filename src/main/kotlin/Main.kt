
fun checkType(input:Any?) { // ? означает, что можно передавать ещё тип Null
    when (input) {
        null -> println("Input was null")
        is String -> println("Input is a String with length ${input.length}")
    }
}

fun main() {
    val aGenericVariable: Any = "A string"

    checkType(aGenericVariable)
}
