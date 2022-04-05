package com.company.creature.skill.modifier;

import com.company.creature.stat.Armor;

public class MegaArmor extends Modifier<Armor> {
    public MegaArmor(String name) {
        super("Mega Armor", Properties.VALUE, 20);
    }
}
