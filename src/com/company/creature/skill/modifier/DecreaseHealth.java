package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class DecreaseHealth extends Skill {
    public DecreaseHealth(String name) {
        super("Decrease Health", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getLifePoint().subValue(Properties.MAX_VALUE, 20);
    }
}
