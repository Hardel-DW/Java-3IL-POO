package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class DecreaseDamage extends Spell {
    public DecreaseDamage(String name) {
        super("Decrease Damage", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getDamage().subValue(Properties.MAX_VALUE, 20);
    }
}
