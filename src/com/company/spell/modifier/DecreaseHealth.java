package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class DecreaseHealth extends Spell {
    public DecreaseHealth(String name) {
        super("Decrease Health", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getLifePoint().subValue(Properties.MAX_VALUE, 20);
    }
}
