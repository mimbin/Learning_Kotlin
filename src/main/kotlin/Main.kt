fun main() {
    val weekday = "Friday"
    val hour = 17
    var isOpen = when (weekday){
        "Monday" 	-> hour in 8..12;
            "Tuesday" 	-> hour in 8..18;
            "Wednesday" -> hour in 8..18;
            "Thursday" 	-> hour in 8..18;
            "Friday"	-> hour in 8..21;
            "Saturday"	-> hour in 9..16;
            "Sunday"	-> hour in 8..16;
        else		-> false
    }
    var status = if (isOpen) "Open" else "Closed!"
    println("on $weekday, on $hour O'clock the Lemon Restaurant is: $status" )
}