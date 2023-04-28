package OOP

class Vehicle(
    owner:String, brand:String, year:Int, price:Int, wheels:Int
){
    //initialize our class
    init{
        println("The owner of the vehicle is $owner.")
        println("The brand of the vehicle is $brand.")
        println("The vehicle was bought in the year $year.")
        println("The owner paid $price for the vehicle.")
        println("The vehicle has $wheels wheels.")
    }
}

fun main(args: Array<String>) {
    var onwer1 = Vehicle("Mike", "Larmborghini", 2004, 8000000, 4)
    println("---End of Vehicle One-------------")
    var onwer2 = Vehicle("Sudi", "Toyota", 2010, 5200000, 4)
    println("---End of Vehicle Two-----------------")
    var onwer3 = Vehicle("Jaymoy", "Mercedez", 2012, 4200000, 4)
    println("---End of Vehicle Three----------------")
    var onwer4 = Vehicle("Dereck", "Range Rover", 2024, 20000000, 4)
    println("---End of Vehicle Four--------------")
                     println("---*The END*---")

}
