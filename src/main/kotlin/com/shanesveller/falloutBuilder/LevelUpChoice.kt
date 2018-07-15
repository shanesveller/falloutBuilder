package com.shanesveller.falloutBuilder

enum class LevelUpType {
    PERK,
    SPECIAL
}

data class LevelUpChoice(
        val level: Int,
        val boostType: LevelUpType,
        val attributeChoice: SpecialAttribute?,
        val perkChoice: Perk?
)
