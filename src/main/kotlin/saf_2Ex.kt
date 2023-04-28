import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val mainMenu = """
            SELECT AN OPTION BELOW:
            1. Check balance
            2. Buy airtime
            3. M-PESA
            4. Internet settings
            5. Sambaza
            6. Skiza
            7. Roaming
            8. Customer care
            9. Bonga Points
            10. Okoa Jahazi
            98. More
            0. Exit
            """.trimIndent()
        val moreMenu = """
            MORE
            1. Data Bundles
            2. SMS Bundles
            3. Platinum
            4. Tunukiwa
            5. International
            0. Back to Main Menu
            """.trimIndent()
        while (true) {
            println("Dial *544# to access the menu.")
            val input = scanner.nextLine()
            if (input == "*544#") {
                println(mainMenu)
                val option = scanner.nextInt()
                scanner.nextLine() // consume the new line character
                when (option) {
                    0 -> {
                        System.exit(0)
                        println("Your balance is KES 500.")
                    }

                    1 -> println("Your balance is KES 500.")
                    2 -> println("Buy airtime.")
                    3 -> println("M-PESA.")
                    4 -> println("Internet settings.")
                    5 -> println("Sambaza.")
                    6 -> println("Skiza.")
                    7 -> println("Roaming.")
                    8 -> println("Customer care.")
                    9 -> println("Bonga Points.")
                    10 -> println("Okoa Jahazi.")
                    98 -> {
                        println(moreMenu)
                        var moreOption = scanner.nextInt()
                        scanner.nextLine() // consume the new line character
                        while (moreOption != 0) {
                            when (moreOption) {
                                1 -> println("Data Bundles.")
                                2 -> println("SMS Bundles.")
                                3 -> println("Platinum.")
                                4 -> println("Tunukiwa.")
                                5 -> println("International.")
                                else -> println("Invalid Option.")
                            }
                            println(moreMenu)
                            moreOption = scanner.nextInt()
                            scanner.nextLine() // consume the new line character
                        }
                    }

                    else -> {
                        println("Invalid Option.")
                        println(mainMenu)
                    }
                }
            } else {
                println("Invalid USSD code.")
            }
        }
    }
}
