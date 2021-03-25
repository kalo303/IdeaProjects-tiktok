import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck

//fun main(){
//println("hello khalid")
//}

//fun main(){
//
//
//    var a=7
//    var b=10
//    a=b+a
//    b=a-b
//
//}

//fun main() {
//  var a=10
//  var b=2
//
//  println("Addition is " + (a+b) )
//
//
    //}

//fun main(args : Array<String>){
//
//    var firstName = "Chaitanya"
//
//    /**
//     * String interpolation
//     */
//    println("String Length: ${firstName.length}")
//
//    /**
//     * Or you can display like this
//     */
//    println("String Length: " + firstName.length)
//}

//fun main(){
//   //
//    val name="khalid" //value gives to type to variable
//    val name2="Ahmed"
//
//    comparing using equals
//    println("String Equals? : ${str1.equals(str2)}")
//

////function main for code
//  fun main(){
//      var teams= arrayOf("City","United","Leicester","chelsea")
//    //access and display item of 4th elements
//    println("teams at 4" + teams[3] +"modified team is "+ teams[0])
//
//    //modify the first element
//    teams[0]="West Ham"
//    println("First team: ${teams.first()} + Last team: ${teams.last()} +Index of 3: ${teams.indexOf("Leicester")} +Size of ArrayOf teams is: ${teams.size}"
//            )

//}


//  fun main() {
//      var fruits = arrayOf("apple", "bananas", "pears")
//
//      //Access the item Number 3 from above array using get
//      fruits.get(2)
//      println(fruits[2])
//
//       //modify the above item
//          fruits[2]="pears"
//
//
//
//
//
//
//  }


//fun main(){
//    /**
//     * This is an immutable variable.
//     */
//    val Banana = "tasty"
//    println("Banana")
//}


//fun main(){
//    /**
//     * This is an mutable variable.
//     */
//    var Apple = "tasty"
//    println("Apple")
//}


//fun main(){
//  val rangetask=2..100
//  //print out the even numbers in this range
//    val even=rangetask.step(2)
//
//    for(n in even){
//        println(n)
//    }
//}


//fun main(){
//
//    val rangetask = 2..100
//    for (n in rangetask.reversed()){
//        println(n)
//    }
//}

//fun main(){
//    //write a code logic that will print out "cannot get a drivers license"
//    val  get valid drivers license=18
//
//    if (valid drivers license<18){
//    println(
//    cannot get a drivers license
//    )}


//fun main() {
//    print("Cannot get a drivers license")
//
//    val enteredString = readLine()
//    println("You have entered this: $enteredString")
//}

//fun main() {
//    // if the users age is below 18 else can get a 'valid license' if above or equal to 18
//    println("enter age")
//    val age=Integer.valueOf(readLine())
//    if (age<18){
//       println("cannot get a driver license")
//
//    } else{
//        println("valid license")
//    }
//}


//fun main(){
//
//    var color= "yellow"
//
//    when(color){
//
//        "yellow" -> println("yellow is a myfav")
//
//
//        else -> println("$color is my fav")
//    }
//}

//fun main() {
//
//    var colors = "blue";
//
//    when (colors) {
//
//        "red" -> println("red is a myfav")
//        "blue" -> println("blue is a myfav")
//
//
//        else -> println("$colors is my fav")
//    }
//
//
//}


//fun main(){
//
//    /**
//     * Array that holds multiple different data types
//     */
//    var arr = arrayOf(10, "BeginnersBook", 10.99, 'A')
//
//    /**
//     * Displaying 4th element
//     */
//    println(arr[3])
//
//    /**
//     * modifying 4th element
//     */
//    arr[3] = 100
//
//    /**
//     * Displaying 4th element again
//     */
//    println(arr[3])
//
//}


//fun main() {
//
//
//    var arr = arrayOf(10, "BeginnersBook", 10.99, 'A')
//
//    /**
//     * Displaying 4th element
//     */
//    arr.get(3)
//    println(arr[3])
//
//    /**
//     * modifying 4th element
//     */
//    arr.set(3,'b')
//    println(arr[3])
//
//
//}


//fun main(args : Array<String>){
//
//    var arr = arrayOf(1, 2, 3, 4, 5)
//
//    println("Size of  arr is: ${arr.size}")
//
//}


//fun main(){
//
//    var arr = arrayOf(1, 22, "CPS")
//
//    println("contains CPS: ${arr.contains("CPS")}")
//
//}

//fun main(args : Array<String>){
//
//    println("Number range:")
//
//    for(num in 1..4){
//        println(num)
//    }
//
//    println("Character range:")
//
//    for(ch in 'A'..'E'){
//        println(ch)
//    }
//}

//fun main(){
//
//    var num = 78
//
//    when(num) {
//        in 1..9 -> println("$num is a single digit number")
//        in 10..99 -> println("$num is a two digit number")
//        in 100..999 -> println("$num is a three digit number")
//        else -> println("$num has more than three digits")
//    }
//}


//fun main(){
//
//    var age = 18
//
//    when(age) {
//        in 1..18 ->
//            println("cannot get a valid license")
//
//        in 18..70 -> println("can get a valid license")
//    }
//}



//fun main(){
//
//    val myArray = arrayOf("john", "abdi", "fatush", "geen")
//    for (str in myArray){
//        println(str)
//    }
//}



//fun main(){
//    val range=10..15
//
//    for(n in range){
//        println(n)
//    }
//}





//fun main(){
//
//    var num = 10
//
//    while(num>=5){
//        println("Loop: $num")
//        num--
//    }
//}


fun main(){

    var num = 1

    while(num<=10){
        println("Loop: $num")
        num++
    }
}







//fun main() {
//    var num = 10
//
//    while (num >= 5) {
//        println("Loop: $num")
//        num--
//    }
//}


//fun main() {
//    var num = 5
//
//    while (num <= 10) {
//        println("Loop: $num")
//        num--
//    }
//}

//fun main() {
//    var num = 105
//    do {
//        println("Loop: $num")
//        num++
//    } while (num >= 100)
//}


//fun main(){
//
//    myloop@ for (x in 'A'..'D'){
//        for (n in 1..4){
//            if (n==2||n==4)
//                continue@myloop
//
//            println("$x and $n")
//        }
//}
//}











//fun main(){
//
//    for(n in 10..15){
//        println("Loop: $n")
//    }
//}

//fun main(){
//
//    val myArray = arrayOf("ab", "bc", "cd", "da")
//    for (str in myArray){
//        println(str)
//    }
//}

//fun main(args : Array<String>){
//
//    val myArray = arrayOf("Steve", "Robin", "Kate", "Lucy")
//    for (n in myArray.indices){
//        println("myArray[$n]: ${myArray[n]}")
//    }
//}

//fun main(){
//
//    val myArray = arrayOf("Steve", "Robin", "Kate", "Lucy")
//    for((index, value) in myArray.withIndex()){
//        println("Value at Index $index is: $value")
//    }
//}

//fun main(){
//
//    var num = 10
//
//    while(num>=5){
//        println("Loop: $num")
//        num--
//    }
//}

//fun main(){
//    while (true){
//        println("loop")
//    }
//}

//fun main(){
//    var num = 5
//
//    while(num<=10){
//        println("Loop: $num")
//        num--
//    }
//}



