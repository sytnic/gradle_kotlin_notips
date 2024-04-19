package org.example

fun main() {
    // в типе Char используются одиночные кавычки
    val aChar: Char = 'a'
    val aNumericChar = '1'
    val newLineChar = '\n'

    // Вызывает ошибку, т.к. пытается складывать Char, одиночные символы
    //val concatOption1 = 'a' + 'b'

    // Вызывает ошибку, т.к. Char не может иметь больше одного символа
    //val concatOption2 = 'ab'

    // в типе String используются двойные кавычки
    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World"
    println(escaped)

    // Тройные кавычки испольльзуются для вывода строки со всем форматированием
/*
    val raw = """
    Some
        multiline
    text
       is going on
     here 
    """
    println(raw)

    // обработка вертикальной чертой удаляет первоидущий отступ у строк
    val raw = """
    |Some
        multiline
  text
       |is going on
     here 
    """.trimMargin()
    println(raw)
*/

    // удаление отсупа у строк с помощью пользовательского символа >>
    val raw = """
    >>Some
        multiline
  text
       >>is going on
     here 
    """.trimMargin(">>")
    println(raw)

    // Конкатенация строк
    val concatString = "Hello" + " Kotlin!"
    println(concatString)

    // Объединение строки и числа, не приводит к ошибкам
    val concatNumber = "The number " + 10
    println(concatNumber)    // The number 10

    // Использование подстановочного знака (переменной)

    val aNumber1 = 10
    val concatTemplate1 = "The number $aNumber1"
    println(concatTemplate1)  // The number 10

    val aNumber = 10
    val concatTemplate = "The number ${1 + aNumber}"
    println(concatTemplate)  // The number 11

    // Использование методов строк
    val someString1 = "Hello there!"
    println(someString1.isEmpty())     // false

    val someString2 = "  "
    println(someString2.isNotEmpty())  // true, учитывает пробелы

    val someString3 = "  "
    println(someString3.isNotBlank())  // false, не учитывает пробелы

    val anotherString = "Hello Kotlin World!"
    println(anotherString.contains("Kotlin"))  // true

}
