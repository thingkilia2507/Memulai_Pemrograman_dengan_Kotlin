import kotlinx.coroutines.*

suspend fun getCapital(){
    delay(1000L)
}

suspend fun getIncome() {
    delay(1000L)
}

fun main() = runBlocking {
    val capital = async { getCapital()}
    val income = async { getIncome()}
    println("Your profit is ${income.await()} - ${capital.await()}")

}
