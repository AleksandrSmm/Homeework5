package com;

import java.util.Random;

public class Boss {

    private int health;
    private int damage;
    private int protection;


    public Boss() {
    }

    public Boss(int h, int d, int p) {
        this.setHealth(h);
        this.setDamage(d);
        this.setProtection(p);
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;



    }
    public  void  changeDefence() {
        Random m = new Random();
        int randM = m.nextInt(324) + 100;
        protection = randM;


    }
}
