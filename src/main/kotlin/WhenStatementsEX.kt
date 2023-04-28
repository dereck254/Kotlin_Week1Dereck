import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Please dial *544#")


    while (scanner.nextLine() != "*544#") {}
    
    println("Please select an option from 0-10:")
    println("0. 20GB for 1hr @20KSh")
    println("1. Data Deals")
    println("2. Daily Bundles")
    println("3. Weekly Bundles")
    println("4. GO MONTHLY")
    println("5. No Expiry")
    println("6. Video Bundles")
    println("7. Okoa Data")
    println("8. Lipa Mdogo")
    println("9. Data Plus NEW")
    println("10. Hot Minutes")
    println("98. MORE")

    val option = scanner.nextInt()

    when(option) {
        0 -> {
            println("Get 20GB for 1Hr @20Ksh")
        }
        1 -> {
            println("  Data Deals")
        }
        2 -> {
            println("  Daily Bundles")
        }
        3 -> {
            println("  Weekly Bundles")
        }
        4 -> {
            println("  GO MONTHLY")
        }
        5 -> {
            println("  No Expiry")
        }
        6 -> {
            println("  Video Bundles")
        }
        7 -> {
            println("  Okoa Data")
        }
        8 -> {
            println("  Lipa Mdogo")
        }
        9 -> {
            println("  Data Plus NEW")
        }
        10 -> {
            println("  Hot Minutes")
        }
        98 -> {
            println("  MORE")
        }
        else -> {
            println("Invalid option")
        }
    }
}
