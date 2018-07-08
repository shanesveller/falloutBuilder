package com.shanesveller.falloutBuilder

data class Perk(
        val name: String,
        val rank: Int,
        val attribute: SpecialAttribute,
        val attributeRank: Int,
        val characterLevel: Int
)