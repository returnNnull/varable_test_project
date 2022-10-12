
fun main(args: Array<String>) {

    val buffer: Int

    var num1 = 8
    var num2 = 10

    buffer = num1
    num1 = num2
    num2 = buffer

    println("num1: $num1, num2: $num2")

}