package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class DecreaseMana extends Skill {
    public DecreaseMana(String name) {
        super("Decrease Mana", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getMana().subValue(Properties.VALUE, 20);
    }
}
