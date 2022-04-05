package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;
import com.company.creature.stat.Properties;

public class MegaDamage extends Skill {
    public MegaDamage(String name) {
        super("Mega damage", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(20);
    }
}
