package com.shanesveller.falloutBuilder

data class Character(
        val level: Int = 1,
        val strength: Int = 1,
        val perception: Int = 1,
        val endurance: Int = 1,
        val charisma: Int = 1,
        val intellect: Int = 1,
        val agility: Int = 1,
        val luck: Int = 1,
        var perks: MutableList<Perk> = mutableListOf()
)