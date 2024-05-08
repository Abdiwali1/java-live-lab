package week10.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class World {
    public static void main(String[] args) {

        ArrayList<String> spiderManPowers = new ArrayList<>(Arrays.asList("Enhanced strength", "agility","spider-sense"));

        MarvelHero spiderMan = new MarvelHero("Spider Man", "Peter Parker", spiderManPowers);

        MarvelHero ironMan = new MarvelHero("Iron Man", "Tony Stark", new ArrayList<>(Arrays.asList(
                "powered suit of armor", "flight", "enhanced strength"
        )));

        System.out.println(spiderMan);
        System.out.println(ironMan);

        spiderMan.protect();
        ironMan.callAvengers();

        // MarvelHero is a SuperHero -> TRUE
        // ArrayList is a SuperHero -> FALSE it should be: SuperHero has a ArrayList

        DCHero wonderWoman = new DCHero("Wonder Woman", "Diana Pierce", new ArrayList<>(Arrays.asList("Enhanced strength", "speed", "agility", "durability")), "Star City");

        System.out.println(wonderWoman);

        ArrayList<MarvelHero> marvelHeroes = new ArrayList<>();
        marvelHeroes.add(spiderMan);
        marvelHeroes.add(ironMan);
        marvelHeroes.add(new MarvelHero("Thor", "Thor Odinson", new ArrayList<>(Arrays.asList("wields hammer", "controls lightning", "flight"))));

        // get the names of all the marvel heros that can fly

        for(MarvelHero eachHero : marvelHeroes){
            if(eachHero.getPowers().contains("flight")){
                System.out.println(eachHero.getSuperHeroName());
            }
        }

        // also remove the heros that have flight
        //marvelHeroes.removeIf(p -> p.getPowers().contains("flight"));

        marvelHeroes.removeIf(p -> p.getSuperHeroName().charAt(0) < 'P');

        System.out.println(marvelHeroes);


    }
}
/*
    data:
    spider man, peter parker, Marvel, powers: Enhanced strength, agility, and spider-sense
    iron man, tony stark, Marvel, powers: powered suit of armor, flight, enhanced strength
    thor, thor odinson, Marvel, powers: wields hammer, controls lightning, flight
    wonder woman, diana prince, DC, powers: Enhanced strength, speed, agility, durability
    batman, bruce wayne, DC, powers: master detective, martial arts, technical tools
    superman, clark kent, DC, powers: super strength, speed, invulnerability, flight
 */