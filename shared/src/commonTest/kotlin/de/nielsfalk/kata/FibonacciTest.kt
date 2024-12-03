package de.nielsfalk.kata

import io.kotest.core.spec.style.FreeSpec
import kotlin.test.assertEquals

class FibonacciTest : FreeSpec({
    "fibonacci numbers" - {
        "get 15 numbers" {
            assertEquals(
                listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377),
                getFibonacciNumbers(15)
            )
        }
    }
})