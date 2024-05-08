package week10.evening;

import week10.evening.SuperHero;

import java.util.ArrayList;

public class MarvelHero extends SuperHero {

    public MarvelHero(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    public void callAvengers(){
        System.out.println("Calling avengers");
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println(" by any means necessary");
    }
}
/*
Create a class MarvelHero
        inherits SuperHero
        make MarvelHero

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "MarvelHero"

        create a method callAvengers()
            print: Calling all avengers

        override the protect method()
            print: super_hero protecting by any means necessary
 */