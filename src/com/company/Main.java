package com.company;

import com.company.creature.Cat;
import com.company.creature.Creature;
import com.company.creature.Dragon;
import com.company.creature.skill.Skill;
import com.company.creature.skill.damage.Fireball;

public class Main {

    public static void main(String[] args) {
        Creature cat = new Cat("Grochat", 20);
        Creature dragonNoir = new Dragon("Dragon Noir", 30);

        Fireball fireball = new Fireball("Fireball");
        cat.addSkill(fireball);

        while (cat.isAlive()) {
            System.out.println("------------------");
            System.out.println(cat);
            System.out.println(dragonNoir);
            dragonNoir.attack(cat);
            System.out.println(cat);
            System.out.println(dragonNoir);
        }
    }
}
