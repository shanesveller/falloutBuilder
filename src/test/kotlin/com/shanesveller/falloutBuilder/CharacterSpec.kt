package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse

object CharacterSpec : Spek({
    given("a new character") {
        val character = Character()

        it("supports validation") {
            assert(character.isValid())
        }

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

        on("a new, valid, qualified perk") {
            val perk = Perk("Cap Collector", 1, SpecialAttribute.CHARISMA, 1, 1)

            it("can add the perk") {
                character.addPerk(perk)
            }
        }

        on("a new, valid, unqualified perk") {
            val perk = Perk("Cap Collector", 2, SpecialAttribute.CHARISMA, 1, 20)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }

        on("a new, invalid, qualified perk") {
            val perk = Perk("Iron Fist", 9, SpecialAttribute.STRENGTH, 1, 1)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }

        on("a new, invalid, unqualified perk") {
            val perk = Perk("Iron Fist", 9, SpecialAttribute.STRENGTH, 1, 46)

            it("cannot add the perk") {
                assertFailsWith(IllegalArgumentException::class) { character.addPerk(perk) }
            }
        }

        on("a multi-rank perk") {
            val perks = listOf<Perk>(
                    Perk("Cap Collector", 1, SpecialAttribute.CHARISMA, 1, 1), // You've mastered the art of the deal! Buying and selling prices at vendors are better.
                    Perk("Cap Collector", 2, SpecialAttribute.CHARISMA, 1, 20), // Buying and selling prices of vendors are now much better.
                    Perk("Cap Collector", 3, SpecialAttribute.CHARISMA, 1, 41) // You can now invest a total of 500 caps to raise a store's buying capacity.
            )
            it("can add the first perk") {
                val highLevelCharacter = Character(41)

                println(highLevelCharacter)
                highLevelCharacter.addPerk(perks[0])
            }

            it("cannot add the later perks") {
                val highLevelCharacter = Character(41)
                println(highLevelCharacter)

                for (i in 1 until perks.size) {
                    assertFailsWith(IllegalArgumentException::class) { highLevelCharacter.addPerk(perks[i]) }
                }
            }

            it("can add perks sequentially") {
                val highLevelCharacter = Character(41)
                println(highLevelCharacter)

                for (i in 0 until perks.size) {
                    highLevelCharacter.addPerk(perks[i])
                }
            }
        }
    }
})
