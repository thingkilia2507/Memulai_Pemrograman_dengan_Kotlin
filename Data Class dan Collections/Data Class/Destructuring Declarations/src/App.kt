data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.componentd1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}