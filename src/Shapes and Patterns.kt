fun main() {
    println("Welcome Here to The shapes and pattern generator")
    println("================================================")
    println("Enter the Shape Height")
    val high = readLine()!!.toString().toInt()
    println("================================================")
    println("Please enter the desired shape number below")
    print(
        "-1- Snad Clock shape \n" +
                "-2- Diamond shape \n" +
                "-3- Right Down Triangle shape \n" +
                "-4- Left up Triangle shape \n" +
                "-5- Left Down Triangle shape \n" +
                "-6- Diamond Frame shape \n" +
                "-7- Right Up Triangle shape \n" +
                "-8- Left Shield shape \n" +
                "-9- Right Shield shape\n" +
                "10- Arabic Seven shape\n" +
                "11- Arabic Eight shape \n"
    )
    when (readLine()!!) {
        "1" -> sandClock(high)
        "2" -> diamond(high)
        "3" -> rightDownTriangle(high)
        "4" -> leftUpTriangle(high)
        "5" -> leftDownTriangle(high)
        "6" -> diamondFrame(high)
        "7" -> rightUpTriangle(high)
        "8" -> leftShield(high)
        "9" -> rightShield(high)
        "10" -> arabicSeven(high)
        "11" -> arabicEight(high)

    }

}


// pattern 1
private fun sandClock(height: Int) {
    arabicSeven(height)
    arabicEight(height)
}

// pattern 2
private fun diamond(height: Int) {
    arabicEight(height)
    arabicSeven(height)
}

// pattern 3
private fun rightDownTriangle(hei: Int) {
    val height = hei / 2
    for (row in 1..height) {
        for (col in 1..height) {
            if (row > col) {
                continue
            }
            print("* ")
        }
        println()
    }
}

// pattern 4
private fun leftUpTriangle(hei: Int) {


    val height = hei / 2

    for (row in height downTo 1) {
        for (col in 1..height) {

            if (col < row) {
                print("  ")
            } else {
                print("* ")
            }

        }
        println()
    }

}

// pattern 5
private fun leftDownTriangle(hei: Int) {

    val height = hei / 2
    for (row in 1..height) {
        for (col in 1..height) {

            if (col < row) {
                print("  ")
            } else {
                print("* ")
            }

        }
        println()
    }


}

// pattern 6
private fun diamondFrame(hei: Int) {
    val height = hei - 1
    for (row in 0..height) {
        for (col in 0..height) {
            if (row + col == 2 || row - col == 2 || row + col == 6 || col - row == -2)
                print("*")
            else
                print(" ")
        }
        println()
    }
}

// pattern 7
private fun rightUpTriangle(hei: Int) {

    val height = hei / 2
    for (row in height downTo 1) {
        for (col in 1..height) {
            if (row > col) {
                continue
            }
            print("* ")
        }
        println()
    }

}

// pattern 8
private fun leftShield(hei: Int) {
    leftUpTriangle(hei)
    leftDownTriangle(hei)
}

// pattern 9
private fun rightShield(hei: Int) {
    rightUpTriangle(hei)
    rightDownTriangle(hei)
}

// pattern 10
private fun arabicSeven(hei: Int) {
    val height = hei / 2
    for (row in 1..height) {
        for (col in 1..height) {

            if (row > col) {
                print(" ")
                continue
            }
            print("* ")

        }
        println()
    }

}

// pattern 11
private fun arabicEight(hei: Int) {
    val height = hei / 2
    for (row in 1..height) {
        for (col in height downTo 1) {

            if (col > row) {
                print(" ")
                continue
            }
            print("* ")

        }
        println()
    }
}

