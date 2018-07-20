import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    feedTheFish()
}

fun feedTheFish() {
    val day = randoDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randoDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Synday")
    return week[Random().nextInt(7)]
}
