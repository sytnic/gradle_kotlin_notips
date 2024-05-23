package org.example

fun main() {
    // Значение null не может быть установлено изначально для переменной.
    // Это вызывает ошибку
    //var aNullableString: String = null

    // Для присваивания null ставится знак ? после типа
    //var aNullableString: String? = null
    //aNullableString = "Kotlin"

    // Попытка доступа к null-значению "небезопасным способом"
    // вызывает ошибку
    //var aNullableString: String? = null
    //println(aNullableString.length)

    // способы решения:

    // 1
    // Двойной знак !! подтверждает, что обращение идет к переменной, которая не null,
    // или выпадет Исключение, если значение есть null
    //var aNullableString: String? = null
    //println(aNullableString!!.length)

    // 2
    // Знак ? поможет вывести null, если значение null.
    // Исключение NullPointerException не будет появляться.
    //var aNullableString: String? = null
    //println(aNullableString?.length)

    // В последнем случае чтобы не выводить на выход слово null,
    // можно применить оператор Элвиса (Elvis) -
    // аналог тернарного оператора для вывода запасного значения,
    // если значение всё-таки будет null
    var aNullableString: String? = "Kotlin" // null
    println(aNullableString?.length ?: "the value is null")


}
