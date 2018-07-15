package com.shanesveller.falloutBuilder

val PerkList = setOf(
        Perk("Action Boy/Action Girl", 1, SpecialAttribute.AGILITY, 5, 1), // There's no time to waste! Action Points regenerate 25% faster.
        Perk("Action Boy/Action Girl", 2, SpecialAttribute.AGILITY, 5, 18), // Your Action Points now regenerate 50% faster.
        Perk("Action Boy/Action Girl", 3, SpecialAttribute.AGILITY, 5, 38), // Your Action Points now regenerate 75% faster.
        Perk("Adamantium Skeleton", 1, SpecialAttribute.ENDURANCE, 7, 1), // "Your skeleton has been infused with indestructible metal\, reducing limb damage by 30%."
        Perk("Adamantium Skeleton", 2, SpecialAttribute.ENDURANCE, 7, 13), // Your limb damage is now reduced by 60%.
        Perk("Adamantium Skeleton", 3, SpecialAttribute.ENDURANCE, 7, 26), // Your limb damage is completely eliminated.
        Perk("Animal Friend", 1, SpecialAttribute.CHARISMA, 5, 1), // "Commune with beasts! With your gun\, aim at any animal below your level and gain a chance to pacify it."
        Perk("Animal Friend", 2, SpecialAttribute.CHARISMA, 5, 12), // "When you successfully pacify an animal\, you can incite it to attack"
        Perk("Animal Friend", 3, SpecialAttribute.CHARISMA, 5, 28), // "When you successfully pacify an animal\, you can give it specific commands"
        Perk("Aquaboy / Aquagirl", 1, SpecialAttribute.ENDURANCE, 5, 1), // "Water is your ally. You no longer take radiation damage from swimming\, and can breathe underwater."
        Perk("Aquaboy / Aquagirl", 2, SpecialAttribute.ENDURANCE, 5, 21), // You become totally undetectable while submerged.
        Perk("Armorer", 1, SpecialAttribute.STRENGTH, 3, 1), // Protect yourself from the dangers of the Wasteland with access to base level and Rank 1 armor mods.
        Perk("Armorer", 2, SpecialAttribute.STRENGTH, 3, 13), // You gain access to Rank 2 armor mods.
        Perk("Armorer", 3, SpecialAttribute.STRENGTH, 3, 25), // You gain access to Rank 3 armor mods.
        Perk("Armorer", 4, SpecialAttribute.STRENGTH, 3, 39), // You gain access to Rank 4 armor mods.
        Perk("Attack Dog", 1, SpecialAttribute.CHARISMA, 4, 1), // "Your faithful canine companion can hold an enemy\, giving you a greater chance to hit them in V.A.T.S."
        Perk("Attack Dog", 2, SpecialAttribute.CHARISMA, 4, 9), // "When your dog holds an enemy\, there's a chance he'll cripple the limb he's biting."
        Perk("Attack Dog", 3, SpecialAttribute.CHARISMA, 4, 25), // "When your dog holds an enemy\, there's a chance he'll cause them to bleed."
        Perk("Attack Dog", 4, SpecialAttribute.CHARISMA, 4, 31), // "When adventuring with your dog\, you take 10% less damage."
        Perk("Awareness", 1, SpecialAttribute.PERCEPTION, 3, 1), // "To defeat your enemies\, know their weaknesses! You can view a target's specific damage resistances in V.A.T.S."
        Perk("Awareness", 2, SpecialAttribute.PERCEPTION, 3, 14), // Knowing their weaknesses lets you attack more efficiently. 5% increase to hit chance and damage dealt to VATS targets.
        Perk("Basher", 1, SpecialAttribute.STRENGTH, 8, 1), // Get up close and personal! Gun bashing does 25% more damage.
        Perk("Basher", 2, SpecialAttribute.STRENGTH, 8, 5), // Gun bashing now does 50% more damage and possibly cripples your opponent.
        Perk("Basher", 3, SpecialAttribute.STRENGTH, 8, 14), // Gun bashing now does 75% more damage and has an increased chance to cripple your opponent.
        Perk("Basher", 4, SpecialAttribute.STRENGTH, 8, 26), // Gun bashing does double damage and has an increased chance to cripple your opponent. It may also inflict a Critical Hit.
        Perk("Better Criticals", 1, SpecialAttribute.LUCK, 6, 1), // Advanced training for enhanced combat effectiveness! Criticals do 50% more extra damage.
        Perk("Better Criticals", 2, SpecialAttribute.LUCK, 6, 15), // Your criticals now do twice as much extra damage.
        Perk("Better Criticals", 3, SpecialAttribute.LUCK, 6, 40), // Your criticals now do 2.5x as much extra damage.
        Perk("Big Leagues", 1, SpecialAttribute.STRENGTH, 2, 1), // Swing for the fences! Do 20% more melee weapon damage.
        Perk("Big Leagues", 2, SpecialAttribute.STRENGTH, 2, 7), // You now do 40% more melee weapon damage and gain a chance to disarm your opponent.
        Perk("Big Leagues", 3, SpecialAttribute.STRENGTH, 2, 15), // You now do 60% more melee weapon damage and gain an increased chance to disarm your opponent.
        Perk("Big Leagues", 4, SpecialAttribute.STRENGTH, 2, 27), // You now do 80% more melee weapon damage and hit all targets in front of you.
        Perk("Big Leagues", 5, SpecialAttribute.STRENGTH, 2, 42), // "You now do double damage with a melee weapon\, and gain a chance to cripple your opponent\, or grand slam their head clean off!"
        Perk("Blacksmith", 1, SpecialAttribute.STRENGTH, 4, 1), // Fire up the forge and gain access to base level and Rank 1 melee weapon mods.
        Perk("Blacksmith", 2, SpecialAttribute.STRENGTH, 4, 16), // You gain access to Rank 2 melee weapon mods.
        Perk("Blacksmith", 3, SpecialAttribute.STRENGTH, 4, 29), // You gain access to Rank 3 melee weapon mods.
        Perk("Blitz", 1, SpecialAttribute.AGILITY, 9, 1), // Find the gap and make the tackle! V.A.T.S. melee distance is increased significantly.
        Perk("Blitz", 2, SpecialAttribute.AGILITY, 9, 29), // "V.A.T.S. melee distance is increased even more\, and the farther the Blitz distance\, the greater the damage."
        Perk("Bloody Mess", 1, SpecialAttribute.LUCK, 3, 1), // +5% bonus damage means enemies will sometimes explode into a gory red paste. Watch out for flying eyeballs!
        Perk("Bloody Mess", 2, SpecialAttribute.LUCK, 3, 9), // You now inflict +10% damage in combat.
        Perk("Bloody Mess", 3, SpecialAttribute.LUCK, 3, 31), // You now inflict +15% damage in combat.
        Perk("Bloody Mess", 4, SpecialAttribute.LUCK, 3, 47), // "When an enemy explodes\, nearby enemies may suffer the same fate."
        Perk("Cannibal", 1, SpecialAttribute.ENDURANCE, 8, 1), // Feast on mortal flesh to heal your wounds! Eating human corpses restores Health.
        Perk("Cannibal", 2, SpecialAttribute.ENDURANCE, 8, 19), // Eating Ghoul or Super Mutant corpses restores Health.
        Perk("Cannibal", 3, SpecialAttribute.ENDURANCE, 8, 38), // "Eating human\, Ghoul or Super Mutant corpses now restores a significant amount of Health."
        Perk("Cap Collector", 1, SpecialAttribute.CHARISMA, 1, 1), // You've mastered the art of the deal! Buying and selling prices at vendors are better.
        Perk("Cap Collector", 2, SpecialAttribute.CHARISMA, 1, 20), // Buying and selling prices of vendors are now much better.
        Perk("Cap Collector", 3, SpecialAttribute.CHARISMA, 1, 41), // You can now invest a total of 500 caps to raise a store's buying capacity.
        Perk("Chem Resistant", 1, SpecialAttribute.ENDURANCE, 4, 1), // All the rush without the hassle! You're 50% less likely to get addicted when consuming Chems
        Perk("Chem Resistant", 2, SpecialAttribute.ENDURANCE, 4, 22), // You gain complete immunity to chem addiction.
        Perk("Chemist", 1, SpecialAttribute.INTELLIGENCE, 7, 1), // Any chems you take last 50% longer. Far out.
        Perk("Chemist", 2, SpecialAttribute.INTELLIGENCE, 7, 16), // Any chems you take now last twice as long.
        Perk("Chemist", 3, SpecialAttribute.INTELLIGENCE, 5, 32), // Any chems you take now last an additional 150% longer.
        Perk("Chemist", 4, SpecialAttribute.INTELLIGENCE, 5, 45), // Any chems you take now last an additional 200% longer.
        Perk("Commando", 1, SpecialAttribute.AGILITY, 2, 1), // Rigorous combat training means automatic weapons do 20% more damage
        Perk("Commando", 2, SpecialAttribute.AGILITY, 2, 11), // "Attacks with automatic weapons do 40% more damage\, with improved hip fire accuracy."
        Perk("Commando", 3, SpecialAttribute.AGILITY, 2, 21), // Attacks with automatic weapons do 60% more damage. Hip fire accuracy is improved even more.
        Perk("Commando", 4, SpecialAttribute.AGILITY, 2, 35), // Attacks with automatic weapons do 80% more damage and gain a chance to stagger opponents.
        Perk("Commando", 5, SpecialAttribute.AGILITY, 2, 49), // Your automatic weapons now do double damage and have a greater chance to stagger opponents.
        Perk("Concentrated Fire", 1, SpecialAttribute.PERCEPTION, 10, 1), // Stay Focused! In V.A.T.S every attack on the same body part gains +10% accuracy.
        Perk("Concentrated Fire", 2, SpecialAttribute.PERCEPTION, 10, 26), // In V.A.T.S every attack on the same body part gains +15% accuracy.
        Perk("Concentrated Fire", 3, SpecialAttribute.PERCEPTION, 10, 50), // In V.A.T.S every attack on the same body part gains +20% accuracy and does 20% more damage.
        Perk("Critical Banker", 1, SpecialAttribute.LUCK, 7, 1), // "You're a patient battlefield tactician\, and can save a Critical Hit\, to be used in V.A.T.S. when you need it most."
        Perk("Critical Banker", 2, SpecialAttribute.LUCK, 7, 17), // "You can now save 2 Critical Hits\, to be used in V.A.T.S. when you need them the most."
        Perk("Critical Banker", 3, SpecialAttribute.LUCK, 7, 43), // "You can now save 3 Critical Hits\, to be used in V.A.T.S. when you need them the most. Banking a Critical has a chance to save an additional Critical."
        Perk("Critical Banker", 4, SpecialAttribute.LUCK, 7, 50), // "You can now save 4 Critical Hits\, to be used in V.A.T.S. when you need them the most."
        Perk("Demolition Expert", 1, SpecialAttribute.PERCEPTION, 5, 1), // "The bigger the boom\, the better! Your explosives do 25% more damage\, and you can craft explosives at any chemistry station."
        Perk("Demolition Expert", 2, SpecialAttribute.PERCEPTION, 5, 10), // "Your explosives do 50% more damage\, and grenades gain a throwing arc."
        Perk("Demolition Expert", 3, SpecialAttribute.PERCEPTION, 5, 22), // Your explosives do 75% more damage and affect a larger area.
        Perk("Demolition Expert", 4, SpecialAttribute.PERCEPTION, 5, 34), // "Your explosives now do double damage. Mines and grenades shot in V.A.T.S explode for double damage\, too."
        Perk("Fortune Finder", 1, SpecialAttribute.LUCK, 1, 1), // You find more bottle caps in containers.
        Perk("Fortune Finder", 2, SpecialAttribute.LUCK, 1, 5), // You find even more bottle caps in containers.
        Perk("Fortune Finder", 3, SpecialAttribute.LUCK, 1, 25), // You find even more bottle caps in containers.
        Perk("Fortune Finder", 4, SpecialAttribute.LUCK, 1, 40), // "You find even more bottle caps in containers\, and there is a chance of enemies exploding into a shower of caps when you kill them."
        Perk("Four Leaf Clover", 1, SpecialAttribute.LUCK, 9, 1), // Feeling Lucky? You should! Each hit in V.A.T.S. has a chance of filling your Critical meter.
        Perk("Four Leaf Clover", 2, SpecialAttribute.LUCK, 9, 13), // Each hit in V.A.T.S. now has an even better chance of filling your Critical meter.
        Perk("Four Leaf Clover", 3, SpecialAttribute.LUCK, 9, 32), // Each hit in V.A.T.S. now has a very good chance of filling your Critical meter.
        Perk("Four Leaf Clover", 4, SpecialAttribute.LUCK, 9, 48), // Each hit in V.A.T.S. now has an excellent chance of filling your Critical meter.
        Perk("Ghoulish", 1, SpecialAttribute.ENDURANCE, 9, 1), // "Sure\, you're still human - on the outside! Radiation now regenerates your lost Health."
        Perk("Ghoulish", 2, SpecialAttribute.ENDURANCE, 9, 24), // Radiation now regenerates even more of your lost Health.
        Perk("Ghoulish", 3, SpecialAttribute.ENDURANCE, 9, 48), // "Radiation now regenerates even more of your lost Health\, and some Feral Ghouls will randomly become friendly."
        Perk("Ghoulish", 4, SpecialAttribute.ENDURANCE, 9, 50), // "Rad damage will now begin to slowly heal\, restoring health in the process."
        Perk("Grim Reaper's Sprint", 1, SpecialAttribute.LUCK, 8, 1), // Death becomes you! Any kill in V.A.T.S. has a 15% chance to restore all Action Points.
        Perk("Grim Reaper's Sprint", 2, SpecialAttribute.LUCK, 8, 19), // Any kill in V.A.T.S. now has a 25% chance to restore all Action Points.
        Perk("Grim Reaper's Sprint", 3, SpecialAttribute.LUCK, 8, 46), // Any kill in V.A.T.S. has a 35% chance to restore all Action Points and refill your Critical meter.
        Perk("Gun Fu", 1, SpecialAttribute.AGILITY, 10, 1), // You've learned to apply ancient martial arts to gunplay! Do 25% more damage to your second V.A.T.S. target and beyond.
        Perk("Gun Fu", 2, SpecialAttribute.AGILITY, 10, 26), // In V.A.T.S. you do 50% more damage to your third target and beyond.
        Perk("Gun Fu", 3, SpecialAttribute.AGILITY, 10, 50), // In V.A.T.S. you instantly do a Critical Hit against your fourth target and beyond.
        Perk("Gun Nut", 1, SpecialAttribute.INTELLIGENCE, 3, 1), // You gain access to base level and Rank 1 gun mods
        Perk("Gun Nut", 2, SpecialAttribute.INTELLIGENCE, 3, 13), // You gain access to Rank 2 gun mods
        Perk("Gun Nut", 3, SpecialAttribute.INTELLIGENCE, 3, 25), // You gain access to Rank 3 gun mods
        Perk("Gun Nut", 4, SpecialAttribute.INTELLIGENCE, 3, 39), // You gain access to Rank 4 gun mods
        Perk("Gunslinger", 1, SpecialAttribute.AGILITY, 1, 1), // Channel the spirit of the old west! Non-automatic pistols do 20% more damage.
        Perk("Gunslinger", 2, SpecialAttribute.AGILITY, 1, 7), // Non-automatic pistols now do 40% more damage and have increased range.
        Perk("Gunslinger", 3, SpecialAttribute.AGILITY, 1, 15), // Non-automatic pistols now do 60% more damage and range is increased even further.
        Perk("Gunslinger", 4, SpecialAttribute.AGILITY, 1, 27), // Non-automatic pistols now do 80% more damage and their attacks can disarm opponents.
        Perk("Gunslinger", 5, SpecialAttribute.AGILITY, 1, 42), // "Non-automatic pistols now do double damage. Their attacks have a much better chance to disarm opponents\, and may even cripple a limb."
        Perk("Hacker", 1, SpecialAttribute.INTELLIGENCE, 4, 1), // Knowledge of cutting-edge computer encryption allows you to hack Advanced terminals
        Perk("Hacker", 2, SpecialAttribute.INTELLIGENCE, 4, 9), // You can hack Expert terminals.
        Perk("Hacker", 3, SpecialAttribute.INTELLIGENCE, 4, 21), // You can hack Master terminals.
        Perk("Hacker", 4, SpecialAttribute.INTELLIGENCE, 4, 33), // "When hacking\, you never get locked out of a terminal when things go wrong."
        Perk("Heavy Gunner", 1, SpecialAttribute.STRENGTH, 5, 1), // "Thanks to practice and conditioning\, heavy guns do 20% more damage."
        Perk("Heavy Gunner", 2, SpecialAttribute.STRENGTH, 5, 11), // "Heavy guns now do 40% more damage\, and have improved hip fire accuracy."
        Perk("Heavy Gunner", 3, SpecialAttribute.STRENGTH, 5, 21), // Heavy guns now do 60% more damage. Hip fire accuracy is increased even more.
        Perk("Heavy Gunner", 4, SpecialAttribute.STRENGTH, 5, 35), // Heavy guns now do 80% more damage and have a chance to stagger your opponent.
        Perk("Heavy Gunner", 5, SpecialAttribute.STRENGTH, 5, 47), // Heavy guns now do double damage.
        Perk("Idiot Savant", 1, SpecialAttribute.LUCK, 5, 1), // "You're not stupid! Just... different. Randomly receive 3x XP from any action\, and the lower your Intelligence\, the greater the chance."
        Perk("Idiot Savant", 2, SpecialAttribute.LUCK, 5, 11), // "You now randomly receive 5x XP from any action. The lower your Intelligence\, the greater the chance."
        Perk("Idiot Savant", 3, SpecialAttribute.LUCK, 5, 34), // "Randomly receiving bonus XP from any action may trigger 3x XP for all kills for a short period of time. The lower your Intelligence\, the greater the chance."
        Perk("Inspirational", 1, SpecialAttribute.CHARISMA, 8, 1), // "Because you lead by example\, your companion does more damage in combat\, and cannot hurt you."
        Perk("Inspirational", 2, SpecialAttribute.CHARISMA, 8, 19), // "Your companion resists more damage in combat\, and can't be harmed by your attacks."
        Perk("Inspirational", 3, SpecialAttribute.CHARISMA, 8, 43), // Your companion can carry more items.
        Perk("Intimidation", 1, SpecialAttribute.CHARISMA, 10, 1), // "Time to show everyone who's boss! With your gun\, aim at any human opponent below your level and gain a chance to pacify them."
        Perk("Intimidation", 2, SpecialAttribute.CHARISMA, 10, 23), // "When you successfully pacify someone\, you can incite them to attack."
        Perk("Intimidation", 3, SpecialAttribute.CHARISMA, 10, 50), // "When you successfully pacify someone\, you can give them specific commands."
        Perk("Iron Fist", 1, SpecialAttribute.STRENGTH, 1, 1), // Channel your chi to unleash devastating fury! Punching attacks do 20% more damage to your opponent.
        Perk("Iron Fist", 2, SpecialAttribute.STRENGTH, 1, 9), // Punching attacks now do 40% more damage and can disarm your opponent.
        Perk("Iron Fist", 3, SpecialAttribute.STRENGTH, 1, 18), // Punching attacks now do 60% more damage. Unarmed Power Attacks have a chance to cripple one of your opponent's limbs.
        Perk("Iron Fist", 4, SpecialAttribute.STRENGTH, 1, 31), // Punching attacks now do 80% more damage. Unarmed Power Attacks have an increased chance to cripple one of your opponent's limbs.
        Perk("Iron Fist", 5, SpecialAttribute.STRENGTH, 1, 46), // Punching attacks now do double damage. Criticals in V.A.T.S. will paralyze your opponent.
        Perk("Lady Killer / Black Widow", 1, SpecialAttribute.CHARISMA, 2, 1), // "You're charming... and dangerous. Men/Women suffer +5% damage in combat\, and are easier to persuade in dialogue."
        Perk("Lady Killer / Black Widow", 2, SpecialAttribute.CHARISMA, 2, 7), // "Men/Women now suffer +10% damage in combat\, and are even easier to persuade in dialogue. They are also easier to pacify with the Intimidation perk."
        Perk("Lady Killer / Black Widow", 3, SpecialAttribute.CHARISMA, 2, 22), // "Men/Women now suffer +15% damage in combat\, and are much easier to persuade in dialogue. They are now even easier to pacify with the Intimidation perk."
        Perk("Lead Belly", 1, SpecialAttribute.ENDURANCE, 2, 1), // Your digestive tract has adjusted to the weirdness of the Wasteland! Take less radiation from eating or drinking.
        Perk("Lead Belly", 2, SpecialAttribute.ENDURANCE, 2, 6), // You take even less radiation from eating or drinking.
        Perk("Lead Belly", 3, SpecialAttribute.ENDURANCE, 2, 17), // You take no radiation from eating or drinking.
        Perk("Lifegiver", 1, SpecialAttribute.ENDURANCE, 3, 1), // You embody wellness! Instantly gain +20 maximum Health.
        Perk("Lifegiver", 2, SpecialAttribute.ENDURANCE, 3, 8), // You instantly gain another +20 maximum Health.
        Perk("Lifegiver", 3, SpecialAttribute.ENDURANCE, 3, 20), // "You instantly gain another +20 maximum Health\, and slowly regenerate lost Health."
        Perk("Local Leader", 1, SpecialAttribute.CHARISMA, 6, 1), // "As the ruler everyone turns to\, you are able to establish supply lines between your workshop settlements."
        Perk("Local Leader", 2, SpecialAttribute.CHARISMA, 6, 14), // You can build stores and workstations at workshop settlements.
        Perk("Locksmith", 1, SpecialAttribute.PERCEPTION, 4, 1), // Your nimble fingers allow you to pick advanced locks.
        Perk("Locksmith", 2, SpecialAttribute.PERCEPTION, 4, 7), // You can pick Expert locks.
        Perk("Locksmith", 3, SpecialAttribute.PERCEPTION, 4, 18), // You can pick Master locks.
        Perk("Locksmith", 4, SpecialAttribute.PERCEPTION, 4, 41), // Your bobby pins never break during lockpicking.
        Perk("Lone Wanderer", 1, SpecialAttribute.CHARISMA, 3, 1), // "Who needs friends\, anyway? When adventuring without a companion\, you take 15% less damage and carry weight increases by 50."
        Perk("Lone Wanderer", 2, SpecialAttribute.CHARISMA, 3, 17), // "When adventuring without a companion\, you take 30% less damage and carry weight increases by 100"
        Perk("Lone Wanderer", 3, SpecialAttribute.CHARISMA, 3, 40), // "When adventuring without a companion\, you do 25% more damage."
        Perk("Lone Wanderer", 4, SpecialAttribute.CHARISMA, 3, 50), // "When adventuring without a companion\, you have 25 more action points."
        Perk("Medic", 1, SpecialAttribute.INTELLIGENCE, 2, 1), // "Is there a doctor in the house? Stimpaks restore 40% of lost Health\, and RadAway removes 40% of radiation."
        Perk("Medic", 2, SpecialAttribute.INTELLIGENCE, 2, 18), // "Stimpaks restore 60% of lost Health\, and RadAway removes 60% of radiation"
        Perk("Medic", 3, SpecialAttribute.INTELLIGENCE, 2, 30), // "Stimpaks restore 80% of lost Health\, and RadAway removes 80% of radiation"
        Perk("Medic", 4, SpecialAttribute.INTELLIGENCE, 2, 49), // "Stimpaks and RadAway restore all lost health and radiation\, and work much more quickly."
        Perk("Mister Sandman", 1, SpecialAttribute.AGILITY, 4, 1), // "As an agent of death\, you can instantly kill a sleeping person. Your silenced weapons do an additional 15% sneak attack damage."
        Perk("Mister Sandman", 2, SpecialAttribute.AGILITY, 4, 17), // Your silenced weapons do an additional 30% sneak attack damage.
        Perk("Mister Sandman", 3, SpecialAttribute.AGILITY, 4, 30), // Your silenced weapons now do 50% more sneak attack damage.
        Perk("Moving Target", 1, SpecialAttribute.AGILITY, 6, 1), // They can't hurt what they can't hit! Get 25+ Damage Resistance and 25+ Energy Resistance when you're sprinting.
        Perk("Moving Target", 2, SpecialAttribute.AGILITY, 6, 24), // You now get +50 Damage Resistance and +50 Energy Resistance when you're sprinting.
        Perk("Moving Target", 3, SpecialAttribute.AGILITY, 6, 44), // Sprinting costs 50% fewer Action Points.
        Perk("Mysterious Stranger", 1, SpecialAttribute.LUCK, 4, 1), // "Who is he? Why does he help? Who cares! The Mysterious Stranger will appear occasionally in V.A.T.S. to lend a hand\, with deadly efficiency..."
        Perk("Mysterious Stranger", 2, SpecialAttribute.LUCK, 4, 22), // The Mysterious Stranger appears more often in V.A.T.S.
        Perk("Mysterious Stranger", 3, SpecialAttribute.LUCK, 4, 41), // "The Mysterious Stranger appears more often in V.A.T.S. When he kills an opponent\, there is a chance your Critical meter gets filled."
        Perk("Mysterious Stranger", 4, SpecialAttribute.LUCK, 4, 49), // "The Mysterious Stranger appears more often in V.A.T.S. When he kills an opponent\, there is a high chance your Critical meter gets filled."
        Perk("Nerd Rage!", 1, SpecialAttribute.INTELLIGENCE, 10, 1), // "Genius. Is. ANGRY! When your Health drops below 20%\, time slows and you gain +20 Damage resistance and do 20% more damage while the effect lasts."
        Perk("Nerd Rage!", 2, SpecialAttribute.INTELLIGENCE, 10, 31), // You now gain 30 more Damage Resistance and do 30% more damage while Nerd Rage is in effect.
        Perk("Nerd Rage!", 3, SpecialAttribute.INTELLIGENCE, 10, 50), // You now gain 40 more Damage Resistance and do 40% more damage while Nerd Rage is in effect. Kills you make while enraged restore some lost Health.
        Perk("Night Person", 1, SpecialAttribute.PERCEPTION, 6, 1), // You are a creature of the night! Gain +2 to Intelligence and Perception between the hours of 6:00 p.m. and 6:00 a.m.
        Perk("Night Person", 2, SpecialAttribute.PERCEPTION, 6, 25), // "You now have +3 to Intelligence and Perception between the hours of 6:00 p.m. and 6:00 a.m.\, and night vision when sneaking."
        Perk("Night Person", 3, SpecialAttribute.PERCEPTION, 6, 37), // You have 30 extra health between the hours of 6:00 PM and 6:00 AM.
        Perk("Ninja", 1, SpecialAttribute.AGILITY, 7, 1), // "Trained as a shadow warrior\, your ranged sneak attack do 2.5x normal damage and your melee attacks do 4x normal damage."
        Perk("Ninja", 2, SpecialAttribute.AGILITY, 7, 16), // Your ranged sneak attacks do 3x normal damage and your melee sneak attacks do 5x normal damage.
        Perk("Ninja", 3, SpecialAttribute.AGILITY, 7, 33), // Your ranged sneak attacks do 3.5x normal damage and your melee sneak attacks do 10x normal damage.
        Perk("Nuclear Physicist", 1, SpecialAttribute.INTELLIGENCE, 9, 1), // You've learned to split the atom... and command it. Radiation weapons do 50% more damage and Fusion Cores last an extra 25% longer.
        Perk("Nuclear Physicist", 2, SpecialAttribute.INTELLIGENCE, 9, 14), // Radiation weapons now do double damage and Fusion Cores last an extra 50% longer.
        Perk("Nuclear Physicist", 3, SpecialAttribute.INTELLIGENCE, 9, 26), // Fusion Cores can be ejected from Power Armor like devastating grenades and Fusion Cores last twice as long.
        Perk("Pain Train", 1, SpecialAttribute.STRENGTH, 10, 1), // "Choo Choo! All aboard! While wearing Power Armor,sprinting into enemies hurts and staggers them. (Robots and oversized enemies are immune to the stagger.)"
        Perk("Pain Train", 2, SpecialAttribute.STRENGTH, 10, 24), // Sprinting into enemies while wearing Power Armor now causes severe damage and a more powerful stagger. (Robots and oversized enemies are immune to the stagger.)
        Perk("Pain Train", 3, SpecialAttribute.STRENGTH, 10, 50), // Sprinting into enemies while wearing Power Armor now causes massive damage and knocks them down. Impact landing near enemies inflicts even more damage.
        Perk("Party Boy / Party Girl", 1, SpecialAttribute.CHARISMA, 7, 1), // Nobody has a good time like you! There's no chance you'll get addicted to alcohol.
        Perk("Party Boy / Party Girl", 2, SpecialAttribute.CHARISMA, 7, 15), // The effects of alcohol are doubled.
        Perk("Party Boy / Party Girl", 3, SpecialAttribute.CHARISMA, 7, 37), // Your Luck is increased by 3 while you're under the influence of alcohol.
        Perk("Penetrator", 1, SpecialAttribute.PERCEPTION, 9, 1), // "There's no place to hide! In V.A.T.S you can target an enemy's body parts that are blocked by cover\, with a decrease in accuracy."
        Perk("Penetrator", 2, SpecialAttribute.PERCEPTION, 9, 28), // "In V.A.T.S when you target an enemy's body parts that are blocked by cover\, there is no decrease in accuracy."
        Perk("Pickpocket", 1, SpecialAttribute.PERCEPTION, 1, 1), // Your quick hands and sticky fingers make picking pockets 25% easier.
        Perk("Pickpocket", 2, SpecialAttribute.PERCEPTION, 1, 6), // Picking pockets is now 50% easier. You can place a live grenade in a person's inventory.
        Perk("Pickpocket", 3, SpecialAttribute.PERCEPTION, 1, 17), // "Picking pockets is now 75% easier\, and you can steal equipped weapons."
        Perk("Pickpocket", 4, SpecialAttribute.PERCEPTION, 1, 30), // "Picking pockets is now twice as easy\, and you can steal equipped items."
        Perk("Quick Hands", 1, SpecialAttribute.AGILITY, 8, 1), // "In combat\, there's no time to hesitate. You can reload all guns faster."
        Perk("Quick Hands", 2, SpecialAttribute.AGILITY, 8, 28), // Reloading guns costs no Action Points in V.A.T.S.
        Perk("Quick Hands", 3, SpecialAttribute.AGILITY, 8, 40), // Quick and efficient. You gain 10 additional Action Points.
        Perk("Rad Resistant", 1, SpecialAttribute.ENDURANCE, 6, 1), // "Exposure to the Wasteland has made you more resilient\, instantly granting +10 Radiation Resistance."
        Perk("Rad Resistant", 2, SpecialAttribute.ENDURANCE, 6, 13), // You now have +20 Radiation Resistance.
        Perk("Rad Resistant", 3, SpecialAttribute.ENDURANCE, 6, 26), // You now have +30 Radiation Resistance.
        Perk("Rad Resistant", 4, SpecialAttribute.ENDURANCE, 6, 35), // You now have +40 Radiation Resistance.
        Perk("Refractor", 1, SpecialAttribute.PERCEPTION, 7, 1), // You must be part mirror! Instantly gain +10 Energy Resistance.
        Perk("Refractor", 2, SpecialAttribute.PERCEPTION, 7, 11), // You now have +20 Energy Resistance.
        Perk("Refractor", 3, SpecialAttribute.PERCEPTION, 7, 21), // You now have +30 Energy Resistance.
        Perk("Refractor", 4, SpecialAttribute.PERCEPTION, 7, 35), // You now have +40 Energy Resistance.
        Perk("Refractor", 5, SpecialAttribute.PERCEPTION, 7, 42), // You now have +50 Energy Resistance.
        Perk("Ricochet", 1, SpecialAttribute.LUCK, 10, 1), // "What goes around comes around! Any enemy's ranged attacks will sometimes ricochet back and instantly kill them. The closer you are to death\, the higher the chance."
        Perk("Ricochet", 2, SpecialAttribute.LUCK, 10, 29), // There's an increased chance that an enemy's shot will ricochet back and kill them.
        Perk("Ricochet", 3, SpecialAttribute.LUCK, 10, 50), // "When an enemy's shot ricochets back and kills them\, there is a chance your Critical meter gets filled."
        Perk("Rifleman", 1, SpecialAttribute.PERCEPTION, 2, 1), // Keep your distance long and your kill-count high. Attacks with non-automatic rifles do 20% more damage
        Perk("Rifleman", 2, SpecialAttribute.PERCEPTION, 2, 9), // Attacks with non-automatic rifles do 40% more damage and ignore 15% of a target's armor.
        Perk("Rifleman", 3, SpecialAttribute.PERCEPTION, 2, 18), // Attacks with non-automatic rifles do 60% more damage and ignore 20% of a target's armor.
        Perk("Rifleman", 4, SpecialAttribute.PERCEPTION, 2, 31), // Attacks with non-automatic rifles do 80% more damage and ignore 25% of a target's armor. They also have a slight chance of crippling a limb.
        Perk("Rifleman", 5, SpecialAttribute.PERCEPTION, 2, 46), // Attacks with non-automatic rifles do double damage and ignore 30% of a target's armor. They also have a slightly higher chance of crippling a limb.
        Perk("Robotics Expert", 1, SpecialAttribute.INTELLIGENCE, 8, 1), // "Machines will always serve humans\, if you have anything to say about it. Hack a robot\, and gain a chance to power it on or off\, or initiate a self-destruct."
        Perk("Robotics Expert", 2, SpecialAttribute.INTELLIGENCE, 8, 19), // "When you successfully hack a robot\, you can incite it to attack."
        Perk("Robotics Expert", 3, SpecialAttribute.INTELLIGENCE, 8, 44), // "When you successfully hack a robot\, you can give it specific commands."
        Perk("Rooted", 1, SpecialAttribute.STRENGTH, 9, 1), // "You're part tree! While standing still\, you gain +25 Damage Resistance and your melee and unarmed attacks deal 25% more damage."
        Perk("Rooted", 2, SpecialAttribute.STRENGTH, 9, 22), // "While standing still\, you now gain +50 Damage Resistance and your melee and unarmed attacks deal 50% more damage."
        Perk("Rooted", 3, SpecialAttribute.STRENGTH, 9, 43), // "While standing still\, you may automatically disarm enemies that use melee weapons against you."
        Perk("Science!", 1, SpecialAttribute.INTELLIGENCE, 6, 1), // Take full advantage of advanced technology with access to base level and Rank 1 high-tech mods.
        Perk("Science!", 2, SpecialAttribute.INTELLIGENCE, 6, 17), // You gain access to Rank 2 high-tech mods.
        Perk("Science!", 3, SpecialAttribute.INTELLIGENCE, 6, 28), // You gain access to Rank 3 high-tech mods.
        Perk("Science!", 4, SpecialAttribute.INTELLIGENCE, 6, 41), // You gain access to Rank 4 high-tech mods.
        Perk("Scrapper", 1, SpecialAttribute.INTELLIGENCE, 5, 1), // "Waste not\, want not! You can salvage uncommon components like screws\, aluminum\, and copper when scrapping weapons and armor."
        Perk("Scrapper", 2, SpecialAttribute.INTELLIGENCE, 5, 23), // "You can salvage rare components like circuitry\, nuclear material\, and fiber optics when scrapping weapons and armor. Items with favorited components are highlighted."
        Perk("Scrapper", 3, SpecialAttribute.INTELLIGENCE, 5, 40), // You get more from salvaging.
        Perk("Scrounger", 1, SpecialAttribute.LUCK, 2, 1), // You find more ammunition in containers.
        Perk("Scrounger", 2, SpecialAttribute.LUCK, 2, 7), // You find even more ammunition in containers.
        Perk("Scrounger", 3, SpecialAttribute.LUCK, 2, 24), // You find even more ammunition in containers.
        Perk("Scrounger", 4, SpecialAttribute.LUCK, 2, 37), // There is a chance to gain ammo when firing the last round in your magazine.
        Perk("Sneak", 1, SpecialAttribute.AGILITY, 3, 1), // "Become whisper\, become shadow. You are 20% harder to detect while sneaking."
        Perk("Sneak", 2, SpecialAttribute.AGILITY, 3, 5), // "You are now 30% harder to detect while sneaking\, and no longer trigger floor-based traps."
        Perk("Sneak", 3, SpecialAttribute.AGILITY, 3, 12), // "You are now 40% harder to detect while sneaking\, and no longer trigger enemy mines."
        Perk("Sneak", 4, SpecialAttribute.AGILITY, 3, 23), // "You are now 50% harder to detect while sneaking\, and running no longer adversely affects stealth."
        Perk("Sneak", 5, SpecialAttribute.AGILITY, 3, 38), // Engaging stealth causes distant enemies to lose you.
        Perk("Sniper", 1, SpecialAttribute.PERCEPTION, 8, 1), // It's all about focus. You have improved control and can hold your breath longer when aiming with scopes.
        Perk("Sniper", 2, SpecialAttribute.PERCEPTION, 8, 13), // "Non-automatic\, scoped rifles have a chance of knocking down your target. Chance is 15%"
        Perk("Sniper", 3, SpecialAttribute.PERCEPTION, 8, 26), // "Non-automatic\, scoped rifles gain +25% accuracy to head shot in V.A.T.S."
        Perk("Solar Powered", 1, SpecialAttribute.ENDURANCE, 10, 1), // Catch some rays! Gain +2 to Strength and Endurance between the hours of 6:00a.m. and 6:00p.m.
        Perk("Solar Powered", 2, SpecialAttribute.ENDURANCE, 10, 27), // Sunlight slowly heals your radiation damage.
        Perk("Solar Powered", 3, SpecialAttribute.ENDURANCE, 10, 50), // Sunlight slowly regenerates your lost Health.
        Perk("Steady Aim", 1, SpecialAttribute.STRENGTH, 7, 1), // Stay on target! Hip-fire accuracy is improved when firing any gun.
        Perk("Steady Aim", 2, SpecialAttribute.STRENGTH, 7, 28), // Hip-fire accuracy is improved even more when firing any gun.
        Perk("Steady Aim", 3, SpecialAttribute.STRENGTH, 7, 49), // Hip-fire damage is improved when firing any gun.
        Perk("Strong Back", 1, SpecialAttribute.STRENGTH, 6, 1), // "What are you\, part pack mule? Gain +25 to carry weight"
        Perk("Strong Back", 2, SpecialAttribute.STRENGTH, 6, 10), // You now have +50 to carry weight.
        Perk("Strong Back", 3, SpecialAttribute.STRENGTH, 6, 20), // "When overencumbered\, you can use Action Points to run."
        Perk("Strong Back", 4, SpecialAttribute.STRENGTH, 6, 30), // "When overencumbered\, you can fast travel."
        Perk("Strong Back", 5, SpecialAttribute.STRENGTH, 6, 40), // "When overencumbered\, running costs 50% less action points."
        Perk("Toughness", 1, SpecialAttribute.ENDURANCE, 1, 1), // "If nothing else\, you can take a beating! Instantly gain +10 Damage Resistance"
        Perk("Toughness", 2, SpecialAttribute.ENDURANCE, 1, 9), // You now have +20 damage resistance.
        Perk("Toughness", 3, SpecialAttribute.ENDURANCE, 1, 18), // You now have +30 damage resistance.
        Perk("Toughness", 4, SpecialAttribute.ENDURANCE, 1, 31), // You now have +40 damage resistance.
        Perk("Toughness", 5, SpecialAttribute.ENDURANCE, 1, 46), // You now have +50 damage resistance.
        Perk("V.A.N.S.", 1, SpecialAttribute.INTELLIGENCE, 1, 1), // Let Vault-Tec guide you! The path to your closest quest target is displayed in V.A.T.S.
        Perk("V.A.N.S.", 2, SpecialAttribute.INTELLIGENCE, 1, 36), // Gain +2 to Perception.
        Perk("Wasteland Whisperer", 1, SpecialAttribute.CHARISMA, 9, 1), // "Master the post-apocalypse! With your gun\, aim at any Wasteland creature below your level and gain a chance to pacify it."
        Perk("Wasteland Whisperer", 2, SpecialAttribute.CHARISMA, 9, 21), // "When you successfully pacify a creature\, you can incite it to attack."
        Perk("Wasteland Whisperer", 3, SpecialAttribute.CHARISMA, 9, 49) // "When you successfully pacify a creature\, you can give it specific commands."
)
