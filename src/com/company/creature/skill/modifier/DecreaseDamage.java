package com.company.creature.skill.modifier;

import com.company.creature.stat.Damage;

public class DecreaseDamage extends Modifier<Damage> {
    public DecreaseDamage(String name) {
        super("Decrease Damage", Properties.VALUE, -20);
    }
}
