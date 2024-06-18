
fun printCalculatedValue(value1:Int, value2:Int, calculator:(Int, Int)->Int) {
    println("The value is: ${calculator(value1, value2)}")
}

fun main() {
    // Простая реализация лямбды
    printCalculatedValue(2, 2, {value1, value2 -> value1 + value2})
    // The value is: 4

    // Реализация лямбды с новым арифметическим оператором.
    printCalculatedValue(2, 2, {value1, value2 -> value1 - value2})
    // The value is: 0

    // Trailing Lambda Syntax: лямбда вынесена в собственные фигурные скобки.
    printCalculatedValue(2, 3) {value1, value2 -> value1 + value2}
    // The value is: 5
}

