package com.company.creature;

import com.company.creature.skill.Skill;
import com.company.creature.stat.Armor;
import com.company.creature.stat.Damage;
import com.company.creature.stat.LifePoint;
import com.company.creature.stat.Stat;

import java.util.List;

public abstract class Creature {
    protected String name;
    protected LifePoint lifePoint;
    protected Damage damage;
    protected Armor armor;
    protected List<Skill<?>> skills;
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

        if (realDamage > 0) {
            int newLifePoint = lifePoint.getValue() - realDamage;

            if (newLifePoint < 0)
                lifePoint.setValue(0);
            else
                lifePoint.setValue(lifePoint.getValue() - realDamage);

        } else {
            System.out.println("No damage");
        }

        if (lifePoint.getValue() <= 0 && canRevive) {
            lifePoint.setValue(lifePoint.getInitialValue());
            this.canRevive = false;
        }
    }

    public void heal(int healValue) {
        if ((lifePoint.getValue() + healValue) > lifePoint.getMaxValue()) {
            lifePoint.setValue(lifePoint.getMaxValue() + healValue);
        } else {
            lifePoint.setValue(lifePoint.getValue());
        }
    }

    public boolean isAlive() {
        return lifePoint.getValue() > 0 || canRevive;
    }

    // Skills
    public List<Skill<?>> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill<?>> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill<?> skill) {
        skills.add(skill);
    }

    public void removeSkill(Skill<?> skill) {
        skills.remove(skill);
    }

    public Skill<?> getSkill(int index) {
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
}
