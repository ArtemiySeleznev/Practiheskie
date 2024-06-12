fun main(args: Array<String>) {
    println("Введите способ оплаты: " +
            "1 - MasterCard " +
            "2 - Maestro " +
            "3 - Мир/Visa " +
            "4 - VK Pay ")
    val oplata: Int = readLine()?.toInt()?: 0
    println("Введите сумму перевода: ")
    val amount: Double = readLine()?.toDouble()?: 0.0
    if (oplata == 1 || oplata == 2){
        if (amount >= 300 && amount <=75000){
            print("Сумма перевода: " + amount)
        }else{
            val proc = 0.6
            val sum = amount * proc / 100
            val eksum = amount + sum + 20
            println("Сумма перевода: " + eksum)
        }
    }else if (oplata == 3){
        if (amount >= 35){
            val proc = 0.75
            val sum = amount * proc / 100
            val oksum = amount + sum
            println("Сумма перевода: " + oksum)
        }else{
            println("Сумма перевода должна быть минимум 35 рублей")
        }
    }else if (oplata == 4){
        print("Сумма перевода: " + amount)
    }

}