package week10.morning;

import java.util.*;

public class Marvel extends SuperHero {

    public Marvel(String superHeroName, String realName, String universe, ArrayList<String> powers) {
        super(superHeroName, realName, "MarvelHero", powers);
    }

    public void callAvengers(){
        System.out.println("Calling all avengers....");
    }

    //super_hero protecting by any means necessary


    @Override
    public void protect() {
        System.out.println("Super_hero protecting by any means necessary");
    }
}
