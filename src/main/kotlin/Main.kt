package org.example

fun main() {
    val aInt: Int = 0      // 32 bits
    val anotherInt = 0

    val aByte: Byte = 0    // 8 bits
    val aShort: Short = 0  // 16 bits

    val aLong: Long = 0    // 64 bits
    val inferredInt = 10   // it will Int type, 32 bits
    val inferredLong = 10000000000   // it will Long type, 64 bits

    val anotherLong = 10L  // force use of Long type

    val unsignedInt: UInt = 0U  // число без знака минус
    val unsignedLong = 0UL      // большое число без знака минус

    val aDouble: Double = 5.5   // 64-битное плавающее число, это считается по умолчанию
    val aFloat: Float = 5.5f    // 32-битное плавающее число

    val inferredDouble = 5.5    // Double, 64 bit, по умолчанию
    val inferredFloat = 5.5f    // Float, 32 bit

    // Примеры сравнений
    println(5 == 4)       // false
    println(10f > 1)      // true
    println(10.1 <= 5.2)  // false

    // Приведение плавающего к целому числу
    println(10.5.toInt())   //  10
    // Преоброзвание к плавающему типу Float
    10.9.toFloat()
    // Преобразование к типу Long без знака минус
    5.toULong()

    // Преобразование большого числа к байту (8 бит),
    // обычно от этого теряется точность и происходят потери,
    // в данном случае будет - ноль 0.
    println(100_000_000.toByte())  // 0

    // Преобразование от меньшего к большему обычно происходит без потерь



}