package OOP

class House(
    owner:String, location:String, price:Int, doors:Int
){
    //initialize our class
    init{
        println("The owner of the house is $owner")
        println("The house is located in $location")
        println("The owner paid $price for the house")
        println("The house has $doors")
    }
}

fun main(args: Array<String>) {
    var onwer1 = House("Mike", "Ngara", 25000, 2)
    println("---End of House One")
    var onwer2 = House("Sudi", "Ngarawe", 43000, 5)
    println("---End of House Two")
    var onwer3 = House("Jaymoy", "Kigarawe", 34900, 4)
    println("---End of House Three")
                    println("---*The END*---")

}


