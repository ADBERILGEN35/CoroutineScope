package com.example.coroutinessample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            val answer = networkCall()

            withContext(Dispatchers.Main) {
                Log.v("Patika", answer)
            }
        }
        loopCall()
    }

    /**
     * Loop call
     * Infinite Loop
     */
    fun loopCall() {
        var counter = 0
        while (true) {
            println("Patika: $counter ")
            counter++
        }
    }

    /**
     * Network call
     *
     * 2 second delay
     *
     * @return String
     */
    suspend fun networkCall(): String {
        delay(2000L)
        return "Network Called"
    }
}