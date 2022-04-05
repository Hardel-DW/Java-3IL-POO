package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class MegaArmor extends Skill {
    public MegaArmor(String name) {
        super("Mega armor", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.getArmor().addValue(Properties.VALUE, 20);
    }
}
