import java.lang.reflect.Executable

fun main() {
    try {


        // Первый экзмепляр
        println("Введите номер телефона")
        val number1 = Tel_zvon(readln())
        println("Введите дату")
        number1.date = readln()
        println("Введите продолжительность (минуты)")
        number1.prod = readln().toDouble()
        println("Введите код региона")
        number1.code = readln().toInt()

        // Второй экземпляр
        println("Введите номер телефона")
        val number2 = Tel_zvon(readln())
        println("Введите дату")
        number2.date = readln()
        println("Введите продолжительность (минуты)")
        number2.prod = readln().toDouble()
        println("Введите код региона")
        number2.code = readln().toInt()

        // Третий экземпляр
        println("Введите номер телефона")
        val number3 = Tel_zvon(readln())
        println("Введите дату")
        number3.date = readln()
        println("Введите продолжительность (минуты)")
        number3.prod = readln ().toDouble()
        println("Введите код региона")
        number3.code = readln().toInt()

        // Вывод информации
        number1.Info()
        number2.Info()
        number3.Info()
    } catch (e:Exception){
        println("Ошибка: ${e.message}")
    }
}
