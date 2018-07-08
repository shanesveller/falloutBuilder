package com.shanesveller.falloutBuilder

fun newAttributeMap(initialRank: Int) : MutableMap<SpecialAttribute, Int> {
    return enumValues<SpecialAttribute>().fold(mapOf<SpecialAttribute, Int>()) { thisMap, specialAttribute -> thisMap.plus(Pair(specialAttribute, initialRank)) }.toMutableMap()
}

data class Character(
        val level: Int = 1,
        var attributes: MutableMap<SpecialAttribute, Int> = newAttributeMap(1),
        var perks: MutableList<Perk> = mutableListOf()
)