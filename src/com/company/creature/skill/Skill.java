package com.company.creature.skill;

import com.company.creature.Creature;

public abstract class Skill {
    protected String name;
    protected int manaCost;
    protected Creature owner;
    protected Creature target;

    public void useSkill(Creature creature, Creature target) {
        this.owner = creature;
        this.target = target;

        if (creature.getMana().getValue() >= manaCost) {
            creature.getMana().setValue(creature.getMana().getValue() - manaCost);
        }
    }

    public Skill(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    @Override
    public String toString() {
        return name;
    }
}
