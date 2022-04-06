package com.company.spell.utility;

import com.company.creature.Creature;
import com.company.spell.Spell;

public class Reviver extends Spell {

    public Reviver(String name, int cost) {
        super("Reviver", 55);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);
        target.setCanRevive(true);
    }
}
