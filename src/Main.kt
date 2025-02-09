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

    print("Hello")
    print("")
    print("world!")
    println()

    //strings are concatenated with a +
    print("Hello" + "" + "World")

    // In kotlin, there are two types of variable
    // if a variable will never change (immutable)
    //we use 'val' (value)...
    val name = "steve"
    val dob = "23 jan 2009"

    // if a variable wil change (mutable), we use 'var' (variable)
    var height = 180
    var favColer = "Blue"

    // variable names should always start with a lowercase number
    val numLegs = 2  //Good!
    val numLegs = 2  //Bad!

    // multiple words in a variable...
    val speciesofpet = "cat"  // Bad!
    val speciesofpet = "cat"  

}