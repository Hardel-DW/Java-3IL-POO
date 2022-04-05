package com.company.creature.skill.modifier;

import com.company.creature.stat.Armor;

public class DecreaseArmor extends Modifier<Armor> {
    public DecreaseArmor(String name) {
        super("Decrease Armor", Properties.VALUE, -20);
    }
}