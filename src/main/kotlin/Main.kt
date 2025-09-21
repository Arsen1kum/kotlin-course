package Kotlin.example

import Kotlin.example.ru.stimmax.lessons.lesson03.Auto
import Kotlin.example.ru.stimmax.lessons.lesson6.homework.*

/*//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}*/


fun main() {
    val message = "I Love Kotlin"
    println(message)

    val auto = Auto()
    auto.ownerName = "Ivan"
    println(auto.ownerName)


    printSeason(4)  // Сезон: Весна (Урок 6)
    printSeason(7)  // Сезон: Весна
    printSeason(12)  // Сезон: Весна
    printSeason(22)  // Сезон: Весна

    printDogToHumanYears(-2)
    printDogToHumanYears(2)
    printDogToHumanYears(3)
    printDogToHumanYears(10)

    printTransport(-11.2)
    printTransport(0.2)
    printTransport(1.2)
    printTransport(200001.2)

    printBonusPoints(987f)
    printBonusPoints(1988.71f)

    printFileType("txt")
    printFileType("weave")

    convertTemperature(99f,"C")
    convertTemperature(23f,"F")

    recommendClothes(24f)
    recommendClothes(-24f)

    printMovieCategory(33)
    printMovieCategory(3)
    printMovieCategory(0)

}
