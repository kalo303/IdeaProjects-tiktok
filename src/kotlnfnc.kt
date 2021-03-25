fun main(){
    try{
        var num=100/0
        println("Beginnersbook.com")
        println(num)

    }catch (e:ArithmeticException) {
        println("ArithmeticException")
    }catch (e:Exception){
        println(e)
    }finally {
        println("it will print in any case")
    }

}