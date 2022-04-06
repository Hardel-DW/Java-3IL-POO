package com.company.creature;

import com.company.spell.Spell;
import com.company.creature.stat.*;

import java.util.List;

public abstract class Creature {
    protected String name;
    protected LifePoint lifePoint;
    protected Damage damage;
    protected Armor armor;
    protected Mana mana;
    protected List<Spell> spells;
    protected boolean canRevive = false;

    // Constructors
    public Creature(String name, int lifePoint) {
        this.name = name;
        this.lifePoint = new LifePoint(lifePoint);
    }

    // Utils methods
    public void attack(Creature creature) {
        creature.sufferDamage(damage.getValue());
        System.out.println(name + " attacks " + creature.getName() + " with " + damage + " damage");
    }

    public void sufferDamage(int damage) {
        int realDamage = damage - armor.getValue();

        if (realDamage > 0)  {
            lifePoint.subValue(Properties.VALUE, realDamage);
        }

        if (lifePoint.getValue() <= 0 && canRevive) {
            lifePoint.setValue(lifePoint.getInitialValue());
            this.canRevive = false;
        }
    }

    public void heal(int healValue) {
        lifePoint.addValue(Properties.VALUE, healValue);
    }

    public boolean isAlive() {
        return lifePoint.getValue() > 0 || canRevive;
    }

    public void useSkill(int skillIndex) {
        useSkill(skillIndex, this);
    }

    public void useSkill(int skillIndex, Creature target) {
        if (skillIndex >= 0 && skillIndex < spells.size()) {
            Spell spell = spells.get(skillIndex);
            spell.useSkill(this, target);
            spells.remove(spell);
        }
    }

    // Skills
    public List<Spell> getSkills() {
        return spells;
    }

    public void setSkills(List<Spell> spells) {
        this.spells = spells;
    }

    public void addSkill(Spell spell) {
        spells.add(spell);
    }

    public Spell getSkill(int index) {
        return spells.get(index);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanRevive() {
        return canRevive;
    }

    public void setCanRevive(boolean canRevive) {
        this.canRevive = canRevive;
    }

    public Stat getLifePoint() {
        return lifePoint;
    }

    public Stat getDamage() {
        return damage;
    }

    public Stat getArmor() {
        return armor;
    }

    public Stat getMana() {
        return mana;
    }
}
