package week10.morning;

import java.util.*;

public class CheckHeros {

    public static void main(String[] args) {

        ArrayList<String> spiderPowers = new ArrayList<>(Arrays.asList("Enhanced strength", "agility", "spider-sense"));
        ArrayList<String> ironManPowers = new ArrayList<>(Arrays.asList("suit", "flight", "enhanced strength"));
        ArrayList<String> thorPowers = new ArrayList<>(Arrays.asList("wields hammer", "controls lightning", "flight"));
        ArrayList<String> wonderWomanPowers = new ArrayList<>(Arrays.asList("Enhanced strength", "speed", "agility", "durability"));
        ArrayList<String> batmanPowers = new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools"));
        ArrayList<String> superManPowers = new ArrayList<>(Arrays.asList("super strength", "speed", "invulnerability", "flight"));

        Marvel spiderMan = new Marvel("Spider-Man", "Peter Parker", "MarvelHero", spiderPowers);
        Marvel ironMan = new Marvel("Iron Man", "Tony Stark", "MarvelHero", ironManPowers);
        Marvel thor = new Marvel("Thor", "Thor Odinson", "MarvelHero", thorPowers);
        DC wonderWoman = new DC("Wonder Woman", "Diana Prince", "DC", wonderWomanPowers, "Gotham");
        DC batman = new DC("Batman", "Bruce Wayne", "DC", batmanPowers, "Gotham");
        DC superman = new DC("Superman", "Clark Kent", "DC", superManPowers, "Gotham");

        System.out.println(spiderMan.powers);
        spiderMan.protect();
        batman.protect();
        thor.callAvengers();
        System.out.println(ironMan.toString());


        System.out.println("ironMan.realName = " + ironMan.realName);
        System.out.println("ironMan.universe = " + ironMan.universe);

        System.out.println("batman.powers = " + batman.powers);
        System.out.println("wonderWoman.city = " + wonderWoman.city);
        System.out.println("superman.realName = " + superman.realName);


        // create an arraylist to add all the heros
        ArrayList<SuperHero> heros = new ArrayList<>();
        heros.add(superman);
        heros.add(spiderMan);
        heros.add(ironMan);
        heros.add(batman);
        heros.add(thor);
        heros.add(wonderWoman);


        // print all hero information
        heros.forEach(System.out::println);

        for (SuperHero hero : heros) {
            System.out.println("hero = " + hero);
        }

        // remove the heros that has superpower as "flight"
        heros.removeIf(hero -> hero.powers.contains("flight"));
        heros.forEach(System.out::println);

    }
}
