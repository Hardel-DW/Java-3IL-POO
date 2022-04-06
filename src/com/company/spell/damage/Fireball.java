package com.company.spell.damage;

import com.company.creature.Creature;
import com.company.spell.Spell;

public class Fireball extends Spell {
    public Fireball(String name) {
        super("Fireball", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(20);
    }
}