fun main() {
    try {
    var a: Double
    var b: Double
    var c: Double
    var d: Double

    println("напишите три номера:")
    a = readLine()!!.toDouble()
    b = readLine()!!.toDouble()
    c = readLine()!!.toDouble()

    if (a - b == b - c) {
        d = b - a
        println(d)
    } else {
        println("No")

    }
    } catch(e: Exception) {println("Вы ввели не цифру")}
}