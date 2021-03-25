class fruit {
   var appletaste = "sweet"
   var lemontaste = "sour"
   var lemoncolor = "green"
   var applecolor = "red"

    fun tasteFruit (){
       println("sweet")
       println("sour")
    }
    fun colorFruit(){
     println("green")
     println("red")
    }
}
fun main(){
    //create objects for apple and lemon
   val obj=fruit()
    println(obj.colorFruit())
    println(obj.tasteFruit())
}
