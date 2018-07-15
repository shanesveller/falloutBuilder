package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

object CharacterBuildSpec : Spek({
    given("a new character build") {
        val character = Character(1)
        val build = CharacterBuild(character, listOf())

        it("projects no changes to character") {
            assertEquals(character, build.projectedCharacter())
        }
    }

    given("a build that improves attributes") {
        val character = Character(1)
        val choice = LevelUpChoice(2, LevelUpType.SPECIAL, SpecialAttribute.STRENGTH, null)
        val build = CharacterBuild(character, listOf(choice))

        it("projects changes to character") {
            assertNotEquals(character, build.projectedCharacter())
        }

        it("projects level changes to character") {
            assertEquals(character.level + 1, build.projectedCharacter().level)
        }

        it("projects attribute changes to character") {
            assertEquals(character.attributes[SpecialAttribute.STRENGTH]?.plus(1), build.projectedCharacter().attributes[SpecialAttribute.STRENGTH])
        }

        given("a build that improves attributes repeatedly") {
            val choice2 = LevelUpChoice(3, LevelUpType.SPECIAL, SpecialAttribute.STRENGTH, null)
            val build = CharacterBuild(character, listOf(choice, choice2))

            it("projects changes to character") {
                assertNotEquals(character, build.projectedCharacter())
            }

            it("projects level changes to character") {
                assertEquals(character.level + 2, build.projectedCharacter().level)
            }

            it("projects attribute changes to character") {
                assertEquals(character.attributes[SpecialAttribute.STRENGTH]?.plus(2), build.projectedCharacter().attributes[SpecialAttribute.STRENGTH])
            }
        }

        given("a build that improves several attributes") {
            val choice2 = LevelUpChoice(3, LevelUpType.SPECIAL, SpecialAttribute.PERCEPTION, null)
            val build = CharacterBuild(character, listOf(choice, choice2))

            it("projects changes to character") {
                assertNotEquals(character, build.projectedCharacter())
            }

            it("projects level changes to character") {
                assertEquals(character.level + 2, build.projectedCharacter().level)
            }

            it("projects attribute changes to character") {
                assertEquals(character.attributes[SpecialAttribute.STRENGTH]?.plus(1), build.projectedCharacter().attributes[SpecialAttribute.STRENGTH])
                assertEquals(character.attributes[SpecialAttribute.PERCEPTION]?.plus(1), build.projectedCharacter().attributes[SpecialAttribute.PERCEPTION])
            }
        }
    }
})
