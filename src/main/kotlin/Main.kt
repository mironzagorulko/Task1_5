fun main() {

    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()


    if (n == null || x == null || x <= 1) {
        println("Некорректный ввод. Пожалуйста, убедитесь, что вы ввели натуральные числа.")
        return
    }


    var y = 0
    var power = 1

    while (power < n) {
        y++
        power = Math.pow(x.toDouble(), y.toDouble()).toInt()
    }

    if (power == n) {
        println("Целочисленный показатель: y = $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
