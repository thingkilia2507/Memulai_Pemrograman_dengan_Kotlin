import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        // TODO: Implement suspending lambda here
        println("launch here")
        delay(1000L)
        println("launch delay done")
    }

    launch(Dispatchers.Default) {
        // TODO: Implement suspending lambda here
        println("Launch Default here")
        delay(1000L)
        println("LD delay done")
    }

    println("Dispatcher Default")
}