package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class MegaHealth extends Skill {
    public MegaHealth(String name) {
        super("Mega Health", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getLifePoint().addValue(Properties.MAX_VALUE, 20);
    }
}
