class Tel_zvon(var number:String) {
    var date:String  = ""
    var prod:Double = 0.0
    var code:Int = 0

    //Расчет скидки на звонок (50% скидка + коэффициент 3)
    fun Rashcet(prod: Double): Double{
        if (prod > 0.0){
            val sum = (prod / 2) * 3
            return sum
        }
        return 0.0
    }

    // Определение региона по коду
    fun GetCode(): String {
        return when (code) {
            343 -> "Свердловская область"
            342 -> "Пермский край"
            495, 496, 498 -> "Московская область"
            else -> "Неизвестный регион"
        }
    }


    // Форматирование даты (пример новой функции)
    fun GetFormattedDate(): String {
        return "Дата звонка: $date"
    }

    // Подсчет стоимости разговора по тарифу 1.5 за минуту
    fun CalcTotalCost(): Double {
        if(prod > 0.0){
            return  prod * 1.5
        }
        return 0.0

    }

    // Вывод информации
    fun Info(){
        println("------ Информация о звонке ------")
        println("Номер телефона клиента: $number")
        println(GetFormattedDate())
        println("Продолжительность: $prod минут")
        if(CalcTotalCost() > 0.0){
            println("Стоимость по тарифу: ${CalcTotalCost()} руб.")
        }
        else{
            println("Стоимость указана неверно")
        }
        if(Rashcet(prod) > 0.0){
            println("Стоимость со скидкой: ${Rashcet(prod)} руб.")
        }else{
            println("Стоимость указана неверно")
        }
        println("Код региона: $code")
        println("Регион: ${GetCode()}")
        println("---------------------------------")

    }
}