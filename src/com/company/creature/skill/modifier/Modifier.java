package com.company.creature.skill.modifier;

import com.company.creature.Creature;
import com.company.creature.stat.Stat;
import com.company.creature.skill.Skill;

public abstract class Modifier<T extends Stat> extends Skill<int> {

    protected Properties properties;
    protected T modifier;

    public Modifier(String name, Properties properties, int value) {
        super(name, value);
        this.properties = properties;
    }

    @Override
    public void use(Creature creature) {
        switch (properties) {
            case VALUE -> modifier.setValue(modifier.getValue() + this.value);
            case MAX_VALUE -> modifier.setMaxValue(modifier.getMaxValue() + this.value);
            case MIN_VALUE -> modifier.setMinValue(modifier.getMinValue() + this.value);
        }
    }
}
