fun main(args: Array<String>) {
    println("----Enter Your Age----")
    var age = readLine()!!.toInt()
    if (age >= 18) {
        println("Admit to the Club")
    } else {
        println("Sorry! You're under age.")
    }
}