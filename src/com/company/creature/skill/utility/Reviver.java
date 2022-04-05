package com.company.creature.skill.utility;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public class Reviver extends Skill<boolean> {

    public Reviver(String name, boolean value) {
        super("Reviver", true);
    }

    @Override
    public void use(Creature creature) {
        creature.setCanRevive(value);
    }
}
