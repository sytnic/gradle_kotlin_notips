
fun main() {
    var someVariable = 30

    when (someVariable) {
        0,1 -> println("The value was 0 or 1")  // 0 или 1
        2 -> println("The value is 2")          //  == 2
        3 -> println("The value is 3")          //  == 3
        in 4..Int.MAX_VALUE -> println("The value was greater than 3")  // между 4 и бесконечность // This prints
    }

}

