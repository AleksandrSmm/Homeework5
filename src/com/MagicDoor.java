package com;

import com.Hero;

public class MagicDoor {

    public Hero[] generate () {
        Hero hero1 = new Hero(250,20,50);
        Hero hero2 = new Hero(250,20,50);
        Hero hero3 = new Hero(250,20,50);
        Hero hero4 = new Hero(250,20,50);
        Hero[]heroesArray ={hero1,hero2,hero3,hero4};
        return heroesArray;
    }
}