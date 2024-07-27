fun main() {
    var x = 5
    val y = 3
    //expression:evaluates in a single value
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    //precedence:
    println("3 + 3 * 4 = ${3+3*4}")
    println("(3 + 3) * 4 = ${(3+3)*4}")

    x=1

    println("x = ${x++}")
    println("x = ${++x}")


    println("x = ${x--}")
    println("x = ${--x}")




}