package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class DecreaseArmor extends Skill {
    public DecreaseArmor(String name) {
        super("Decrease Armor", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getArmor().subValue(Properties.MAX_VALUE, 20);
    }
}
