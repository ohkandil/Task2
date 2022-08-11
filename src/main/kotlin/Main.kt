import java.util.Scanner


fun main() {
        val scanner = Scanner(System.`in`)
        val inputList = mutableListOf<String>()
        print("Enter iteration number: ")
        var iterations = scanner.nextInt()
        scanner.nextLine()


        while (iterations > 0) {
            print("Enter a name: ")
            val input = scanner.nextLine()
            if (input.contains("a", ignoreCase = true) || input.contains("m", ignoreCase = true)){


                inputList.add(input.uppercase())
                iterations--
            }
            else {
                inputList.add(input)
                iterations--
            }
            }

        println(inputList)

    }




