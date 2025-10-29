package com.rmpader

import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.runBlocking

fun main() {
    println("=== Test 1: debug=off, direct bar() call ===")
    System.setProperty("kotlinx.coroutines.debug", "off")
    runBlocking {
        try {
            bar("Test 1: debug=off, direct bar() call").awaitSingle()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}