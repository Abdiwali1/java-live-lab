package week10;

import java.util.*;

public class DC extends SuperHero {

    public String city;


    public DC(String superHeroName, String realName, String universe, ArrayList<String> powers, String city) {
        super(superHeroName, realName, "DC", powers);
        this.city = city;
    }

    @Override
    public void protect() {
        System.out.println("super_hero protecting with honor");
    }
}
