package com.company.creature.skill.modifier;

import com.company.creature.stat.Damage;

public class MegaDamage extends Modifier<Damage> {
    public MegaDamage(String name) {
        super("Mega Damage", Properties.VALUE, 20);
    }
}
