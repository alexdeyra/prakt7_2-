fun main() {
    var x1: Double
    var y1: Double
    var x2: Double
    var y2: Double
    var x3: Double
    var y3: Double
    var x4: Double
    var y4: Double
    var S: Double = 0.0

    x1 = readLine()!!.toDouble()
    y1 = readLine()!!.toDouble()
    x2 = readLine()!!.toDouble()
    y2 = readLine()!!.toDouble()
    x3 = readLine()!!.toDouble()
    y3 = readLine()!!.toDouble()
    x4 = readLine()!!.toDouble()
    y4 = readLine()!!.toDouble()

    // Пусть x1, y1 это правый верхний угол прямоугольника,
    // x2, y2 это правый нижний угол и т.д.
    if (x1 > 0 && y1 > 0 && x2 <= 0 && y2 <= 0 && x3 <= 0 && y3 <= 0 && x4 <= 0 && y4 <= 0) {
        S = x1 * y1
    }
    if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x3 <= 0 && y3 <= 0 && x4 <= 0 && y4 <= 0) {
        // Самый большой прямоуг. в 1 четверти - это прямоугольник со сторонами x1 и y1
        // Поэтому мы вычитаем из его площади площадь прямоугольника со сторонами x2 и y2
        S = x1 * y1 - (x1 - x2) * (y1 - y2)
    }
    if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x3 > 0 && y3 > 0 && x4 > 0 && y4 > 0) {
        S = x1 * y1 - (x1 - x4) * (y1 - y2)
    }
    println(S)
}