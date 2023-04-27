package OOP

class House(owner:String, location:String, price:Int, doors:Int) {
  //initialize our class
    init {
       println("Owner of the house is $owner")
       println("house is located in $location")
       println("price is $price")
       println("It has $doors number of doors")


    }

}

fun main(args: Array<String>) {

    var owner_one = House("Mike", "Ngara", 25000,2)
    println("-----end of house 1------")
    var owner_two = House("Sue", "Kite", 35000,4)

    println("-----end of house 2------")
    var owner_three = House("Ann", "South B", 45000,3)
    println("-----end of house 3------")

}

