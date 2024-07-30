fun main() {
 println(sum(4,5,6,7,8,9,12,13,42))

}
//passing indefinite no of arguments to a function using vararg
fun sum(vararg numbers:Int):Int{
    var res=0
    for(number in numbers){
        res+=number
    }
    return res
}