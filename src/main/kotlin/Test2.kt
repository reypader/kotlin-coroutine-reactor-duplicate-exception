package com.rmpader

import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.runBlocking

fun main() {
    println("=== Test 2: debug=on, direct bar() call ===")
    System.setProperty("kotlinx.coroutines.debug", "on")
    runBlocking {
        try {
            bar("Test 2: debug=on, direct bar() call").awaitSingle()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}