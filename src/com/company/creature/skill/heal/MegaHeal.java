package com.company.creature.skill.heal;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public class MegaHeal extends Skill {
    public MegaHeal(String name) {
        super("Healing", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.heal(20);
    }
}