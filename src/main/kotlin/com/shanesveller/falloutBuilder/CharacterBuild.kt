package com.shanesveller.falloutBuilder

data class CharacterBuild(
        val character: Character,
        val levelUpChoices: List<LevelUpChoice>
) {
    fun projectedCharacter() : Character {
        return this.character.copy(
                level = projectedLevel(),
                attributes = projectedAttributes()
        )
    }

    private fun projectedLevel() : Int {
        return this.character.level + this.levelUpChoices.size
    }

    private fun projectedAttributes() : MutableMap<SpecialAttribute, Int> {
        var projected: MutableMap<SpecialAttribute, Int> = this.character.attributes.toMutableMap()

        enumValues<SpecialAttribute>().forEach {
            val applicableChoices: List<LevelUpChoice> = this.levelUpChoices.filter { choice -> choice.attributeChoice == it }

            projected[it] = this.character.attributes[it]?.plus(applicableChoices.size) ?: 1
        }

        return projected
    }
}