package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class DecreaseArmor extends Spell {
    public DecreaseArmor(String name) {
        super("Decrease Armor", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getArmor().subValue(Properties.MAX_VALUE, 20);
    }
}
