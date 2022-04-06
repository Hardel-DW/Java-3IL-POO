package com.company.spell.modifier;

import com.company.creature.Creature;
import com.company.spell.Spell;
import com.company.creature.stat.Properties;

public class DecreaseMana extends Spell {
    public DecreaseMana(String name) {
        super("Decrease Mana", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getMana().subValue(Properties.VALUE, 20);
    }
}
