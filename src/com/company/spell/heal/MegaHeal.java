package com.company.spell.heal;

import com.company.creature.Creature;
import com.company.spell.Spell;

public class MegaHeal extends Spell {
    public MegaHeal(String name) {
        super("Healing", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.heal(20);
    }
}