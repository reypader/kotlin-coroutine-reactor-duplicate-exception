package com.rmpader

import kotlinx.coroutines.runBlocking

fun main() {
    println("=== Test 4: debug=on, via foo() suspend function ===")
    System.setProperty("kotlinx.coroutines.debug", "on")
    runBlocking {
        try {
            foo("Test 4: debug=on, via foo() suspend function")
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}