package com.shanesveller.falloutBuilder

data class Perk(
        val name: String,
        val rank: Int,
        val attribute: SpecialAttribute,
        val attributeRank: Int,
        val characterLevel: Int
) {
    fun isQualifiedCharacter(character: Character): Boolean {
//        val (characterLevel, strength, perception, endurance, charisma, intellect, agility, luck, existingPerks ) = character

        return character.level >= this.characterLevel
    }
}