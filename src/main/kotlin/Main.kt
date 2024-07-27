fun main() {
    //val value cant be changed whereas var value can be changed
    val userName = "Osama"
    var age = 24


    age += 1
    println("Hello $userName and my age is $age")

//Variables data types:
    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE

    println("Integer max value: $maxIntegerValue")
    println("Integer min value: $minIntegerValue")


    val maxByteVal = Byte.MAX_VALUE
    val minByteVal = Byte.MIN_VALUE
    println("Byte max value: $maxByteVal")
    println("Byte min value: $minByteVal")

    val maxShortVal = Short.MAX_VALUE
    val minShortVal = Short.MIN_VALUE
    println("Short max value: $maxShortVal")
    println("Short min value: $minShortVal")


    val maxLongVal=Long.MAX_VALUE
    val minLongVal=Long.MIN_VALUE
    println("Long max value: $maxLongVal")
    println("Long min value: $minLongVal")



}