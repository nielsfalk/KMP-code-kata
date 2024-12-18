package de.nielsfalk.kata

import io.kotest.core.spec.style.FreeSpec
import kotlin.test.assertEquals

class PowerAssertTest : FreeSpec({
    "Power-assert with Kotest" {
        val hello = "Hello"
        val world = "world!"
        assertEquals(hello.length, world.substring(1, 4).length)
    }
})