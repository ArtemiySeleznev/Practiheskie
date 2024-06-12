package org.example

import java.util.*

fun agoToText(seconds: Int): String {
    return when {
        seconds <= 60 -> "был(а) только что"
        seconds <= 60 * 60 -> minutesAgoToText(seconds / 60)
        seconds <= 24 * 60 * 60 -> hoursAgoToText(seconds / 3600)
        seconds <= 2 * 24 * 60 * 60 -> "вчера"
        seconds <= 3 * 24 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}
 fun minutesAgoToText(minutes: Int): String {
    return when (minutes) {
        1 -> "был(а) 1 минуту назад"
        2 -> "был(а) 2 минуты назад"
        5 -> "был(а) 5 минут назад"
        11 -> "был(а) 11 минут назад"
        21 -> "был(а) 21 минуту назад"
        25 -> "был(а) 25 минут назад"
        else -> "был(а) $minutes минут назад"
    }
}
fun hoursAgoToText(hours: Int): String {
    val lastDigit = hours % 10
    return when {
        lastDigit == 1 && hours != 11 -> "был(а) $hours час назад"
        lastDigit >= 2 && lastDigit <= 4 && (hours < 10 || hours > 20) -> "был(а) $hours часа назад"
        else -> "был(а) $hours часов назад"
    }
}
fun main() {
    println("Введите время в секундах: ")
    val scanner = Scanner(System.`in`)
    var posledTime = scanner.nextInt()
    val text = agoToText(posledTime)
    println(text)
}