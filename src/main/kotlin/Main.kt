
// $thingToGreet - это явно заданное имя для параметра,
// к-рое передаётся в функцию
var greetingFunction: (String) -> String = { thingToGreet ->
    "Hello $thingToGreet"
}

// Указывать return в лямбда-функциях не нужно,
// но return подразумевается,
// поэтому, т.к. функция возвражщает значение, а не распечатывает его,
// для вывода на экран требуется добавить обрамляющую функцию println
fun main() {
    println(greetingFunction("World"))      // Hello World
    println(greetingFunction("Kotlin"))     // Hello Kotlin
    println(greetingFunction.invoke("Friend"))  // Hello Friend

    greetingFunction = {
        "Hello Everyone"
    }
    println(greetingFunction.invoke("Man"))  // Hello Everyone, т.к.
    // функция переопределена уже без параметров

    greetingFunction = {
        "Hello $it!"
    }
    println(greetingFunction.invoke("Euro"))  // Hello Euro!, т.к.
    // мы указали неявный параметр $it при переопределении функции

    greetingFunction = {thingToGreet ->
        "Hello $thingToGreet!"
    }
    println(greetingFunction.invoke("America"))  // Hello America!, т.к.
    // мы указали явный параметр $thingToGreet при переопределении функции
}

