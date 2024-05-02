package week10.evening;

import week10.evening.SuperHero;

import java.util.ArrayList;

public class DCHero extends SuperHero {

    private String city;

    public DCHero(String superHeroName, String realName, ArrayList<String> powers, String city) {
        super(superHeroName, realName, powers);
        this.city = city;
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println(" with honor");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", city=" + city + "}";
    }
}
/*
    Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

 */