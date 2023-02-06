import java.util.*

fun main() {
    println("Enter the Nth number:")
    val scanner = Scanner(System.`in`)
    val len: Int = scanner.nextInt()
    println("the first $len term of fibbo is:")
    fibo(len)

}

 fun fibo(length: Int){
    var sumTotal =0
    var sum  = 0
    var temp1 = 0
    var temp2  = 1
    for (i in 1 .. length){
        print("$sum ")
        sumTotal+=sum
        sum = temp1 + temp2
        temp1 =temp2
        temp2 = sum
    }
    print("\n")
    print(sumTotal)
}