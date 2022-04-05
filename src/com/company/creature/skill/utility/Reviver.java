package com.company.creature.skill.utility;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public class Reviver extends Skill {

    public Reviver(String name, int cost) {
        super("Reviver", 55);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);
        target.setCanRevive(true);
    }
}
