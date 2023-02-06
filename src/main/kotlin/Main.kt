import java.util.*

fun main(args: Array<String>) {
    println("Enter the Nth number:")
    var scanner = Scanner(System.`in`)
    var len: Int = scanner.nextInt()
    var x = fibo(len)
    println("the first $len term of fibbo is:")
    print(x)

}

tailrec fun fibo(length: Int): Long {
    var sum: Int = 0
    var temp1: Int = 0
    var temp2: Int = 1
    for (i in 1 .. length){
        println("$length ")
        sum = temp1 + temp2
    }
}