package com.shanesveller.falloutBuilder

fun newAttributeMap(initialRank: Int): MutableMap<SpecialAttribute, Int> {
    return enumValues<SpecialAttribute>().fold(mapOf<SpecialAttribute, Int>()) { thisMap, specialAttribute -> thisMap.plus(Pair(specialAttribute, initialRank)) }.toMutableMap()
}

data class Character(
        val level: Int = 1,
        var attributes: MutableMap<SpecialAttribute, Int> = newAttributeMap(1),
        var perks: MutableSet<Perk> = mutableSetOf()
) {
    fun addPerk(perk: Perk) {
        when (perk) {
            in PerkList -> when {
                perk.isQualifiedCharacter(this) -> this.perks.add(perk)
                else -> throw IllegalArgumentException("This character is not qualified for this perk")
            }
            else -> throw IllegalArgumentException("This perk does not exist in game")
        }
    }

    fun isValid(): Boolean {
        return this.level >= 1 && this.attributes.size == 7 && this.perks.all { it.isValid() }
    }
}