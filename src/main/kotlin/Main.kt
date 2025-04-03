fun main() {
    // non-null массив
    val ints = arrayOf(1, 2, 3, 4, 5)

    // nullable массив
    val intsNull = arrayOf(1, 2, 3, 4, null)

    // создаёт массив с пятью пустыми null значениями,
    // в который потом можно сохранять числа и null
    val nulls = arrayOfNulls<Int>(5)

    // Инициализирует массив с 5 значениями
    // и заполняет индексами,
    // аналог arrayOf(1, 2, 3, 4, 5)
    val custom = Array(5) { index -> index }

    // вернёт длину массива
    // 5
    val sizeOfArray = ints.size
    println(sizeOfArray)

    // получить первое значение (счёт с нуля)
    // 1
    val firstValue = ints.get(0)
    println(firstValue)

    // установить значение 98 в первый элемент [0]
    ints.set(0, 98)

    // то же самое, синтаксический сахар,
    // для легкого чтения и написания,
    // получить первый элемент массива
    // 1
    val secondValue = intsNull[0]
    println(secondValue)

    // установить значение 99 в первый элемент
    intsNull[0] = 99

    val PrimitiveInts = intArrayOf(1,2,3,4,5)
    // 1u - беззнаковое обозначение - unsigned
    val primitiveUShorts = ushortArrayOf(1u,2u,3u,4u,5u)

    // вывод массива через циклы
    for (i in 0 until intsNull.size) {
        println(ints[i])
    }
    // 98
    // 2
    // 3
    // 4
    // 5

    // element - любое желаемое значение
    for (element in intsNull) {
        println(element)
    }
    // 99
    // 2
    // 3
    // 4
    // null

    ints.forEach {element -> println(element)}
/*  98
    2
    3
    4
    5  */

    // передача массива в функцию как набора аргументов
     greetThings1("Hey", arrayOf("Kotlin", "Programming"))
    // Hey Kotlin
    // Hey Programming

    // передача ряда значений в функцию вместо массива
    greetThings2("Hey", "Kotlin", "Programming", "Linkedin")
    // Hey Kotlin
    // Hey Programming
    // Hey Linkedin

}

// первый вариант функции greetThings
// для передачи массива
fun greetThings1(greeting: String, items: Array<Any>) {
    for (item in items) {
        println("$greeting $item")
    }
}


// второй вариант функции greetThings,
// для передачи ряда значений вместо массива
fun greetThings2(greeting: String, vararg items: Any) {
    for (item in items) {
        println("$greeting $item")
    }
}
