package Kotlin.example.ru.stimmax.lessons.lesson05.homework

//Задача 1

//Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение
// начальной интенсивности звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
//Задача: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания
// пропорциональна начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания
// неизвестен, использовать стандартное значение 0.5.

// example 1
val baseIntensity: Double = 3.0
val coefficient: Double? = 0.73 // но может быть null
val baseCoefficient: Double = 0.5
val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient) // если coefficient не null — берем его, иначе подставляем baseCoefficient

//Задача 2

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача: Рассчитать полную стоимость доставки.

//example 2
val defaultCost: Double = 50.0
val cost: Double? = 20.0 // но может быть null
val deliveryCost: Double = 5.0
val insuranceCoefficient: Double = 0.005
val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient // стоимость страховки: берем cost или defaultCost
val totalCost: Double = deliveryCost + insuranceCost // полная стоимость доставки


//Задача 3

//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
// которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.

// example 3
val pressure: Double? = "34.6" // но может быть null
val attentionMessage = "Attention, pressure is lost"
val pressureForLab = pressure ?: attentionMessage // если pressure не null — берем его, иначе выдаем attentionMessage