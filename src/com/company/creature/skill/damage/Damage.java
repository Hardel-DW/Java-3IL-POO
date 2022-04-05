package com.company.creature.skill.damage;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public abstract class Damage extends Skill<int> {

    public Damage(String name, int value) {
        super(name, value);
    }

    @Override
    public void use(Creature creature) {
        creature.sufferDamage(this.getValue());
    }
}
