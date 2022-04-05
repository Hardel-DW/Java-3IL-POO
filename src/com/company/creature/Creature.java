package com.company.creature;

import com.company.creature.skill.Skill;
import com.company.creature.stat.*;

import java.util.List;

public abstract class Creature {
    protected String name;
    protected LifePoint lifePoint;
    protected Damage damage;
    protected Armor armor;
    protected Mana mana;
    protected List<Skill> skills;
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
        if (skillIndex >= 0 && skillIndex < skills.size()) {
            Skill skill = skills.get(skillIndex);
            skill.useSkill(this, target);
        }
    }

    // Skills
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill   skill) {
        skills.add(skill);
    }

    public void removeSkill(Skill skill) {
        skills.remove(skill);
    }

    public Skill getSkill(int index) {
        return skills.get(index);
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
