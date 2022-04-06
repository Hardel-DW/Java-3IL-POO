package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;

public class MegaDamage extends Spell {
    public MegaDamage(String name) {
        super("Mega damage", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(20);
    }
}
