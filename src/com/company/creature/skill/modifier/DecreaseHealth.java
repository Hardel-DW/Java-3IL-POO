package com.company.creature.skill.modifier;

import com.company.creature.stat.LifePoint;

public class DecreaseHealth extends Modifier<LifePoint> {
    public DecreaseHealth(String name) {
        super("Decrease Health", Properties.MAX_VALUE, -20);
    }
}
