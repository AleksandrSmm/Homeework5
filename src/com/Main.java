package com;

import com.Boss;
import com.Hero;
import com.MagicDoor;

public class Main {

    public static void main(String[] args) {

        Hero c1 = new Hero(100,70, 50  );

        System.out.println(c1.damage + c1.health + c1.hit);




        Boss b = new Boss();
        b.setHealth(300);
        b.setDamage(327);
        b.setProtection(324);
        b.changeDefence();
        System.out.println("Protect " + b.getProtection());
        System.out.println(b.getHealth() + " " + b.getDamage() + " " + b.getProtection());

        MagicDoor mD = new MagicDoor();
        System.out.println(mD.generate());




    }
}
