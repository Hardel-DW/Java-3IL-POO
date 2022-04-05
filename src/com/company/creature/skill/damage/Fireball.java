package com.company.creature.skill.damage;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public class Fireball extends Skill {
    public Fireball(String name) {
        super("Fireball", 20);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(20);
    }
}