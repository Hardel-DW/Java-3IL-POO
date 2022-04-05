package com.company.creature.skill.damage;

import com.company.creature.Creature;
import com.company.creature.skill.Skill;

public class MegaFireball extends Skill {
    public MegaFireball(String name) {
        super("Mega Fireball", 100);
    }

    @Override
    public void useSkill(Creature creature, Creature target) {
        super.useSkill(creature, target);

        target.sufferDamage(100);
    }
}