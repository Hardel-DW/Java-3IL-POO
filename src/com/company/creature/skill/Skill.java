package com.company.creature.skill;

import com.company.creature.Creature;

public abstract class Skill<T> {
    protected String name;
    protected T value;

    public abstract void use(Creature creature);

    public Skill(String name, T value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}
