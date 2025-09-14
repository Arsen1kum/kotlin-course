package Kotlin.example.ru.stimmax.lessons.lesson03


// количество колёс, зададим константой
const val wheels = 4

class Auto {
    // шасси
    val vicode: String = "1234567uikjhgfdswq"

    // цвет кузова
    var color: String = "teal"

    // пробег
    var mileage: Int = 0 + 5

    // имя владельца
    lateinit var ownerName: String

    // детальный отчет, требуемый для утилизации (отчет по истории автомобиля)
    val utilreport: String by lazy {
        "Отчет будет создан в будущем"
    }

}