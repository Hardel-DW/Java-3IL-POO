package com.company.creature;

import com.company.creature.stat.Armor;
import com.company.creature.stat.Damage;

public class Dragon extends Creature {

    public Dragon(String name, int lifePoint) {
        super(name, lifePoint);
        this.armor = new Armor(3);
        this.damage = new Damage(10);
    }

    @Override
    public String toString() {
        return getName() + " is a dragon with " + lifePoint.getValue() + " life points";
    }
}
