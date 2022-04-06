package com.company.spell;

import com.company.creature.Creature;

public abstract class Spell {
    protected String name;
    protected int manaCost;
    protected Creature owner;
    protected Creature target;
    protected float manaCoefficientCost = 100;

    public void useSkill(Creature creature, Creature target) {
        this.owner = creature;
        this.target = target;

        int manaCostCalculated = calcManaCost();
        if (owner.getMana().getValue() >= manaCostCalculated) {
            owner.getMana().setValue(owner.getMana().getValue() - manaCostCalculated);
        }
    }

    private int calcManaCost() {
        return (int) (manaCost * (manaCoefficientCost / 100));
    }

    public Spell(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    public Spell(String name) {
        this(name, 0);
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

    public float getManaCoefficientCost() {
        return manaCoefficientCost;
    }

    public void setManaCoefficientCost(float manaCoefficientCost) {
        if (manaCoefficientCost < 0) {
            throw new IllegalArgumentException("Mana reduction cost cannot be negative");
        } else if (manaCoefficientCost > 100) {
            throw new IllegalArgumentException("Mana reduction cost cannot be greater than 100");
        }

        this.manaCoefficientCost = manaCoefficientCost;
    }

    @Override
    public String toString() {
        return name;
    }
}
