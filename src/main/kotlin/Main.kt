
// fun printGreeting() = println("Hello Kotlin")

fun main() {
    fun getGreeting(
        greeting:String = "Hello",
        thingToGreet:String = "World"
    ) = "$greeting $thingToGreet"

    println(getGreeting(thingToGreet = "Friend", greeting = "Hey there"))
}
// Hey there Friend
