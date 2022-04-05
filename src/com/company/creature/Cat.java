package com.company.creature;

import com.company.creature.stat.Armor;
import com.company.creature.stat.Damage;

public class Cat extends Creature {
    public Cat(String name, int lifePoint) {
        super(name, lifePoint);
        this.armor = new Armor(5);
        this.damage = new Damage(20);
        this.canRevive = true;
    }

    @Override
    public String toString() {
        return getName() + " is a cat with " + lifePoint.getValue() + " life points and ";
    }
}
