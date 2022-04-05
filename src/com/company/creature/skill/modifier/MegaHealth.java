package com.company.creature.skill.modifier;

import com.company.creature.stat.LifePoint;

public class MegaHealth extends Modifier<LifePoint> {
    public MegaHealth(String name) {
        super("Mega Health", Properties.MAX_VALUE, 20);
    }
}
