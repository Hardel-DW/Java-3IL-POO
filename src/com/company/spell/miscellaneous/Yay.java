package com.company.spell.miscellaneous;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class Yay extends Spell {

    public Yay(String name) {
        super(name);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        creature.getMana().setValue(Properties.VALUE, 0);

        for (Spell spell : target.getSkills()) {
            spell.setManaCoefficientCost(0);
            spell.useSkill(target, target);
        }
    }
}
