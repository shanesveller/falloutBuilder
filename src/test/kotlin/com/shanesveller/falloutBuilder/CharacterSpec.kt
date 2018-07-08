package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFailsWith
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

        enumValues<SpecialAttribute>().forEach {
            given("a character with a different $it stat") {
                val otherCharacter = Character()
                otherCharacter.attributes[it] = 2

                it("should compare stats") {
                    assertFalse { character == otherCharacter }
                }
            }
        }
    }
    given("a character with no perks") {
        val character = Character()

        given("a new, valid, qualified perk") {
            val perk = Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 1, 0)

            it("can add the perk") {
                character.addPerk(perk)
            }
        }

        given("a new, valid, unqualified perk") {
            val perk = Perk("Iron Fist", 5, SpecialAttribute.STRENGTH, 1, 46)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }

        given("a new, invalid, qualified perk") {
            val perk = Perk("Iron Fist", 9, SpecialAttribute.STRENGTH, 1, 1)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }

        given("a new, invalid, unqualified perk") {
            val perk = Perk("Iron Fist", 9, SpecialAttribute.STRENGTH, 1, 46)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }
    }
})
