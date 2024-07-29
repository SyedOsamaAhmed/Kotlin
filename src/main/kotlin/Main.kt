fun main() {
    val alarm = 7
//    when (alarm) {
//        in 1..10 ->
//            println("The number is in range 1..10")
//        12, 7, 14 ->
//            println("time is $alarm")
//        else ->
//            println("else condition ran")
//
//    }

    when{
        alarm<=10-> println("Number is in range 1..10")
        alarm==8||alarm==7->println("time is $alarm")
        else-> println("else condition ran")
    }

}