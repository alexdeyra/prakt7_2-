import kotlin.math.sqrt
fun main(){
    var a:Double
    var k:Double
    var b:Double
    var l:Double

    println("Введите a,k,b,l")
    a= readLine()!!.toDouble()
    k= readLine()!!.toDouble()
    b= readLine()!!.toDouble()
    l= readLine()!!.toDouble()

    val D=k*k+4*a*b
    if (D<0)
    {
        println("Парабола и прямая не пересекаются")
    } else{
        val x1=(k+sqrt(D)) / (2*a)
        val y1= k*x1+b

        val x2=(k-sqrt(D)) / (2*a)
        val y2= k*x2+b

        if (0<x1 && x1<l &&0<y1&&y1<l &&0<x2 && x2<l &&0<y2 && y2<l){
            println("$x1,$y1,$x2,$y2")
        } else {
            println("не принадлежат квадрату")
        }
    }
}