/**
 * this is a little intro to kotlin
 */

/**
 * the main function is the entry
 * point to any kotlin program
 */

fun main( ) {

    // we can output to the terminal with print() and println()
    println("Hello World!")
    //OUTPUT==================================================================


    print("Hello")
    print("")
    print("world!")
    println()

    //strings are concatenated with a +
    print("Hello" + "" + "World!")

    //VARIABLES==================================================================

    // In kotlin, there are two types of variable
    // if a variable will never change (immutable)
    //we use 'val' (value)...
    val name = "Liam"
    val dob = "23 jan 2009"

    // if a variable wil change (mutable), we use 'var' (variable)
    var height = 180
    var favColer = "Blue"

    // variable names should always start with a lowercase number
    val NumLegs = 2  //Good!
    val numLegs = 2  //Bad!

    // multiple words in a variable...
    val speciesOfPet = "cat"  //GOOD!
    val speciesofpet = "cat"  //BAD!... Camelcase
    val species_of_pet = "cat" //GOOD.... Snakecase

    // STRING TEMPLATES =============================================================

    // we often want to output variable values with text

    println("My name is $name")  // using cancatanation

    println("My name is$name")  // using a template
    println("I have $numLegs legs")

    // if we need to do calculations, use {...}
    println("I have ${numLegs * 5} toes")

    //STRING MANIPULATION===============================================================

    println(name.uppercase())
    println(name.lowercase())

    val scoretext = "1000"           // this is a string!
    val score = scoretext.toInt()    // this an int  and we can do mathhs
    print("score: $score")

    val testText = "Goat"
    val textNum = testText.toIntOrNull()   // this copes with Num
    println(textNum)

    // USER INPUT========================================================================

    print("Enter your favourite colour: ")
    val colour = readln()
    println("I like $colour too!")

    print("Enter your favourite number: ")
    val number = readln().toIntOrNull()

    //BRANCHING============================================================================

    // can use if / else if / else
    if (number == null) {
        println("That's not a number")
    }
    else {
        println("Oh, Yes! $number is lovley")
    }

    //ALTERNATIVELY=========================================================================
    when (number) {
    null -> println("That's not a number")
        7 -> println("seven is just the best")
        13 -> println("No, that's unlucky!")
    else -> println("Oh intreresting")

    }

    //LOOPING / ITERATION=======================================================================

    // while loops
    var count = 0
    while (count < 10) {
        println(count)
        count++
    }

    // Infinite loop
    while (true){
        println("Hi! type 'x' to exit")
        val input = readln()
        if (input =="x") break       // the breakout condition
    }

    // For range loop
    for (num in 1..10) {
        println(num)
    }
}