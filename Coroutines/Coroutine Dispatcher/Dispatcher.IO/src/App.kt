import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch(Dispatchers.IO) {
        // TODO: Implement algorithm here
        println("launch here")
        delay(1000L)
        println("launch delay done")
    }

    println("Dispatcher IO")
}