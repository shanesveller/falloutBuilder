package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFalse

object CharacterSpec : Spek({
    given("a new character") {
        val character = Character()

        given("a character with a different level") {
            val otherCharacter = Character(level = 2)

            it("should compare level") {
                assertFalse { character == otherCharacter }
            }
        }

        // Can this be templated?
        given("a character with a different stat") {
            val otherCharacter = Character(strength = 2)

            it("should compare stats") {
                assertFalse { character == otherCharacter }
            }
        }
    }
})
