package com.shanesveller.falloutBuilder

data class Perk(
        val name: String,
        val rank: Int,
        val attribute: SpecialAttribute,
        val attributeRank: Int,
        val characterLevel: Int
) {
    fun isQualifiedCharacter(character: Character): Boolean {
        val (characterLevel, specialAttributes, existingPerks) = character

        val levelQualifies = characterLevel >= this.characterLevel

        val specialQualifies = when(specialAttributes[this.attribute]) {
            in this.attributeRank.rangeTo(10) -> true
            else -> false
        }

        val notDuplicate = !existingPerks.contains(this)

        return levelQualifies && specialQualifies && notDuplicate
    }
    }
}