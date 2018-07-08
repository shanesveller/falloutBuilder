package com.shanesveller.falloutBuilder

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

object PerkListSpec : Spek({
    PerkList.forEach { perk ->
        given(perk.toString()) {
            it("passes validation") {
                assert(perk.isValid())
            }
        }
    }
})
