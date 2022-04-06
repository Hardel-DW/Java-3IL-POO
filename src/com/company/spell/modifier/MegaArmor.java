package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class MegaArmor extends Spell {
    public MegaArmor(String name) {
        super("Mega armor", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getArmor().addValue(Properties.VALUE, 20);
    }
}
