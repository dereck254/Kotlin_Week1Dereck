import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Please dial *544# to display the menu")

    // Wait for the user to dial *544#
    while (scanner.nextLine() != "*544#") {}

    // Display the menu
    println("Please select an option from the menu:")
    println("1. Check Balance")
    println("2. Buy Airtime")
    println("3. Internet Bundles")
    println("4. M-PESA Services")
    println("5. Bonga Points")
    println("6. Skiza Tunes")
    println("7. Roaming Services")
    println("8. Skiza Manager")
    println("9. My Account")
    println("10. Customer Care")
    println("98. More")
    println("0. Home")

    val option = scanner.nextInt()

    when(option) {
        1 -> {
            println("Checking Balance")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        2 -> {
            println("Buying Airtime")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        3 -> {
            println("Purchasing Internet Bundle")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        4 -> {
            println("M-PESA Services")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        5 -> {
            println("Checking Bonga Points")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        6 -> {
            println("Managing Skiza Tunes")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        7 -> {
            println("Activating Roaming Services")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        8 -> {
            println("Managing Skiza Tune Subscription")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        9 -> {
            println("Accessing My Account")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        10 -> {
            println("Contacting Customer Care")
            println("Press 0 to go back to the main menu")
            while (scanner.nextInt() != 0) {}
        }
        98 -> {
            println("1. Okoa Jahazi")
            println("2. Tunukiwa")
            println("3. Skiza Games")
            println("4. WASILI")
            println("0. Home")
            val subOption = scanner.nextInt()

            when(subOption) {
                1 -> {
                    println("Okoa Jahazi")
                    println("Press 0 to go back to the main menu")
                    while (scanner.nextInt() != 0) {}
                }
                2 -> {
                    println("Tunukiwa")
                    println("Press 0 to go back to the main menu")
                    while (scanner.nextInt() != 0) {}
                }
                3 -> {
                    println("Skiza Games")
                    println("Press 0 to go back to the main menu")
                    while (scanner.nextInt() != 0) {}
                }
                4 -> {
                    println("WASILI")
                    println("Press 0 to go back to the main menu")
                    while (scanner.nextInt() != 0) {}
                }

                else -> {
                    println("Invalid Option")
                }
            }
        }
        else -> {
            println("Invalid option")

        }
    }
}
