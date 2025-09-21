package Kotlin.example.ru.stimmax.lessons.lesson05

fun main()  {

    val sim = 10 + 5 // 15
    val diff = 10 - 5 // 5
    val product = 10 * 5 // 50
    val quotient = 10 / 5 // 2
    val remainder = 10 % 5 // 0
    val remainder1 = 10 % 6 // 4
    val remainder2 = 10 % 4 // 2

    val isEqual = (5 == 5) // true
    val isEqual_1 = ("A" == "r") // false
    val isNotEqual = (5 != 5) // false
    val isGreater = (5 > 3) // true
    val isGreater1 = (5.0 > 3) // true
    val isLesser = (5 < 3) // false
    val isGreaterOrEqual = (5 >= 5) // true
    val isLesserOrEqual = (5 <= 3) // false

    val andResult = (5 > 3) && (5 > 4) // true
    val orResult = (5 > 3) || (5 < 4) // true
    val notResult = !(5 > 3) // false


    var number = 5
    number += 3 // number теперь равен 8, выражение - экономный вариант "number = number + 3"

    number -= 2
    number *= 4
    number /= 5
    number %= 4

    ++number // инкримент
    --number // декремент

    val r = number++ // порядок влияет!!

    number--

    var a = 5
    a = a + 1
    var b = a++
    println("a: $a")
    println("b: $b")

    var c = 5
    var d = ++c
    println("c: $c")
    println("d: $d")

    val rr = 3 - 4 / 5
    val rrr = true || false && !true

    val name: String? = null
    val result = name ?: "Unknown"
    println(result)



}