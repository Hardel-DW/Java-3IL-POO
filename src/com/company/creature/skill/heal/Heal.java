package com.company.creature.skill.heal;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public abstract class Heal extends Skill<int> {

    public Heal(String name, int value) {
        super(name, value);
    }

    @Override
    public void use(Creature creature) {
        creature.heal(this.getValue());
    }
}
