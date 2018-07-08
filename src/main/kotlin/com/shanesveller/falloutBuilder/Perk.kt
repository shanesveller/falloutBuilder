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

    fun isValid(): Boolean {
        val qualifiers = mutableListOf<Boolean>()

        qualifiers.add(PerkList.contains(this))

        when(this.rank) {
            in 1..5 -> qualifiers.add(true)
            else -> qualifiers.add(false)
        }

        when(this.attributeRank) {
            in 1..10 -> qualifiers.add(true)
            else -> qualifiers.add(false)
        }

        when(this.characterLevel) {
            in 1..50 -> qualifiers.add(true)
            else -> qualifiers.add(false)
        }

        return qualifiers.all { it }
    }

    override fun toString(): String {
        return "Rank $rank $name Perk"
    }

    fun validationErrors(): List<String> {
        val errors = mutableListOf<String>()

        when(this.rank) {
            !in 1..5 -> errors.add("Rank must be between 1 and 5")
        }

        when(this.attributeRank) {
            !in 1..10 -> errors.add("Attribute Rank must be between 1 and 10")
        }

        when(this.characterLevel) {
            !in 1..50 -> errors.add("Level must be between 1 and 50")
        }

        return errors.toList()
    }
}