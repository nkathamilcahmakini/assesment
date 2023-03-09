fun main(){
    name()
    balls("Favour", "Sally")
    calculator()

}

//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements.


//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun name(){
    var name = "Akirachix"
        println(name [0])
        println(name [1])
        println(name [2])
        println(name [3])
        println(name [4])
        println(name [5])
        println(name [6])
        println(name [7])
        println(name [8])

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun balls(names1:String, names2:String):String {
    var balls = arrayOf(names1 + names2)
    println(balls)

}

//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
fun calculator(){
    var number = arrayOf(345,225,25,75,80,600,75)
    var sum = number[2] + number[3]
    println(sum)
    var subtraction = number[5] - number[1]
     println(subtraction)
    var division = number[0] % number[4]
    println(division)
    var multiplication = number[1] * number[5]
    println(multiplication)

}
