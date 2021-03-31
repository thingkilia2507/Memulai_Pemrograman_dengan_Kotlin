import kotlinx.coroutines.*

fun main() = runBlocking {

    // menggunakan launch()
    val jobLaunch = launch {
        // do background task here
        delay(1000L)
        print("I do something here")
    }

    println("- ${jobLaunch.isActive}")
    println("- ${jobLaunch.isCompleted}")
    println("- ${jobLaunch.isCancelled}")

    // menggunakan job()
    val job = Job()
    println(job.isActive)
    println(job.isCompleted)
    println(job.isCancelled)

    delay(2000L)
    println("-- ${jobLaunch.isActive}")
    println("-- ${jobLaunch.isCompleted}")
    println("-- ${jobLaunch.isCancelled}")

}