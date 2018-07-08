package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFalse

object PerkSpec : Spek({
    it("checks for PerkList entry") {
        assertFalse { Perk("Not a real perk", 1, SpecialAttribute.STRENGTH, 1, 1).isValid() }
    }

    given("a valid Perk") {
        val lowLevelPerk = Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 1, 1)
        val highLevelPerk = Perk("Iron Fist", 5, SpecialAttribute.STRENGTH, 1, 46)

        it("supports validation") {
            assert(lowLevelPerk.isValid())
            assert(highLevelPerk.isValid())
        }
    }

    given("an invalid Perk") {
        val lowLevelPerk = Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 1, 1)

        it("validates attribute range") {
            val tooHighPerk = Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 11, 1)

            assert(lowLevelPerk.isValid())
            assertFalse(tooHighPerk.isValid())

            val msg = "Attribute Rank must be between 1 and 10"

            assert(tooHighPerk.validationErrors().contains(msg))
            assertFalse(lowLevelPerk.validationErrors().contains(msg))
        }

        it("validates level range") {
            val tooHighPerk = Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 1, 51)

            assert(lowLevelPerk.isValid())
            assertFalse(tooHighPerk.isValid())

            val msg = "Level must be between 1 and 50"

            assert(tooHighPerk.validationErrors().contains(msg))
            assertFalse(lowLevelPerk.validationErrors().contains(msg))
        }

        it("validates perk rank") {
            val tooHighPerk = Perk("Iron Fist", 6, SpecialAttribute.STRENGTH, 1, 1)

            assert(lowLevelPerk.isValid())
            assertFalse(tooHighPerk.isValid())

            val msg = "Rank must be between 1 and 5"

            assert(tooHighPerk.validationErrors().contains(msg))
            assertFalse(lowLevelPerk.validationErrors().contains(msg))
        }
    }
})
