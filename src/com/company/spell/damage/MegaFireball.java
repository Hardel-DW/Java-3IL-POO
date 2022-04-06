package com.company.spell.damage;

import com.company.creature.Creature;
import com.company.spell.Spell;

public class MegaFireball extends Spell {
    public MegaFireball(String name) {
        super("Mega Fireball", 100);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(100);
    }
}